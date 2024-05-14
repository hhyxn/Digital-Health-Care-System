package technologicalHealthProject;
/*
 * Manahill Sajid and Hannah Ye
 * December 20, 2022
 * Purpose: This class programs the signup window of our application. 
 * If the user presses the make an account button found on the login page, 
 * it will redirect them to the signup window. It allows the user to create their new account by 
 * inputting their name, age, gender, and creating a username and password.

 */
import javax.swing.* ;
import java.awt.Color;
import java.awt.event.* ;
import java.io.*;
import java.awt.*;
import java.util.*;
public class SignUpWindow extends JFrame implements ActionListener, ItemListener{
	//Creating the frame, panel, buttons, labels, and text fields that will be used.
	JFrame signUpFrame=new JFrame();
	JPanel signUpPanel=new JPanel();
	JLabel Fname=new JLabel("First Name");
	JLabel Lname=new JLabel("Last Name");
	JLabel usernameLabel=new JLabel("Enter a username");
	JLabel passwordLabel=new JLabel("Create a password");
	JLabel age= new JLabel ("Age");
	JLabel title=new JLabel("CREATE AN ACCOUNT");
	JLabel gender=new JLabel("Gender");
	JTextField userFName=new JTextField(20);
	JTextField userLName=new JTextField(20);
	JTextField userAge=new JTextField(2);
	JTextField userPassword=new JTextField(20);
	JTextField username=new JTextField(20);
	JButton confirm=new JButton("CREATE ACCOUNT");
	JButton back=new JButton("Go Back");
	JRadioButton female=new JRadioButton("Female");
	JRadioButton male=new JRadioButton("Male");
	JRadioButton other = new JRadioButton("Other");
	ButtonGroup maleOrFemale=new ButtonGroup();
	JLabel done = new JLabel("Registration complete. Please press back to log in.");
	String genderStr;
	//input checking boolean
	boolean isGenderPicked= false;
	JLabel error = new JLabel("*Please enter in all the required information correctly.*");
	JLabel invalid = new JLabel("*Invalid Username. Please try again.*");
	
	public SignUpWindow() {
		//setting up the frame
		super("Create Account");
		signUpFrame.setSize(1589,980);
		signUpFrame.setLayout(null);
		signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signUpFrame.setVisible(true);
		signUpFrame.setResizable(true);
		//Adding the background image
		LoginPanel background = new LoginPanel();
		background.setLayout(null);
		background.setBounds(0,0,1589,980); 
		//Setting the position of the panel	
		signUpFrame.add(background);
		signUpPanel.setLayout(null);
		signUpPanel.setBounds(130, 150, 450, 530);
		//Adding the panel to the background
		background.add(signUpPanel);
		//Adding the title on top of the panel to the screen
		title.setBounds(35, 20, 250, 50);
		title.setFont(new Font("Serif", Font.BOLD, 20));
		signUpPanel.add(title);
		//Adding the first name label to the screen
		Fname.setBounds(30, 65, 90, 20);
		signUpPanel.add(Fname);
		//Adding the first name text field to the screen
		userFName.setBounds(30, 90, 380, 35);
		signUpPanel.add(userFName);
		userFName.addActionListener(this);
		//Adding the last name label to the screen
		Lname.setBounds(30, 125, 90, 20);
		signUpPanel.add(Lname);
		//Adding the last name text field to the screen
		userLName.setBounds(30, 150, 380, 35);
		signUpPanel.add(userLName);
		userLName.addActionListener(this);
		//Adding the username label to the screen
		usernameLabel.setBounds(30, 185, 120, 20);
		signUpPanel.add(usernameLabel);
		//Adding the username textfield to the screen
		username.setBounds(30, 210, 380, 35);
		username.addActionListener(this);
		signUpPanel.add(username);
		//Adding the password label to the screen
		passwordLabel.setBounds(30, 245, 120, 20);
		signUpPanel.add(passwordLabel);
		//Adding the password text field to the screen
		userPassword.setBounds(30, 270, 380, 35);
		signUpPanel.add(userPassword);
		userPassword.addActionListener(this);
		//Adding the age label to the screen
		age.setBounds(30, 305, 90, 20);
		signUpPanel.add(age);
		//Adding the age text field to the screen
		userAge.setBounds(30, 330, 40, 35);
		signUpPanel.add(userAge);
		userAge.addActionListener(this);
		//Adding the gender label to the screen
		gender.setBounds(30, 365, 90, 20);
		signUpPanel.add(gender);
		//Adding the gender radio buttons to the screen
		female.setBounds(30, 390, 90, 20);
		signUpPanel.add(female);
		maleOrFemale.add(female);
		female.addItemListener(this);
		male.setBounds(120, 390, 90, 20);
		signUpPanel.add(male);
		maleOrFemale.add(male);
		male.addItemListener(this);
		other.setBounds(210, 390, 90, 20);
		signUpPanel.add(other);
		maleOrFemale.add(other);
		other.addItemListener(this);
		//Adding the confirmation button to the screen
		confirm.setBounds(70, 420, 300, 35);
		confirm.setForeground(Color.blue);
		signUpPanel.add(confirm);
		confirm.addActionListener(this);
		//Adding the back button to the screen
		back.setBounds(345, 490, 90, 30);
		signUpPanel.add(back);
		back.setEnabled(false);
		back.addActionListener(this);
		signUpPanel.setVisible(true);
		//Adding the error label to the screen (setting visibility to false)
		error.setForeground(Color.RED);
		error.setBounds(50,470,400,15);
		signUpPanel.add(error);
		error.setVisible(false);
		//Adding the invalid username button to the screen (same location as error)
		invalid.setForeground(Color.RED);
		invalid.setBounds(150, 185, 240, 20);
		signUpPanel.add(invalid);
		invalid.setVisible(false);
		//Adding registration confirmation to the screen (setting visibility to false)
		done.setBounds(60,470,400,15);
		signUpPanel.add(done);
		done.setVisible(false);

	}
		
