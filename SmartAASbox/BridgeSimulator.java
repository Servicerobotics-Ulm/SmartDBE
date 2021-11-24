package bridgesimulator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class BridgeSimulator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String hostname = "localhost";
		int inport = 6868;
		try {
			Socket insocket = new Socket(hostname, inport);
			InputStream input = insocket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			OutputStream output = insocket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			long counter = 0;
			long ii = 0;
			long r = 0;
			while (true) {
				Thread.sleep(10);
				counter++;
				String inmsg = reader.readLine();
				if (!inmsg.isEmpty()) {
					System.out.println("Got: " + inmsg);
					String Spacer = "-|-";
					String commandid = "ERROR";
					if (inmsg.contains(Spacer)) {
						commandid = inmsg.substring(0, inmsg.indexOf(Spacer));
					} else {
						System.out.println("ERROR: " + inmsg + ": Spacer[" + Spacer + "] Not Found");
					}

					String replyindicator = Spacer + commandid + Spacer;
					String outmsg = replyindicator + "MsgA" + r++;
					writer.println(outmsg);
					System.out.println("Sent: " + outmsg);
					writer.flush();

					// Optional
					Thread.sleep(100);
					String outmsgb = replyindicator + "MsgB" + r++;
					writer.println(outmsgb);
					System.out.println("Sent: " + outmsgb);
					writer.flush();
				}
				// Optional
				if (counter > 4) {
					counter = 0;
					String outmsg = "Client Says Hi ! " + ii++;
					writer.println(outmsg);
					writer.flush();
					System.out.println("Sent: " + outmsg);
				}
			}
		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}
}
