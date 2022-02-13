package lab;
import javax.swing.*;  
public class Text_Area_Example {
	JFrame f= new JFrame(); 
    Text_Area_Example(){  
    	JLabel r0 = new JLabel("Enter Address :"); 
        JTextArea r1 =new JTextArea(); 
        r0.setBounds(10,05,90,30);
        r1.setBounds(10,30,250,100);
        f.add(r0);
        f.add(r1);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
     public static void main(String args[]) {  
    	 new Text_Area_Example();  
     }
}  