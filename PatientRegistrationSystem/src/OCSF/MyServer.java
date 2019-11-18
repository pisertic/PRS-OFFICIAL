package OCSF;

//import theOCSF.FileHandling;
import java.io.IOException;

public class MyServer extends AbstractServer {
 
	public MyServer(int port)   { // Constructor
		super(port); 
	}
	
	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
		System.out.println("MyServer: handleMessageFromClient() RECEIVED SOMETHING FROM CLIENT");
		try {
			Objectinator object1 = (Objectinator) msg;
			System.out.println(String.format("MyServer: Client sent following message:\nKeyword: %s\nMethod Identifier: %d" , object1.getKeyword(), object1.getMethodIdentifier()));
			System.out.println("MyServer: Trying to send it back as an echo");  
			client.sendToClient(String.format("You are client %s, I am thread %s. Your original message was: %s", 
					client.getInetAddress(), client.getId(), msg ));
		
			
			System.out.println("MyServer: Done.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("MyServer: Error while sending echo back to client");
			e.printStackTrace();
		}
	} 
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub 
		MyServer MyServer1 = new MyServer(8989); // will use port 8989
		System.out.println("MyServer: MyServer1 has been created.");
		try {
			MyServer1.listen();
			System.out.println("MyServer: Server should now be running");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	} 
}
//FileHandling fh = new FileHandling();
//fh.CreateFile("Test");
//fh.WriteToFile("Testing", msg);