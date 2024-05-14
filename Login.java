package technologicalHealthProject;
/*
 * Manahill Sajid and Hannah Ye
 * December 16, 2022
 * Purpose: This class programs the login page of our application. 
 *  It is what codes the page allowing users to either log in using their username 
 *  and password or open up the page that allows new users to make their account.
 */
import javax.swing.* ;

import java.awt.event.* ;
import java.awt.*;
import java.io.*;
import java.util.*;
public class Login extends JFrame implements ActionListener {
	//Initialize global variables to store the user's information
	public static String name="";
	public static String age;
	public static String gender="";
	boolean accountExist = false;
	//frame and panel
	JFrame menuFrame = new JFrame();
	JPanel loginPanel = new JPanel();
	JPanel instructionPanel = new JPanel();
	//creating the components in the login panel
	JButton signUp = new JButton ("DON'T HAVE AN ACCOUNT? SIGN-UP!");
	JLabel instructions = new JLabel("INSTRUCTIONS");
	JTextField username = new JTextField(20);
	JTextField password = new JTextField(20);
	JButton login = new JButton ("LOGIN");
	JLabel loginLbl = new JLabel("LOGIN");
	JLabel usernameLbl = new JLabel("Username");
	JLabel passwordLbl = new JLabel("Password");
	JLabel error = new JLabel("Incorrect username or password.");
	//making label for the instruction image
	ImageIcon instruction = new ImageIcon("howToUse.png");
	Image insPic=instruction.getImage();
	Image newIns=insPic.getScaledInstance(580,450 , java.awt.Image.SCALE_SMOOTH);
	ImageIcon insPic1=new ImageIcon(newIns);
	JLabel instructionsPic = new JLabel(insPic1); 
	JLabel websiteName = new JLabel("Technosis");
	
	public Login() {
		//setting the basics for the frame
		super("login");
		menuFrame.setSize(1589,980);
		menuFrame.setLayout(null);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setResizable(true);
        //background image
        LoginPanel background = new LoginPanel();
        background.setLayout(null);
    	background.setBounds(0,0,1589,980);
    	menuFrame.add(background);
    	//panels
    	loginPanel.setLayout(null);
    	loginPanel.setBounds(100,200,400,500);
    	background.add(loginPanel);
    	instructionPanel.setLayout(null);
    	instructionPanel.setBounds(750,250,580,450);
    	background.add(instructionPanel);
    	//adding action listener to buttons and teextfields
    	signUp.addActionListener(this);
    	username.addActionListener(this);
    	password.addActionListener(this);
    	login.addActionListener(this);
    	//setting bounds and adding to the panel 
    	loginLbl.setBounds(35,20,100,50);
    	loginLbl.setFont(new Font("Serif",Font.BOLD,20));
    	loginPanel.add(loginLbl);
    	usernameLbl.setBounds(50,115,100,10);
    	loginPanel.add(usernameLbl);
    	username.setBounds(50,135,300,35);
    	loginPanel.add(username);
    	passwordLbl.setBounds(50,210,90,20);
    	loginPanel.add(passwordLbl);
    	password.setBounds(50,235,300,35);
    	loginPanel.add(password);
    	login.setBounds(50,300,300,35);
    	login.setForeground(Color.BLUE);
    	loginPanel.add(login);
    	signUp.setBounds(50,450,300,25);
    	loginPanel.add(signUp);
    	instructions.setBounds(975,200,150,40);
    	instructions.setBackground(Color.WHITE);
    	instructions.setHorizontalAlignment(JLabel.CENTER);
    	instructions.setOpaque(true);
    	background.add(instructions);
    	error.setForeground(Color.RED);
    	error.setBounds(100,350,300,25);
    	loginPanel.add(error);
    	error.setVisible(false);
    	menuFrame.setVisible(true);
    	instructionsPic.setBounds(0,0,580,480);
    	instructionPanel.add(instructionsPic);
    	websiteName.setBounds(100,0,1250,150);
    	websiteName.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 70));
    	websiteName.setForeground(Color.WHITE);
    	websiteName.setHorizontalAlignment(JLabel.CENTER);
    	background.add(websiteName);
	}
	
	@Override
	/*
	 * Purpose: to switch frames once login or signup is clicked
	 */
	public void actionPerformed(ActionEvent e) {
		//brings the user to the signup frame if clicked
		if (e.getSource()==signUp) {
			new SignUpWindow();
			menuFrame.dispose();
		}
		if (e.getSource()==login) {
			try {
				Scanner scU = new Scanner (new File ("usernames.txt"));
				String userTxt = " ";
				Scanner scP = new Scanner (new File("password.txt"));
				String passTxt = " ";
				Scanner scA=new Scanner (new File ("accounts.txt"));
				String accTxt=" ";
				//checks if the inputted username and password matches the username and passwords of the accounts
				while (scU.hasNext()&&scP.hasNext()) {
			        userTxt = scU.nextLine();
			        passTxt=scP.nextLine();
			        accTxt=scA.nextLine();
			        //if it does equal, store the information in the global variables and open the main frame
			        if (userTxt.equals(username.getText())&& passTxt.equals(password.getText())) {
			        	accountExist= true;
			        	String[] personInfo=accTxt.split(",");
				        name=personInfo[2];
				        age=personInfo[3];
				        gender=personInfo[4];
			        	new Main();
						menuFrame.dispose();
			        }
			    }
			}catch(Exception ae) {}
			//if the account doesn't exist, display error
			if (accountExist==false)
				error.setVisible(true);
		}
	}



}
