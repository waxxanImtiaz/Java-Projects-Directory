package jframeproject;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutManger {
       public static JFrame window = new JFrame("My window");
   
    public static void main(String[] args) {
        Toolkit tkit = window.getToolkit();
        Dimension d = tkit.getScreenSize();
        Color thiscolor = Color.GRAY;
        System.out.println("Screen Resolution is "+tkit.getScreenResolution());
        window.getContentPane().setBackground(thiscolor.darker());
        
        
       
        window.setBounds(d.width/4, d.height/4, d.width/2, d.height/2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
       
        
       
         Box layout = Box.createHorizontalBox();
         
         JButton b;
         
         for( int i = 1; i<7; i++ )
         {
             layout.add(b = new JButton( "Button "+i ));
             b.setPreferredSize(d);
             
         }
         layout.transferFocus();
         window.add(layout,BorderLayout.CENTER);
       
    }
    
}


