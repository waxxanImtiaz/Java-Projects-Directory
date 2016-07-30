/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframeproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.*;
public class CardLayoutTest implements ActionListener {
    public  JFrame window = new JFrame("My window");
    public  CardLayout l = new CardLayout(120,120);
       
    public void strt(){
        Toolkit tkit = window.getToolkit();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(400, 300);
        
        window.setLayout(l);
        JButton button;
        for( int i = 1; i<5; i++  )
        {
            window.getContentPane().add(button = new JButton("Button "+i),"card "+i);
            button.addActionListener(this);
            
        }
        
       
       
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
      
   }
    public static void main(String[] args) {
       CardLayoutTest t = new CardLayoutTest();
       t.strt();
    }
    public  void actionPerformed(ActionEvent e ){
        l.show(window.getContentPane(),"card 3");
    }
}
