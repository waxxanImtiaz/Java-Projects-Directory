/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;


import javax.swing.JFrame;
public class ClientServerTest {

	public static void main(String[] args) {
		
		Server application = new Server();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.runServer();

	}

}

