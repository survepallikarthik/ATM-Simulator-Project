   
package bankmanagementsystem;

 

import javax.swing.*; // here Jframe will there in swing 
import java.awt.*;// for color those are present in 
import java.awt.event.*;  // for response for buttons

public class SignupTwo extends JFrame implements ActionListener{
    // making enitrely as global vairable where if we store data in text fields or radio button that should be store for databases ... because local variable can store data;
    
    JTextField pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;// the form no should pass between signupOne to Signuptwo only form no should pass


    SignupTwo(String formno)  // these are present in JFrame
    { 
        this.formno=formno;
        setLayout(null);// setBound work if setLayout keeps as null 
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
       
         JLabel additionalDetails=new JLabel(" Additonal Details");// to have unique application number we are using random function
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22)); // font family and font type and font size;
         additionalDetails.setBounds(290,80,400,40); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(additionalDetails);
         
         
         
         JLabel name =new JLabel("Religion:");// to have unique application number we are using random function
         name.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         name.setBounds(100,140,100,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(name);
         
         String valReligion[]= {"HIndu","Muslim","Sikh","Christian","Other"};
          religion=new JComboBox(valReligion);// for the combo in religon
          religion.setBounds(300,140,400,30);
          religion.setBackground(Color.WHITE);
         add(religion);
         
         
         
        
         JLabel Fname =new JLabel("Category:");// to have unique application number we are using random function
         Fname.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         Fname.setBounds(100,190,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(Fname);
        
         
        String valcategory[]={"General","OBC","SC","ST","Other"};
         category=new JComboBox(valcategory);
         category.setBounds(300,190,400,30);
         category.setBackground(Color.WHITE);
         add(category);
         
         
         JLabel dob =new JLabel("Income:");// to have unique application number we are using random function
         dob.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         dob.setBounds(100,240,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(dob);
         
          String incomecategory[]={"NUll","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
         income=new JComboBox(incomecategory);
         income.setBounds(300,240,400,30);
         income.setBackground(Color.WHITE);
         add(income);
         
      
          JLabel gender =new JLabel("Educataional:");// to have unique application number we are using random function
         gender.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         gender.setBounds(100,290,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(gender); 
         
         JLabel email =new JLabel("Qualification");// to have unique application number we are using random function
         email.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         email.setBounds(100,315,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(email);
         
          String educationValues[]={"Non-Gradution","Graduate","Post-Graduate","Doctrate","Others"};
         education=new JComboBox(educationValues);
         education.setBounds(300,315,400,30);
         education.setBackground(Color.WHITE);
         add(education);
         
         
       
         
         
         
          JLabel marital =new JLabel("Occupation:");// to have unique application number we are using random function
         marital.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         marital.setBounds(100,390,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(marital);
         
          String occupationValues[]={"Salried","Self-Employed","Bussiness","Doctrate","Student","Others"};
         occupation=new JComboBox(occupationValues);
         occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
         add(occupation);
         
         
         
        
         
         JLabel address =new JLabel("PAN Number:");// to have unique application number we are using random function
         address.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         address.setBounds(100,440,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(address);
         
          pan=new JTextField();
         pan.setFont(new Font("Ralway",Font.BOLD,14));// for font
         pan.setBounds(300,440,400,30);
         add(pan);
         
         JLabel city =new JLabel("Adhar Number:");// to have unique application number we are using random function
         city.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         city.setBounds(100,490,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(city);
         
           aadhar=new JTextField();
         aadhar.setFont(new Font("Ralway",Font.BOLD,14));// for font
         aadhar.setBounds(300,490,400,30);
         add(aadhar);
         
         
         
         JLabel state =new JLabel("Senior Citizen:");// to have unique application number we are using random function
         state.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         state.setBounds(100,540,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(state);

          syes=new JRadioButton("YES") ;// syes for senior citizen yes
          syes.setBounds(300,540,100,30);
           syes.setBackground(Color.WHITE);
           add(syes);
           
             sno=new JRadioButton("NO") ;// syes for senior citizen yes
          sno.setBounds(450,540,100,30);
           sno.setBackground(Color.WHITE);
           add(sno);
           
           ButtonGroup maritalgroup=new ButtonGroup();
           maritalgroup.add(syes);
           maritalgroup.add(sno);
           
         
         
         JLabel pincode =new JLabel("Existing Account:");// to have unique application number we are using random function
         pincode.setFont(new Font("Raleway",Font.BOLD,20)); // font family and font type and font size;
         pincode.setBounds(100,590,200,30); // from right, form top, length,bredth // these work when set Layout keeps null those margins wil work when it null
         add(pincode);
          
         eyes=new JRadioButton("YES") ;// syes for senior citizen yes
          eyes.setBounds(300,590,100,30);// eyes for existing account yes
           eyes.setBackground(Color.WHITE);
           add(eyes);
           
             eno=new JRadioButton("NO") ;// eno  for exitsing account no
          eno.setBounds(450,590,100,30);
           eno.setBackground(Color.WHITE);
           add(eno);
           
           ButtonGroup emaritalgroup=new ButtonGroup();
           emaritalgroup.add(eyes);
           emaritalgroup.add(eno);
           
        
         JButton next =new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,640,80,20);
         next.addActionListener(this);
         add(next);
         
         
        getContentPane().setBackground(Color.WHITE);// colour prsent in awt.*;
        
        
        setSize(850,800); // frmae size
         setUndecorated(true);// the option worng ,minimize will not appear on the frame 
        setLocation(350,10); //from left 350,top 10;
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae)
            // actionEvent is an abstract class so over ridding
    {
        
        String sreligion=(String) religion.getSelectedItem();   // string religion-sreligon// religon was combobox which return object so typasting it to string
        String scategory=(String) category.getSelectedItem();
        String sincome=(String) income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorcitizen=null;
               
        
        if(syes.isSelected())
        {
            seniorcitizen="YES";
            
        }
        else if(sno.isSelected())
        {
            seniorcitizen="NO";
        }
       
        
        String existingaccount=null;
        if(eyes.isSelected())
        {
            existingaccount="YEs";
        }
        else if(eno.isSelected())
        {
            existingaccount="NO";
        }
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
       
        try{
            
            
                Conn c=new Conn();// creating object of 
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"', '"+scategory+"','"+sincome+"', '"+seducation+"', '"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";// this will insert elemetns into sql qurery
                c.s.executeUpdate(query);// this make to run in dbms
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }
    
    
  

    
    public static void main(String args[]) {
         new SignupTwo("");
    }
}
