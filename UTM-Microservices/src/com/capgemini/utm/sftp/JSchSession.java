package com.capgemini.utm.sftp;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class JSchSession {

    private Session session = null;
    private JSch jSch = null;

    public JSchSession(){
        jSch = new JSch();
    }

    public Session getSession(String user, String host, int portno) throws Exception{
        session = jSch.getSession(user, host, portno);
        return session;
    }

}
