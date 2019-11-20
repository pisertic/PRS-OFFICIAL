package OCSF;

import java.io.IOException;

import prsPackage.HospitalMember;

public class MyClient extends AbstractClient {

	public MyClient(String host, int port) {
		super(host, port);
	}

	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println("MyClient's handleMessageFromServer() triggered");

	}

	public Object clientRequest(String keyword, int methodIdentifier) {
		Objectinator object1 = new Objectinator(keyword, methodIdentifier);
		return object1;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		MyClient Client1 = new MyClient("localhost", 8989);
		try {
			Client1.openConnection();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("ERROR while attempting to open connection, exiting...");
			System.exit(1); // on error exit
		}

		try {
			// on close

			System.out.println(String.format("Attempting to send message to server from %s %s %s", Client1.getHost(),
					Client1.getInetAddress(), Client1.getPort()));
			Client1.sendToServer(clientRequest("Real Test", 1));

			System.out.println("Client sent message to server");
		} catch (IOException e) {
			System.out.println("MyClient ERROR: sending to server did not work...");
			e.printStackTrace();
		}
	}
}
