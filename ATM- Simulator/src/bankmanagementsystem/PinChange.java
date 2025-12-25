

package bankmanagementsystem;
import javax.swing.*;// for jframe
import java.awt.*;//for image class
import java.awt.event.*;
        
public class PinChange extends JFrame implements ActionListener  {
    
    JPasswordField pin,repin; //all the pin should be private it should not visible to others
    JButton change,back;
   String pinnumber;
         
    
    PinChange(String pinnumber)
    {
        this.pinnumber=pinnumber;
     

    setLayout(null);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    
    JLabel text=new JLabel("CHANGE YOUR PIN");
    text.setForeground(Color.WHITE);
    text.setFont(new Font ("System",Font.BOLD ,16));
    text.setBounds(250,280,500,35);
    image.add(text);
    
    JLabel pintext=new JLabel("NEW PIN:");
    pintext.setForeground(Color.WHITE);
    pintext.setFont(new Font ("System",Font.BOLD ,16));
    pintext.setBounds(165,320,180,25);
    image.add(pintext);
    
     pin=new JPasswordField();// pin should be paswword no others should se
    pin.setFont(new Font("Raleway",Font.BOLD,25));
    pin.setBounds(330,320,180,25);
    image.add(pin);
    
    JLabel repintext=new JLabel("Re-Enter NEW PIN:");
    repintext.setForeground(Color.WHITE);
    repintext.setFont(new Font ("System",Font.BOLD ,16));
    repintext.setBounds(165,360,180,25);
    image.add(repintext);
    
      repin=new JPasswordField();
    repin.setFont(new Font("Raleway",Font.BOLD,25));
    repin.setBounds(330,360,180,25);
    image.add(repin);
    
     change=new JButton("CHANGE");
    change.setBounds(355,485,150,30);
    change.addActionListener(this);
    image.add(change);
    
     back=new JButton("BACK");
    back.setBounds(355,520,150,30);
    back.addActionListener(this);
    image.add(back);
    
    setSize(900,900);
    setLocation(300,0);
    setUndecorated(true);
    setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
    
    if(ae.getSource()==change)
    {
    
       try{
            String npin=pin.getText();// getting pin values entered in the textField
            String  rpin=repin.getText();
            if(!npin.equals(rpin))
            {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if(npin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter PIN");
                return;
            }
            if(rpin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please re-enter new  PIN");
                return;
            }
    
            Conn c=new Conn();
            String query1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'  ";// change pin in both bank tabel sinupThree table  and login  tabe where the pin is presnet it shoudl replace in all the tables
           String query2="update login set pin='"+rpin+"' where pin='"+pinnumber+"'  ";// change pin in both bank tabel sinupThree table  and login tabe where the pin is presnet it shoudl replace in all the tables
          String query3="update signupThree set pin='"+rpin+"' where pin='"+pinnumber+"'  ";// change pin in both bank tabel sinupThree table  and login tabe where the pin is presnet it shoudl replace in all the tables

          c.s.executeUpdate(query1);
          c.s.executeUpdate(query2);
           c.s.executeUpdate(query3);
           JOptionPane.showMessageDialog(null, "PIN change Successfully");
           
           setVisible(false);
           new Transcations(rpin).setVisible(true);


       }
        catch(Exception e)
          {
            System.out.println(e);
          
           }
    }
    else{
         setVisible(false);
          new Transcations(pinnumber).setVisible(true);
        
    }
   
    
    
}
   
    public static void main(String args[]) {
       new PinChange("").setVisible(true);
    }
}