	@Override
	/*
	 * Purpose: check for input and return to the login panel if back is clicked	
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==confirm) {
			try {
				Scanner sc = new Scanner (new File ("usernames.txt"));
				String userTxt = " ";
				//check each line of the username textfield to check if the inputted username already existed
				while (sc.hasNext()) {
			        userTxt = sc.nextLine();
			        if (userTxt.equals(username.getText())) {
			        	invalid.setVisible(true);
			        	username.setText("");
			        }
			    }
			}catch(Exception ae) {}
			//stores the input for age
			int age = -1;
			if(!userAge.getText().equals("")) {
				age = Integer.parseInt(userAge.getText());
			}
			//checks all the input
			if(userFName.getText().equals("")||userLName.getText().equals("")||age<=0||age>123||userAge.getText().equals("")||isGenderPicked==false||username.getText().equals("")||userPassword.getText().equals("")) {
				error.setVisible(true);
			}
			else {
				error.setVisible(false);
				invalid.setVisible(false);
				done.setVisible(true);
				back.setForeground(Color.GREEN);
				back.setEnabled(true);
			}
		}
		//if sign up was successul, it will add all the information to the text files
		if(e.getSource()==back) {
			try {
				FileWriter pAcc = new FileWriter("accounts.txt",true);
				FileWriter pUser = new FileWriter("usernames.txt",true);
				FileWriter pPass = new FileWriter("password.txt",true);
				pUser.write(username.getText()+"\n");
				pPass.write(userPassword.getText()+"\n");
				pAcc.write(username.getText()+"," + userPassword.getText()+","+userFName.getText()+" " + userLName.getText()+","+userAge.getText()+","+genderStr+"\n");
				pAcc.close();
				pUser.close();
				pPass.close();
			} catch(Exception ae) {}
			new Login();
			signUpFrame.dispose();
		}
	}

	@Override
	/*
	 * Purpose 
	 */
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//if any was selected, the boolean would be set to true
		if(e.getItemSelectable()==female||e.getItemSelectable()==male||e.getItemSelectable()==other) {
			isGenderPicked=true;
		}
		//stores the selected gender in the string
		if((e.getItemSelectable() == female ) &&( e.getStateChange() == ItemEvent.SELECTED)) {
			genderStr="female";
		}
		if ((e.getItemSelectable() == male ) &&( e.getStateChange() == ItemEvent.SELECTED)) {
			genderStr="male";
		}
		if ((e.getItemSelectable() == other ) &&( e.getStateChange() == ItemEvent.SELECTED)) {
			genderStr="other";
		}
	}
		
}


