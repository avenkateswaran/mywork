package com.capgemini.utm.stepdefs.jschstepdefs;

import com.capgemini.utm.helper.ScenarioContext;
import com.capgemini.utm.sftp.JSchSession;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.Session;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.ScenarioOutlineRunner;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static com.capgemini.utm.utility.DateFormatter.getFormattedTime;


public class JschStepDefs {
    private JSchSession jSchSession;
    private Session session = null;
    private ChannelSftp sftpChannel = null;

    public JschStepDefs() {
        jSchSession = new JSchSession();
    }

    @Given("^the user connects to a unix sever with hostname: \"([^\"]*)\" with username: \"([^\"]*)\", password: \"([^\"]*)\" and port number: \"([^\"]*)\"$")
    public void iConnectToUnixSeverHostnameWithUsernamePasswordAndPortNumber(String host, String username, String password, String portno) throws Throwable {
        session = jSchSession.getSession(username, host, Integer.parseInt(portno));
        session.setConfig("StrictHostKeyChecking", "no");
        session.setPassword(password);
        session.connect();
    }

    @And("^the following file: \"([^\"]*)\" is pushed to the path: \"([^\"]*)\" in the unix server$")
    public void iPushTheFollowingFileToThePathInTheUnixServer(String filename, String path) throws Throwable {
        File file = new File(filename);
        ScenarioContext.lastOriginalFilename = file;
        File copy = new File(filename + "-" + getFormattedTime());
        ScenarioContext.lastAlteredFilename = copy;
        FileUtils.moveFile(file, copy);
        sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();
        sftpChannel.put(copy.getName(), path);
        session.disconnect();
//        sftpChannel.disconnect();
//        sftpChannel.quit();
    }

    @When("^the following file: \"([^\"]*)\" is gotten from the path: \"([^\"]*)\" in the unix server$")
    public void theFollowingFileIsGottenFromThePathInTheUnixServer(String filename, String path) throws Throwable {
        sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();
        sftpChannel.get(path+filename, System.getProperty("user.dir"));
        System.out.println("Formatted Time is: " + getFormattedTime());
    }

    @Then("^confirm the original file is present in the folder path: \"([^\"]*)\" in the unix server$")
    public void confirmTheFollowingFileIsPresentInTheFolderPathInTheUnixServer(String path) throws Throwable {
        sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();
        Vector filelist = sftpChannel.ls(path);
        List<String> files = new ArrayList<String>();
        for (int i = 0; i < filelist.size(); i++) {
            ChannelSftp.LsEntry entry = (ChannelSftp.LsEntry) filelist.get(i);
            System.out.println("++++++++++++++++++++ Files present are: " + entry.getFilename());
            files.add(entry.getFilename());
        }
        System.out.println("+++++++++++++++++++++ Last altered filename is: " + ScenarioContext.lastAlteredFilename.getName());
        Assert.assertTrue(files.contains(ScenarioContext.lastAlteredFilename.getName()));
        session.disconnect();
        sftpChannel.disconnect();
        sftpChannel.quit();
    }

    @And("^then reset the filename$")
    public void thenResetTheFilename() throws Throwable {
        FileUtils.moveFile(ScenarioContext.lastAlteredFilename, ScenarioContext.lastOriginalFilename);
    }
}
