
package bankmanagementsystem;

import javax.swing.*;// here j frame will be there
import java.awt.*; // here the font will be there
import java.awt.event.*;// for action listener
import java.util.*;// for random class

public class SignupThree extends JFrame implements ActionListener  {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno=formno;
        setLayout(null);
        
        JLabel i1= new JLabel(" Account Details");
        i1.setFont(new Font("Raleway",Font.BOLD,22));  
        i1.setBounds(280,40,400,40);
        add(i1);  
        
        JLabel type= new JLabel("Account Type");
       type.setFont(new Font("Raleway",Font.BOLD,22));  
        type.setBounds(100,90,200,30);
        add(type);  
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,130,160,20);
        add(r1);
        
        r2=new JRadioButton(" Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,130,250,20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,180,160,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,180,250,20);
        add(r4);
         
        ButtonGroup groupaccount=new ButtonGroup();// this wil use to select only one button
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
         JLabel card= new JLabel("Card Number");
       card.setFont(new Font("Raleway",Font.BOLD,22));  
        card.setBounds(100,230,200,30);
        add(card);
        
        JLabel number= new JLabel("xxxx-xxxx-xxxx-4134");
       number.setFont(new Font("Raleway",Font.BOLD,22));  
        number.setBounds(330,230,300,30);
        add(number);
        
        JLabel carddetail= new JLabel("Your 16 digit Card Number");
       carddetail.setFont(new Font("Raleway",Font.BOLD,12));  
        carddetail.setBounds(100,250,300,30);
        add(carddetail);
        
        JLabel pin= new JLabel("PIN:");
       pin.setFont(new Font("Raleway",Font.BOLD,22));  
        pin.setBounds(100,290,200,30);
        add(pin);
        
        JLabel pnumber= new JLabel("xxxx");// pnumber pin number
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));  
        pnumber.setBounds(330,290,300,30);
        add(pnumber);
        
        
         JLabel pindetail= new JLabel("Your 4 digit Card Number");
       pindetail.setFont(new Font("Raleway",Font.BOLD,12));  
        pindetail.setBounds(100,310,300,30);
        add(pindetail);
        
         JLabel services= new JLabel("Serives Required:");
       services.setFont(new Font("Raleway",Font.BOLD,22));  
        services.setBounds(100,360,200,30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,410,200,30);
        add(c1);
        
         c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,410,200,30);
        add(c2);
        
         c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,450,200,30);
        add(c3);
        
         c4=new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,450,200,30);
        add(c4);
        
         c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,490,200,30);
        add(c5);
        
         c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,490,200,30);
        add(c6);
        
         c7=new JCheckBox(": Hereby declares that the above enetered detaisl are correct to the best of my Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,550,600,30);
        add(c7);
        
        submit=new JButton("submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,620,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel=new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.addActionListener(this);
        cancel.setBounds(420,620,100,30);
        add(cancel);
        
       
         getContentPane().setBackground(Color. WHITE);
        
        setSize(850,820);
        setUndecorated(true);// the option worng ,minimize will not appear on the frame 
        setLocation(350,0);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    { 
        String accountType="";
        if(ae.getSource()==submit){
            
            if(r1.isSelected())
            {
                accountType="Saving Account";
            }
            else if(r2.isSelected())
            {
                accountType="Fixed Deposit Account";
            }
            else if(r3.isSelected())
            {
                accountType="Current Account";
            }
            else if(r4.isSelected())
            {
                accountType="Reccuring Deposit Account";
            }
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);// to generate card number// card number should be string
            
            String pinnumber=""+Math.abs((random.nextLong()%900L)+1000L);
            
            String facility="";
            if(c1.isSelected())
            {
                facility=facility+"ATM CARD";
                
            }
            else if(c2.isSelected())
            {
                facility=facility+"Interenet Banking";
            }
            else if(c3.isSelected())
            {
                facility=facility+"Mobile Banking";
            }
            else if(c4.isSelected())
            {
                facility=facility+"EMAIL & SMS Alerts";
            }
            else if(c5.isSelected())
            {
                facility=facility+"Cheque Book";
            }
            else if(c6.isSelected())
            {
                facility=facility+"E-Statement";
            }
            try{// to make the data base connectivity  we need try and catch;
               
                if(accountType.isEmpty())
                    
                {
                    JOptionPane.showMessageDialog(null,"Account Type is Required");// if he not select account type it shows acount type required a box
                }
                else {
                    Conn conn=new Conn();
                    String query1="insert into signupThree value('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String query2="insert into login value('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "card Number:"+ cardnumber+"\n  pin:"+ pinnumber);// this will show the meessage the card nmber and pin nuber
                }
                setVisible(false);
               new Deposit(pinnumber).setVisible(false);
            }
            
            catch(Exception e)
            {
                System.out.println(e);// for the 
            }
            
            
            
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
   
    public static void main(String args[]) {
      new SignupThree("");
      
    }
}
