package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class ConnectionUtilities {
	
	
	@SuppressWarnings("unused")
	public Session connectSession(String username,String hostname,String port,String password ) throws NumberFormatException, JSchException {
		
		JSch jsch = new JSch();
		Session session = null;
		
		
		try {
			session = jsch.getSession(username,hostname, Integer.parseInt(port));
		}catch(Exception e) {
			//result=false;
			throw new utilities.customException("the session is invalid . the reasons could be as follows \n The username is invalid or the username might contain uppercase characters \n Invalid port number \n invalid or empty password \n The hostname is invalid or empty ");
		}
	//	if(session==null) {
		//	throw new utilities.customException("the seesion is invalid . the reasons could be as follows \n The username is invalid or the username might contain uppercase characters \n Invalid port number \n invalid or empty password \n The hostname is invalid or empty ");
	//	}
		session.setConfig("StrictHostKeyChecking", "no");
		session.setPassword(password); 
		session.connect();
		return session;
		
		
		
	}
	
	
	
	
	@SuppressWarnings("unused")
	public Channel openChannel(Session session,String channelType) throws utilities.customException,JSchException{
		
		Channel channel = null;
		
		try {
			channel = session.openChannel(channelType);	
		}catch(Exception e) {
			//result=false;
			throw new utilities.customException("The possible error conditions are as follows \n channel type cannot be empty. \n looks like there is no active session. the session object is empty");
		}
		
//		
		if(session.equals(null)) {
			throw new utilities.customException("looks like there is no active session. the session object is empty");
		}
				
		
		
		return channel;
		
	}
	
	
	@SuppressWarnings("unused")
	public void sendShellCommands(PrintStream commands,String shellcommands ){
		
		commands.println(shellcommands);    
	}
	
	@SuppressWarnings("unused")
	public PrintStream getPrintStreamObject(OutputStream out) throws utilities.customException,JSchException{
		
//		OutputStream inputstream_for_the_channel = null;
//		try {
//			inputstream_for_the_channel = channel.getOutputStream();
//		} catch (IOException e2) {
//			throw new utilities.customException("The possible error conditions is that the channel object is empty");
//		}
		PrintStream commander = new PrintStream(out, true);

		
		return commander;
		
	
	}
	
	@SuppressWarnings("unused")
	public OutputStream getOutputStreamObject(Channel channel) throws utilities.customException,JSchException{
		
		OutputStream inputstream_for_the_channel = null;
		try {
			inputstream_for_the_channel = channel.getOutputStream();
		} catch (IOException e2) {
			throw new utilities.customException("The possible error conditions is that the channel object is empty");
		}
		return inputstream_for_the_channel;
		
		
	
	}
	
	
	@SuppressWarnings("unused")
	public InputStream getInputStreamObject(Channel channel) throws utilities.customException, IOException{
		
		//boolean flg=false;
		InputStream outputstream_from_the_channel = null;
		
		if(channel==null) {
			System.out.println("he");
		}
		try {
			outputstream_from_the_channel = channel.getInputStream();
		}catch(IOException e2) {
			
			throw new utilities.customException(" The channel has not returned anything in response to display the output. the input stream is empty to read");
			
		}
		
		if(outputstream_from_the_channel==null) {
			System.out.println("hello");
		}
		//String result = IOUtils.toString(outputstream_from_the_channel, StandardCharsets.UTF_8);
//		BufferedReader br = new BufferedReader(new InputStreamReader(outputstream_from_the_channel));
//		//String line;
//		System.out.println(br);
//		
//		StringBuilder sb = new StringBuilder();
//		   int readByte = outputstream_from_the_channel.read();
//		   while (readByte>-1 && readByte!= '\n')
//		   {
//		      sb.append((char) readByte);
//		      readByte = outputstream_from_the_channel.read();
//		   }
//		   System.out.println(outputstream_from_the_channel.toString());
//		while(br.ready()) {
//		 for(String line = br.readLine(); line != null; line = br.readLine()) 
//			 ((Appendable) outputstream_from_the_channel).append(line);
//			  br.close();
//			System.out.println(outputstream_from_the_channel.toString());
//		}
		//return flg;
		//return outputstream_from_the_channel;
		return outputstream_from_the_channel;

		
	}
	
	
	public void CesaDumpentry(PrintStream commander,Channel channel) {
		//boolean testresultflg=true;
		String message=null;
		
		commander.println("arvind k"+"\nteam 3"+"\ntrstt"+"\ntrs tt"+"\nsu - cesadump");    
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		commander.println("1234qwer");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		commander.println("10");
		
		commander.println("exit");	
		
		commander.println("exit");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		

		
	}
	
	
	public void StartCrsServicesEntry(PrintStream commander,Channel channel) {
				
		
		
			
					
		commander.println("arvind k"+"\nteam 3"+"\ntrstt"+"\ntrs tt"+"\nsu - crs13");    
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		commander.println("1234qwer");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		commander.println("1\r"+"3\r");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		commander.println("\r"+"98\r"+"99\r");
		
		commander.println("exit\r");	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		commander.println("exit\r");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void CheckCrsServicesEntry(PrintStream commander,Channel channel) {
				
		commander.println("arvind k"+"\nteam 3"+"\ntrstt"+"\ntrs tt"+"\nsu - crs13");    
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		commander.println("1234qwer");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		commander.println("1\r"+"c\r"+"\r"+"\r"+"98\r"+"99\r");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		commander.println("exit\r");	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		commander.println("exit\r");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		 
	
		
		
		
		
		
	}
}
