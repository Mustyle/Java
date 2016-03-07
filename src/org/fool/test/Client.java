package org.fool.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private Socket client;

	public void client() throws Exception {
		client = new Socket("127.0.0.1", 4242);

		PrintWriter out = new PrintWriter(client.getOutputStream());

		System.out.println("Connection connected...");

		out.println("Hello Server");
		out.flush();

		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		System.out.println("Message from server: " + br.readLine());

		br.close();
	}

	public static void main(String[] args) throws Exception {
		Client c = new Client();
		c.client();
	}
}
