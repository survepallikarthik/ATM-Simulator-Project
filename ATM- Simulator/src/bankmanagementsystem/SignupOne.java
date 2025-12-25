
package bankmanagementsystem;

 
import javax.swing.*; // here Jframe will there in swing 
import java.awt.*;// for color those are present in 
import java.util.*;// random class is in util folder to have unique application number
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {

    SignupOne()  // these are present in JFrame
    {  
        setLayout(null);// setBound work if setLayout keeps as null 
        Random ran=new Random();
       // System.out.println(Math.abs(ran.nextLong()% 9000L)+1000L);// this gives random 4 digit number // Math.abs for.. if it give negative it convert to possitive
        long random=Math.abs((ran.nextLong()%9000L)+1000L);
       
        JLabel formno=new JLabel("APPLICATION FORM NO: " + random);// to have unique application number we are using random function
        formno.setFont(new Font("Raleway",Font.BOLD,38)); // font family and font type and font size;
         formno.setBounds(140,20,600,40); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(formno);
         
         JLabel personalDetails=new JLabel("Page 1: Personal Details");// to have unique application number we are using random function
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22)); // font family and font type and font size;
         personalDetails.setBounds(290,80,400,40); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(personalDetails);
         
         
         JLabel name =new JLabel("Name:");// to have unique application number we are using random function
         name.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         name.setBounds(100,140,100,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(name);
         
         JTextField nameTextField=new JTextField();
         nameTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         nameTextField.setBounds(300,140,400,30);
         add(nameTextField);
         
         JLabel Fname =new JLabel("Father's Name:");// to have unique application number we are using random function
         Fname.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         Fname.setBounds(100,190,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(Fname);
         
         JTextField fTextField=new JTextField();
         fTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         fTextField.setBounds(300,190,400,30);
         add(fTextField);
         
         
         JLabel dob =new JLabel("Date of Birth:");// to have unique application number we are using random function
         dob.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         dob.setBounds(100,240,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(dob);
         
         JDateChooser dateChooser=new JDateChooser();
         dateChooser.setBounds(300,240,400,30);
         dateChooser.setForeground(Color.red);
         add(dateChooser);
         
          JLabel gender =new JLabel("Gender:");// to have unique application number we are using random function
         gender.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         gender.setBounds(100,290,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(gender);
         
         // creating radion Buttons for Gender
         
         JRadioButton male =new JRadioButton("MALE");
         male.setBounds(300,290,60,30);
         male.setBackground(Color.WHITE);
         add(male);
         
         JRadioButton female =new JRadioButton("FEMALE");
         female.setBounds(450,290,100,30);
         female.setBackground(Color.WHITE);
         add(female);
         
         
         JRadioButton other =new JRadioButton("OTHER");
         other.setBounds(630,290,100,30);
         other.setBackground(Color.WHITE);
         add(other);
         
         
         ButtonGroup gendergroup=new ButtonGroup();// to select only one option in male and female
         gendergroup.add(male);
         gendergroup.add(female);
         gendergroup.add(other);
         
         
       
         
         
         JLabel email =new JLabel("Email Address:");// to have unique application number we are using random function
         email.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         email.setBounds(100,340,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(email);
         
           JTextField emailTextField=new JTextField();
         emailTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         emailTextField.setBounds(300,340,400,30);
         add(emailTextField);
         
         
         
          JLabel marital =new JLabel("Marital status:");// to have unique application number we are using random function
         marital.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         marital.setBounds(100,390,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(marital);
         
          JRadioButton married =new JRadioButton("Married");
         married.setBounds(300,390,100,30);
         married.setBackground(Color.WHITE);
         add(married);
         
         JRadioButton unmarried =new JRadioButton("Un Married");
         unmarried.setBounds(450,390,100,30);
         unmarried.setBackground(Color.WHITE);
         add(unmarried);
         
         
         JRadioButton others =new JRadioButton("OTHER");
         others.setBounds(630,390,100,30);
         others.setBackground(Color.WHITE);
         add(others);
         
         
         ButtonGroup marritalgroups=new ButtonGroup();// to select only one option in male and female
         marritalgroups.add(married);
         marritalgroups.add(unmarried);
         marritalgroups.add(others);
         
         
       
         
         
         JLabel address =new JLabel("Address:");// to have unique application number we are using random function
         address.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         address.setBounds(100,440,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(address);
         
         JTextField addressTextField=new JTextField();
         addressTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         addressTextField.setBounds(300,440,400,30);
         add(addressTextField);
         
         JLabel city =new JLabel("City:");// to have unique application number we are using random function
         city.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         city.setBounds(100,490,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(city);
         
           JTextField ciyTextField=new JTextField();
         ciyTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         ciyTextField.setBounds(300,490,400,30);
         add(ciyTextField);
         
         
         
         JLabel state =new JLabel("State:");// to have unique application number we are using random function
         state.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         state.setBounds(100,540,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(state);
         
         JTextField stateTextField=new JTextField();
         stateTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         stateTextField.setBounds(300,540,400,30);
         add(stateTextField);
         
         
         JLabel pincode =new JLabel("PIn code:");// to have unique application number we are using random function
         pincode.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         pincode.setBounds(100,590,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(pincode);
          JTextField pinTextField=new JTextField();
         pinTextField.setFont(new Font("Ralway",Font.BOLD,14));// for font
         pinTextField.setBounds(300,590,400,30);
         add(pinTextField);
        
         JButton next =new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,640,80,20);
         add(next);
         
         
        getContentPane().setBackground(Color.WHITE);// colour prsent in awt.*;
        
        
        setSize(850,800); // frmae size
        setLocation(350,10); //from left 350,top 10;
        setVisible(true); 
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
}
