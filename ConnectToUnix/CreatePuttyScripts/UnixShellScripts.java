package CreatePuttyScripts;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import utilities.ConnectionUtilities;
import utilities.TalkToExcel;
import utilities.customException;

public class UnixShellScripts {
	
	
	
	public static void main(String[] args) throws NumberFormatException, JSchException, customException, IOException{
		
		//Declare the input variables and get the values from the external source 
		String username=args[0];
		String hostname=args[1];
		String portnumber=args[2];
		String password=args[3];
		String datafileName=args[4];
		String shelltoExecute=args[5];
		
		//String datafileName="Mydata.xlsx";
		//String shelltoExecute="CheckCrsService";
		//String shelltoExecute="StartCrsService";
		String message=null;
		
				
		
		//Create an instance for ConnectionUtilities class;
		ConnectionUtilities connectUtil=new ConnectionUtilities();
		
		//Create an instance for TalkToExcel class;
		TalkToExcel talkToExcel=new TalkToExcel();
			
		//Create an instance for File class; 
		File fileName = new File(System.getProperty("user.dir")+"\\src\\data\\"+datafileName);	
		
		
		
		//Create a session		
		Session session=connectUtil.connectSession(username,hostname,portnumber,password);
				
		
		
		//Create a channel		
		Channel channel = null;
		
		try {
			channel=connectUtil.openChannel(session, "shell");			
		} catch (JSchException e3) {
			e3.printStackTrace();
		}
		
		//get output stream object.
		OutputStream inputstream_for_the_channel=connectUtil.getOutputStreamObject(channel);
		
		//get Print stream object . This object will convert the keyboard input characters to bytes
		PrintStream commander=connectUtil.getPrintStreamObject(inputstream_for_the_channel);
		
		channel.setOutputStream(System.out, true);
		
		
		InputStream outputstream_from_the_channel = null;
		try {
			outputstream_from_the_channel = channel.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Create a Buffered Reader object. This will take input stream object as input
		
		BufferedReader br = new BufferedReader(new InputStreamReader(outputstream_from_the_channel));
		
		//Connect the channel
		try {
			channel.connect();
		} catch (JSchException e1) {
			e1.printStackTrace();
		}
		
		//Pass the shell commands based on the shell to execute type
		switch (shelltoExecute){
			
			case "Cesadump":				
	
				
				connectUtil.CesaDumpentry(commander,channel);
				
				commander.close();
//				
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 		 
				//wait until channel reaches End of file
				 
				do {
				    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while(!channel.isEOF());
				
				
				
				//Store all the buffered reader object content in a sting.
						
				message = org.apache.commons.io.IOUtils.toString(br);
				
				try { 
				      Thread.sleep(1000);
				    } catch (Exception ee) {
				    
				    }   
				
						
				if(message.contains("logout")){
					System.out.println("success");
					talkToExcel.setExcelFile(fileName, "Data");
					TalkToExcel.setCellData("Result", 1, 2,fileName);
					TalkToExcel.setCellData("Pass", 2, 2,fileName);
					
				}else {
					
					System.out.println("fail");
					talkToExcel.setExcelFile(fileName, "Data");
					TalkToExcel.setCellData("Result", 1, 1, fileName);
					TalkToExcel.setCellData("Fail", 2, 1, fileName);
				}
				break;
				
			case "CheckCrsService":
											
				connectUtil.CheckCrsServicesEntry(commander, channel);
				
				
				commander.close();
				
							 		 
			   //wait until channel reaches End of file
			 
				do {
				    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while(!channel.isEOF());
				
				
				
						
				
				//Store all the buffered reader object content in a sting.
						
				message = org.apache.commons.io.IOUtils.toString(br);			

				
				try { 
				      Thread.sleep(1000);
				    } catch (Exception ee) {
				    
				    }   	

				System.out.println(message);
				
				
				
				//Check whether the operation is complete and write the result to excel file
				if(message.contains("No")){							
					talkToExcel.setExcelFile(fileName, "Data");
					TalkToExcel.setCellData("CRSServiceStatus", 1, 1,fileName);
					TalkToExcel.setCellData("ServiceNotRunning", 2, 1,fileName);
					
				}else {		
					talkToExcel.setExcelFile(fileName, "Data");
					TalkToExcel.setCellData("CRSServiceStatus", 1, 1,fileName);
					TalkToExcel.setCellData("ServiceAlreadyRunning", 2, 1,fileName);
				}
				
				break;
				
			case "StartCrsService":
				
				connectUtil.StartCrsServicesEntry(commander, channel);
				
				
				commander.close();
				
							 		 
			   //wait until channel reaches End of file
			 
				do {
				    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while(!channel.isEOF());
				
				//message = org.apache.commons.io.IOUtils.toString(br);
				//System.out.println(message);
				
				
				
						
				
				//Store all the buffered reader object content in a sting.
						
				message = org.apache.commons.io.IOUtils.toString(br);			

				
				try { 
				      Thread.sleep(1000);
				    } catch (Exception ee) {
				    
				    }   	

				System.out.println(message);
				
				
				
				//Check whether the operation is complete and write the result to excel file
				if(message.contains("6 processes started")){							
					System.out.println("success");
					talkToExcel.setExcelFile(fileName, "Data");
					TalkToExcel.setCellData("Result", 1, 1,fileName);
					TalkToExcel.setCellData("Pass", 2, 1,fileName);
					
				}else {		
					talkToExcel.setExcelFile(fileName, "Data");
					TalkToExcel.setCellData("Result", 1, 1,fileName);
					TalkToExcel.setCellData("Fail", 2, 1,fileName);
				}
			

		}	
		
		
			
		

		//Check whether the status is equal to 1 meaning the channel has finished its job.
		while(channel.getExitStatus()==-1) {
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		//disconnect channel object and the session object
    	channel.disconnect();
		session.disconnect();
		
			
		
	}
}	



;