package cis457Project1;
//TEST COMMENT
import java.io.*; 
import java.net.*;
import java.util.*;
//.................
//.................


class FTPServer { 

public static void main(String args[]) throws Exception{

	String fromClient;
	String clientCommand;
	byte[] data;
	    
	ServerSocket welcomeSocket = new ServerSocket(12000);
	String frstln;
	  
	while(true) {
		Socket connectionSocket = welcomeSocket.accept();
		      
		DataOutputStream  outToClient = 
		new DataOutputStream(connectionSocket.getOutputStream());
		
		BufferedReader inFromClient = new BufferedReader(new
		InputStreamReader(connectionSocket.getInputStream()));
		
		fromClient = inFromClient.readLine();
		 
		StringTokenizer tokens = new StringTokenizer(fromClient);
		
		frstln = tokens.nextToken();
		int port = Integer.parseInt(frstln);
		clientCommand = tokens.nextToken();
			          
		if(clientCommand.equals("list:")) { 
		    Socket dataSocket = new Socket(connectionSocket.getInetAddress                                                    (), port);
		    DataOutputStream  dataOutToClient = 
		    new DataOutputStream(dataSocket.getOutputStream());
		    //..........................
			
			dataSocket.close();
			System.out.println("Data Socket closed");
		}
		
		if(clientCommand.equals("retr:")) {
	    //..............................
		//..............................
		}
		
	}
	
	//......................
	 
	
	
}
}
