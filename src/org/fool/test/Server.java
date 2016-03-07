package org.fool.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket ss;

	public void server() throws Exception {

		ss = new ServerSocket(4242);

		System.out.println("Server Started...");

		while (true) {
			Socket s = ss.accept();

			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			System.out.println("Request accepted from client..." + br.readLine());

			PrintWriter out = new PrintWriter(s.getOutputStream());

			String advice = "I am Server";
			out.println(advice);
			out.close();

			br.close();
		}

	}

	public static void main(String[] args) throws Exception {
		Server server = new Server();
		server.server();
	}
}
