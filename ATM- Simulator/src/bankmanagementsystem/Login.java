
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{

    JButton signupButton,clearButton,signinButton; // Making these buttons globally to acces any where in the another functons;
    JTextField cardTextField;  // Making the textField globally to acces any where in the another functons;
    JPasswordField pinTextField;
    Login()
    {
       
        setLayout(null);
        setTitle("AUTOMATIC TELLER MACHINE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));// to load image
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel label=new JLabel(i3);// using jlabel setiing image boundaries from left top widht heigth adujusted
        label.setBounds(70,10,100,100); //from left,from top, height,width for image
        
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,30);//left,upper ,length,widht
        text.setFont(new Font("Osward",Font.BOLD,38));//welcome  fontfamily, font type(bold), size;
        add(text);
        
        JLabel cardno=new JLabel("Card No:");
        cardno.setBounds(120,150,150,40);//left,upper ,length,widht
        cardno.setFont(new Font("RaleWay",Font.BOLD,28));//cardno (text)  font, font type(bold), size;
        add(cardno);
        
        //     this for box content
         cardTextField= new JTextField(); // for the  box content after the carno text // globally assingn the  JTextfield
         // card number can seen so JTextField; but pinTextField should not seen ..Its Privacy .. so JPasswordField
        cardTextField.setBounds(300,160,250,30);//  , height ,length, text lenght
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        //
        
        JLabel pin=new JLabel("PIN:");
        pin.setBounds(120,220,250,30);//left,upper ,length,widht
        pin.setFont(new Font("Raleway",Font.BOLD,28));//pin  fontfamily , font type(bold), size;
        add(pin);
        
        // this for box content
         pinTextField= new JPasswordField(); // for the  box content after the carno text // globally assing the JtextField;  
        pinTextField.setBounds(300,220,250,30);//  , height ,length, text lenght
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        
        add(pinTextField);
       // why pinTextField as jpaswordField .. because pin should not see by anyone ..car no should be seen but pin no one should seen;    
        //
        
        
        
        //for below buttons 
        
         signinButton=new JButton("SIGN IN");// JButton globallly declared
        signinButton.setBounds(300,300,100,30);// from left, from top, length,widht
        signinButton.setBackground(Color.BLACK);// back gronund colour
        signinButton.setForeground(Color.WHITE);// a white layer on button
        signinButton.addActionListener(this);// to have button performance
        add(signinButton);
        
        clearButton=new JButton("CLEAR");// for clear button   // JButton globallly declared
        clearButton.setBounds(450,300,100,30);// from left, from top, length,widht
        clearButton.setBackground(Color.BLACK);// back gronund colour
        clearButton.setForeground(Color.WHITE);// a white layer on button
        clearButton.addActionListener(this);//to have button performance
        add(clearButton);
         
        signupButton=new JButton("SIGN IN"); // JButton globallly declared
        signupButton.setBounds(300,350,250,30);// from left, from top, length,widht
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);// a white layer on button
        signupButton.addActionListener(this);//to have button performance
        add(signupButton);// a white layer on button
        //
         
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);// FULL INTERFACE CsOLOUER
        
        setSize(800,480); // frame size
        setVisible(true);
        setLocation(350,200); // form left and form top
    }
    
    public void actionPerformed(ActionEvent ae)
            
    {
// ActionListstener is an abstract method  so overridding here with class action performed
// this function uses for after clicking on button(signup or signin) .what should perform? this function tell
// gloabally assing the JButton and JText Fied to acces any where here in this function also
    
        
        if(ae.getSource()==clearButton)
        {
            cardTextField.setText("Correct Type chey ra");// if her in the setText making it to empyty sting .. if you enter any thing in between the strin it will print there
            pinTextField.setText("");// pintextField should not seen by anyone so it was JpasswordField
        }
        else if(ae.getSource()==signinButton)
        {
            
        }
        else if(ae.getSource()==signupButton)
        {
            
        }
        
        
    }
    public static void main(String[] args) {
        new Login();
        
    }
    
}
