package calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
	
	
   public static void main(String args[]) {
	   
      JFrame frame = new JFrame("Motor Calculator");
      JLabel label;
      label = new JLabel("Please Choose One",JLabel.CENTER);
      label.setVerticalAlignment(JLabel.TOP);
      label.setFont(new Font("Verdana", Font.PLAIN, 15));
      label.setPreferredSize(new Dimension(250, 100));
      
      JButton rpm=new JButton("RPM");  
      rpm.setBounds(180,100,100, 40); 
		          
	  frame.add(rpm);  
	  
	  JButton Torque=new JButton("Torque");  
	  Torque.setBounds(180,170,100, 40); 
		          
	  frame.add(Torque);  
	  
	  JButton HP=new JButton("HP");  
	  HP.setBounds(180,240,100, 40); 
		          
	  frame.add(HP);  
      
     
      frame.add(label);
      frame.setSize(500,400);
      frame.setVisible(true);
      
   }
}
