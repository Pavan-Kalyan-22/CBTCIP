
package bankproject;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	long random;
	JTextField nameTxtfield,fathernameTxtfield,dayTextField,monthTextField,
	emailTxtfield,
	yearTextField,addressTxtfield,cityTxtfield,stateTxtfield,pincodeTxtfield;
	
	JButton next;
	JRadioButton male,Female,Married,unmarried,other;
	
	
	SignupOne() {
		 
		 setLayout(null);
		 
		 Random ran = new Random();  // for getting random application number
		 random = Math.abs((ran.nextLong()%9000L)+ 1000L);
		 
		 //heading
		 
		 JLabel formno = new JLabel("APPLICATION FORM No. " + random );
		 formno.setFont(new Font("Raleway",Font.BOLD,38));
		 formno.setBounds(140,20,600,40); //size of the text
		 add(formno);
		 
		 //personal details
		 
		 JLabel personalDetails = new JLabel("Page 1 : Personal Details");
		 personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		 personalDetails.setBounds(290,80,400,30); //size of the text
		 add(personalDetails);
		 
		 //name
		 
		 JLabel name = new JLabel("Name: ");
		 name.setFont(new Font("Raleway",Font.BOLD,20));
		 name.setBounds(100,140,100,30); //size of the text
		 add(name);
		 
		 //name txt field
		  nameTxtfield = new JTextField();
		 nameTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 nameTxtfield.setBounds(300,140,400,30);
		 add(nameTxtfield);
		 
	 //fathers name
		 
		 JLabel fname = new JLabel("Father's Name: ");
		 fname.setFont(new Font("Raleway",Font.BOLD,20));
		 fname.setBounds(100,190,200,30); //size of the text
		 add(fname);
		 
		 //father name txt field
		  fathernameTxtfield = new JTextField();
		 fathernameTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 fathernameTxtfield.setBounds(300,190,400,30);
		 add(fathernameTxtfield);

	 //dob
		 
		 JLabel dob = new JLabel("Date of Birth:");
		 dob.setFont(new Font("Raleway",Font.BOLD,20));
		 dob.setBounds(100,240,200,30); //size of the text
		 add(dob);
		 
		// day
		 JLabel dayLabel = new JLabel("Day:");
		 dayLabel.setFont(new Font("Raleway", Font.BOLD, 16));
		 dayLabel.setBounds(300, 240, 50, 30);
		 add(dayLabel);

		  dayTextField = new JTextField();
		 dayTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		 dayTextField.setBounds(350, 240, 50, 30);
		 add(dayTextField);

		 // month
		 JLabel monthLabel = new JLabel("Month:");
		 monthLabel.setFont(new Font("Raleway", Font.BOLD, 16));
		 monthLabel.setBounds(420, 240, 70, 30);
		 add(monthLabel);

		  monthTextField = new JTextField();
		 monthTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		 monthTextField.setBounds(500, 240, 50, 30);
		 add(monthTextField);

		 // year
		 JLabel yearLabel = new JLabel("Year:");
		 yearLabel.setFont(new Font("Raleway", Font.BOLD, 16));
		 yearLabel.setBounds(580, 240, 50, 30);
		 add(yearLabel);

		  yearTextField = new JTextField();
		 yearTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		 yearTextField.setBounds(630, 240, 70, 30);
		 add(yearTextField);
	
		 
	 //gender
		 
		 JLabel gender = new JLabel("Gender: ");
		 gender.setFont(new Font("Raleway",Font.BOLD,20));
		 gender.setBounds(100,290,200,30); //size of the text
		 add(gender);
		 
		 //male
		  male = new JRadioButton("Male");
		 male.setBounds(300,290,60,30);
		 male.setBackground(Color.LIGHT_GRAY);

		 add(male);
		 
		 //Female
		  Female = new JRadioButton("Female");
		 Female.setBounds(450,290,100,30);
		 Female.setBackground(Color.LIGHT_GRAY);
		 add(Female);
		 
		 //radiobutton function
		 ButtonGroup GenderSelect = new ButtonGroup();
		 GenderSelect.add(male);
		 GenderSelect.add(Female);
		 
	 //Email
		 
		 JLabel email = new JLabel("E-Mail: ");
		 email.setFont(new Font("Raleway",Font.BOLD,20));
		 email.setBounds(100,340,200,30); //size of the text
		 add(email);

		 //email txt field
		  emailTxtfield = new JTextField();
		 emailTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 emailTxtfield.setBounds(300,340,400,30);
		 add(emailTxtfield);
		 
	 //marital
		 
		 JLabel Maritalstatus = new JLabel("Marital Status: ");
		 Maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
		 Maritalstatus.setBounds(100,390,200,30); //size of the text
		 add(Maritalstatus);
		 
		 //Married
		  Married = new JRadioButton("Married");
		 Married.setBounds(300,390,100,30);
		 Married.setBackground(Color.LIGHT_GRAY);
		 add(Married);
		 
		 //unmarried
		  unmarried = new JRadioButton("Unmarried");
		 unmarried.setBounds(450,390,100,30);
		 unmarried.setBackground(Color.LIGHT_GRAY);
		 add(unmarried);
		 //Other
		  other = new JRadioButton("Other");
		 other.setBounds(630,390,100,30);
		 other.setBackground(Color.LIGHT_GRAY);
		 add(other);
		 
		 //martial function
		 
		 ButtonGroup maritalstatus = new ButtonGroup();
		 maritalstatus.add(Married);
		 maritalstatus.add(unmarried);
		 maritalstatus.add(other);
		 
		 
		 
		 
	 //Address
		 
		 JLabel address = new JLabel("Address: ");
		 address.setFont(new Font("Raleway",Font.BOLD,20));
		 address.setBounds(100,440,200,30); //size of the text
		 add(address);
		 
		 //Address txt field
		  addressTxtfield = new JTextField();
		 addressTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 addressTxtfield.setBounds(300,440,400,30);
		 add(addressTxtfield);
		 
		 
	 //city
		 JLabel city = new JLabel("City: ");
		 city.setFont(new Font("Raleway",Font.BOLD,20));
		 city.setBounds(100,490,200,30); //size of the text
		 add(city);
		 
		 //city txt field
		  cityTxtfield = new JTextField();
		 cityTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 cityTxtfield.setBounds(300,490,400,30);
		 add(cityTxtfield);
		 
		 
		 //state
		 JLabel state = new JLabel("State: ");
		 state.setFont(new Font("Raleway",Font.BOLD,20));
		 state.setBounds(100,540,200,30); //size of the text
		 add(state);
		 //state txt field
		  stateTxtfield = new JTextField();
		 stateTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 stateTxtfield.setBounds(300,540,400,30);
		 add(stateTxtfield);
		 
		 //pincode
		 JLabel pincode = new JLabel("Pin code: ");
		 pincode.setFont(new Font("Raleway",Font.BOLD,20));
		 pincode.setBounds(100,590,200,30); //size of the text
		 add(pincode);
		 //pincode txt field
		  pincodeTxtfield = new JTextField();
		 pincodeTxtfield.setFont(new Font("Raleway",Font.BOLD,14));
		 pincodeTxtfield.setBounds(300,590,400,30);
		 add(pincodeTxtfield);
		 
		 //next
		  next = new JButton("Next");
		 next.setBackground(Color.black);
		 next.setForeground(Color.white);
		 next.setFont(new Font("Raleway",Font.BOLD,14));
		 next.setBounds(620,660,80,30);
		 next.addActionListener(this);
		 add(next);
		 
		 getContentPane().setBackground(Color.LIGHT_GRAY);// bg color
		 
		 setSize(850,800); // size of screen
		 setLocation(350,10);
		 setVisible(true);
		 
		
	}
	public void actionPerformed1(ActionEvent ae) {
		String formno = "" + random;//long
		String name = nameTxtfield.getText();//setText
		String fname = fathernameTxtfield.getText(); 
		String month = monthTextField.getText();
		String day = dayTextField.getText();
		String year = yearTextField.getText();
        String gender = null;
        if(male.isSelected()) {
        	gender = "Male";
        }else if(Female.isSelected()) {
        	gender = "Female";
        }
        String email = emailTxtfield.getText();
	String Maritalstatus = null;
	if(Married.isSelected()) {
		Maritalstatus = "Married";
	}else if(unmarried.isSelected()) {
		Maritalstatus = "Unmarried";
	}else if (other.isSelected()) {
		Maritalstatus = "Other";
	}
	String address = addressTxtfield.getText();//setText
	String city = cityTxtfield.getText();//setText
	String pin = pincodeTxtfield.getText();//setText
	String state = stateTxtfield.getText();//setText

	
	try {
		if(name.equals(" ")) {
			JOptionPane.showMessageDialog(null,"Name is  Required");
		}else {
            // Concatenate day, month, and year into a single date string
            String dob = year + "-" + month + "-" + day;

            // Assuming BankDBconn is your database connection class
            BankDBconn c = new BankDBconn();

            // Example query to insert data into a hypothetical "Accounts" table
            String query = "INSERT INTO Account (formno, name, father_name, dob, gender, email, marital_status, address, city, pincode, state) VALUES ('"
                    + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + Maritalstatus + "', '" + address + "', '" + city + "', '" + pin + "', '" + state + "')";

            // Execute the query
            c.s.executeUpdate(query);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}
	public static void main(String[]args) {
	new SignupOne();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}