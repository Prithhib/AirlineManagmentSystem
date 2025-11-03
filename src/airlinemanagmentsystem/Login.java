 package airlinemanagmentsystem;


import javax.swing.*;
import java.awt.*; //for colour
import java.awt.event.*; //add action
import java.sql.*;  //use ResultSet class
 
public class Login extends JFrame implements ActionListener{
    JButton submit, reset, close; //globlally decleared
    JTextField tfusername;
    JPasswordField tfpassword;
    public Login(){
        getContentPane().setBackground(Color.WHITE); //frame background color
        setLayout(null);
        
        
        setSize(400,250);
        setLocation(850,350);
        setVisible(true); //visible a frame
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20, 20, 100, 20); //setBounds for position of the item 
        add(lblusername); //add is use to print or display in the frame
        
        //for border-box
        tfusername = new JTextField();
        tfusername.setBounds(130,20,200,20);
        add(tfusername);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20, 60, 100, 20);
        add(lblpassword);
        
        tfpassword = new JPasswordField(); //hide details as dotted
        tfpassword .setBounds(130,60,200,20);
        add(tfpassword);
        
        
        reset = new JButton("Reset");
        reset.setBounds(40,120,120,20);
        reset.addActionListener(this);
        add(reset);
        
        submit = new JButton("Submit");
        submit.setBounds(190,120,120,20);
        submit.addActionListener(this);
        add(submit);
        
        close = new JButton("Close");
        close.setBounds(110,165,120,20);
        close.addActionListener(this);
        add(close);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String username = tfusername.getText();
            String password = tfpassword.getText();
            try{
                DBConnection c = new DBConnection();
                
                String query = "select * from login where username = '"+username+"'and password = '"+password+"' ";//extra '' because varchar(in database) only accepts strings
                ResultSet rs = c.s.executeQuery(query); //ResultSet is a class
                
                if (rs.next()){
                    new Home();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Username and Password");
                    setVisible(false);
                }
            }   catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == reset){
            tfusername.setText("");
            tfpassword.setText("");
        }else if(ae.getSource() == close){
            setVisible(false);
        }     
    }
    
    public static void main(String args[]){
        new Login();
    } 
}
    

