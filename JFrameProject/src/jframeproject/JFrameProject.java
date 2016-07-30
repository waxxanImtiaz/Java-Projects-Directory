/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframeproject;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class JFrameProject {

    public static JFrame window = new JFrame("My window");
   
    public static void main(String[] args) {
        Toolkit tkit = window.getToolkit();
        Dimension d = tkit.getScreenSize();
        Color thiscolor = Color.GRAY;
        System.out.println("Screen Resolution is "+tkit.getScreenResolution());
        window.getContentPane().setBackground(thiscolor.darker());
        JMenuBar b = new JMenuBar();
        JMenu m = new JMenu("Names");
        b.add(m);
        
        JMenuItem item = new JMenuItem("imtiaz");
        m.add(item);
        JButton button;
        window.add(b);
        b.setSize(20, 40);
        window.setBounds(d.width/4, d.height/4, d.width/2, d.height/2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        FlowLayout layout = new FlowLayout( FlowLayout.LEFT,20,10 );
        window.setLayout( layout );
        
        Font[] f = {new Font("Arial",Font.BOLD,10),new Font("Playbill",Font.PLAIN,10)};
        EtchedBorder x = new EtchedBorder( EtchedBorder.LOWERED );
        for( int i = 1; i<5; i++  )
        {
            window.getContentPane().add(button = new JButton("Button "+i));
            button.setBorder(x);
            
        }
        layout.setVgap(5);
        layout.setHgap(10);
        
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        String[] f = e.getAvailableFontFamilyNames();
//        
//        for( String c : f )
//        {
//            System.out.println(c);
//        }
        
    }
    
}
