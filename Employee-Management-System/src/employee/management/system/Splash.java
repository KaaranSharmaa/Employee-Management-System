package employee.management.system;

import javax.swing.*;// Jframe package in it it came from extended package of it
import java.awt.*;// jframe color package
import java.awt.event.*;// for click event(interface)

public class Splash extends JFrame implements ActionListener {// click event(interface)
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);//getContet paint have excess to jrfame .setbackground for white color
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");//to write somethink on frame
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);// to add it to the frame defaut not visible
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);//for click event
        image.add(clickhere);
        
        
        setSize(1170, 650);// size of frame(width,height)
        setLocation(200, 50);// use to set the location of frame(left,right)
        setVisible(true);//default not visible
        
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae) {// action listner overide function here we tell hich pagge must be opened
        setVisible(false);// after clicking on it
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}
