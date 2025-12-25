
package bankmanagementsystem;
import javax.swing.*; // here Jframe will there in swing 
import java.awt.*;// for image Class not Image Icon
import java.awt.event.*;


public class Transcations  extends JFrame implements ActionListener{
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,exit;// making all buttons globally to acees any where int the function
    String pinnumber;
    Transcations(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);// when u keep set layout null .. every text and image will work as side,upper bold  all will work accoridng to frame size;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//  1st step// to load imae
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT); // 2ND STEP;// FOR SCALING THE IMAGE TO FRAME SIZE 900,900(FRAME SIZE);
       //// directly image(class) cant be placed in frame so only with ImageIcon we can put
        ImageIcon i3=new ImageIcon(i2);// 3rd one // after Scaling the image to frame size then again sending to as new Image Icon
        
        JLabel image=new JLabel(i3);// // passing the image to jlabel to adust the boundaries
        image.setBounds(0,0,900,900);//using JLabel setting the image bounds to frame size;
        add(image);
        
        JLabel text=new JLabel("Please Select Your Trascations");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);// colour of text
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);// why? the text should come on the label
        
         deposit=new JButton("Deposit");
         deposit.setBounds(170,415,150,30);// left, upper , length,widht;   
         deposit.addActionListener(this);//adding every button for action  to get action;
         image.add(deposit);
         
          withdrawl=new JButton("Cash WithDrawl");
         withdrawl.setBounds(355,415,150,30);// left, upper , length,widht;    
         withdrawl.addActionListener(this);//adding every button for action  to get action;
         image.add(withdrawl);
         
          fastcash=new JButton("Fast Cash");
         fastcash.setBounds(170,450,150,30);// left, upper , length,widht;  
         fastcash.addActionListener(this);//adding every button for action  to get action;
         image.add(fastcash);
         
          ministatement=new JButton("Mini Statement");
         ministatement.setBounds(355,450,150,30);// left, upper , length,widht;   
        ministatement.addActionListener(this);//adding every button for action  to get action;
         image.add(ministatement);
         
          pinchange=new JButton("PIn Change");
         pinchange.setBounds(170,485,150,30);// left, upper , length,widht;
        pinchange.addActionListener(this);//adding every button for action  to get action;         
         image.add(pinchange);
         
          balanceenquiry=new JButton("Balance Enquiry");
         balanceenquiry.setBounds(355,485,150,30);// left, upper , length,widht; 
           balanceenquiry.addActionListener(this);//adding every button for action  to get action;      
         image.add(balanceenquiry);
         
           exit=new JButton("Exit");
         exit.setBounds(355,520,150,30);// left, upper , length,widht;  
         exit.addActionListener(this);//adding every button for action  to get action;
         image.add(exit);
         
        setSize(900,900); // frame size
        setLocation(300,0); // left,upper
        setUndecorated(true);// the option worng ,minimize will not appear on the frame 
        setVisible(true);// by default it will be false;
        
    
}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastcash)
        {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinchange)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balanceenquiry)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==ministatement)
        {
            
            new MiniStatement(pinnumber).setVisible(true);
                    
        }
    }
    

   
    public static void main(String args[]) {
        new Transcations("");
        
    }
}
