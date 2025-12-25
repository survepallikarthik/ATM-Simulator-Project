
package bankmanagementsystem;

import javax.swing.*;// for jframe 
import java.awt.*;// for Image class
import java.awt.event.*;// for action listener
import java.util.*; // for Date class


public class Deposit  extends JFrame implements ActionListener{
    
    
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);// the all adustments will happen when layout becomes null
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));// to get image // 1st step
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);// 2nd step// scaling the image to frame size;
        // directly image cant be placed in frame so only with ImageIcon we can put
        ImageIcon i3=new ImageIcon(i2);// 3rd step;
        JLabel image=new JLabel(i3);// passing the image to jlabel to adust the boundaries
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);
        
         amount =new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
         deposit=new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
          back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);

        image.add(back);
        
        
        
           
        
        
        
        setSize(900,900);// for frame size;
        setLocation(300,0);// for set location
        setVisible(true);
        
                
    }
    public void actionPerformed(ActionEvent ae)
    {
       
        if( ae.getSource()==deposit )
        {
           
            String number=amount.getText();
            Date date=new Date();
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null, "please enter the amout yuu want ot deposit");// if he not enter the amount the message should come as box .does he not enterd the amount
               
            }
            else{
                try{
                Conn c=new Conn();
                String query ="insert into bank values('"+pinnumber+"','"+date+"','Deposit', '"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs:"+ number+" Deposited Succesfully");
                setVisible(false);// closing the deposit frame
                new Transcations(pinnumber).setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                
            }
            
            
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transcations(pinnumber).setVisible(true);
            
        }
    }

    
    public static void main(String args[]) {
        new Deposit("");
        
    }
}
