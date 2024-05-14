package technologicalHealthProject;
/*
 * Hannah and Manahill
 * Date: January 9
 * Purpose: This class programs the main page of our application that shows up after the user has logged in. 
 * Here, they are able to pinpoint the area of their body that’s causing them pain. 
 * The clickable images will then take them to a frame coded by the Information class.
 */
import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements MouseListener {
	//global variable to check which body panel is clicked
	public static String type = "";
	//makign the frame and the panel
	JFrame mainFrame=new JFrame();
	JPanel mainPnl=new JPanel();
	//Importing and adding an person image into a label to be used in the program
	ImageIcon personPicture=new ImageIcon("person.png");
	Image personPic=personPicture.getImage();
	Image newPerson = personPic.getScaledInstance(600, 600, java.awt.Image.SCALE_SMOOTH);
	ImageIcon personpic1 = new ImageIcon(newPerson);
	JLabel personlabel = new JLabel(personpic1);
	//Making the image buttons so that the user can click the affected areas
	//head gif
	ImageIcon headicon = new ImageIcon("src/head.gif");
	JLabel headlabel = new JLabel();
	//Fingers image
	ImageIcon fingers = new ImageIcon("fingers.png");
	Image fingersPic=fingers.getImage();
	Image newFingers=fingersPic.getScaledInstance(80, 110, java.awt.Image.SCALE_SMOOTH);
	ImageIcon fingersPic1=new ImageIcon(newFingers);
	JLabel fingerslabel=new JLabel(fingersPic1);
	//Wrist image
	ImageIcon wrist = new ImageIcon("wrist.png");
	Image wristPic=wrist.getImage();
	Image newWrist=wristPic.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
	ImageIcon wristPic1=new ImageIcon(newWrist);
	JLabel wristlabel=new JLabel(wristPic1);
	//Eyes image
	ImageIcon eye = new ImageIcon("eyeball 2.png");
	Image eyePic=eye.getImage();
	Image newEye=eyePic.getScaledInstance(15, 30, java.awt.Image.SCALE_SMOOTH);
	ImageIcon eyePic1=new ImageIcon(newEye);
	JLabel eyelabel=new JLabel(eyePic1);
	//Neck image
	Image newNeck=wristPic.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
	ImageIcon neckPic1=new ImageIcon(newNeck);
	JLabel necklabel=new JLabel(neckPic1);
	//Spine image
	ImageIcon spine = new ImageIcon("spine 2.png");
	Image spinePic=spine.getImage();
	Image newSpine=spinePic.getScaledInstance(40, 200, java.awt.Image.SCALE_SMOOTH);
	ImageIcon spinePic1=new ImageIcon(newSpine);
	JLabel spinelabel=new JLabel(spinePic1);
	//Creating title label 
	JLabel mainTitle=new JLabel("Please Click the Affected Area");
	//Creating the side labels for each body part, which will go on the side of the frame
	JLabel headSideLabel=new JLabel("Head");
	JLabel fingerSideLabel=new JLabel("Fingers");
	JLabel wristSideLabel=new JLabel("Wrist");
	JLabel eyeSideLabel=new JLabel("Eyes");
	JLabel spineSideLabel=new JLabel("Back");
	JLabel neckSideLabel=new JLabel("Neck");
	//Creating the labels with user's personal information at the side
	JLabel nameLabel=new JLabel("WELCOME BACK, "+Login.name.toUpperCase()+"!");
	JLabel ageLabel=new JLabel("AGE: "+Login.age);
	JLabel genderLabel=new JLabel("GENDER: "+Login.gender.toUpperCase());
	//signout button
	JButton signout = new JButton("Sign Out");
	public Main() {
		super("main");
		//basic setup of the frame
		mainFrame.setSize(1589,980);
		mainFrame.setResizable(true);
		mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        //import background image as a panel
        LoginPanel background = new LoginPanel();
        background.setLayout(null);
    	background.setBounds(0,0,1589,980);
    	mainFrame.add(background);
    	//Adding the eyeball image to the frame
    	eyelabel.setBounds(775,180,15,25);
    	background.add(eyelabel);
    	//Adding the head image to the frame
    	headlabel.setBounds(780,130,100,100);
    	headicon.setImage(headicon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	headlabel.setIcon(headicon);
    	background.add(headlabel); 
    	//Adding the fingers image to the frame
    	fingerslabel.setBounds(556,313,80,110);
    	background.add(fingerslabel); 
    	//Adding the wrist image to the frame
    	wristlabel.setBounds(625,320,50,50);
    	background.add(wristlabel);
    	//Adding the neck label directly to the frame
    	necklabel.setBounds(820, 218, 80, 80);
    	background.add(necklabel);
    	//Adding the spine label directly to the frame
    	spinelabel.setBounds(805, 60, 200, 700);
    	background.add(spinelabel);
    	//Adding the person label directly to the frame
    	personlabel.setBounds(420,120,600,600);
    	background.add(personlabel);
    	//Setting title background and position
    	mainTitle.setBackground(Color.WHITE);
    	mainTitle.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 50));
    	mainTitle.setBounds(262,10,915,50);
		mainTitle.setHorizontalAlignment(JLabel.CENTER);
    	mainTitle.setOpaque(true);
    	background.add(mainTitle);
    	//Adding the body part labels to the side of the frame
    	//Head label 
    	headSideLabel.setBackground(Color.WHITE);
    	headSideLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 30));
    	headSideLabel.setBounds(1250,215,160,50);
		headSideLabel.setHorizontalAlignment(JLabel.CENTER);
    	headSideLabel.setOpaque(true);
    	background.add(headSideLabel);
    	//Eye label
    	eyeSideLabel.setBackground(Color.WHITE);
    	eyeSideLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 30));
    	eyeSideLabel.setBounds(1250,275,160,50);
		eyeSideLabel.setHorizontalAlignment(JLabel.CENTER);
    	eyeSideLabel.setOpaque(true);
    	background.add(eyeSideLabel);
    	//Fingers label
    	fingerSideLabel.setBackground(Color.WHITE);
    	fingerSideLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 30));
    	fingerSideLabel.setBounds(1250,335,160,50);
		fingerSideLabel.setHorizontalAlignment(JLabel.CENTER);
    	fingerSideLabel.setOpaque(true);
    	background.add(fingerSideLabel);
    	//Spine label
    	spineSideLabel.setBackground(Color.WHITE);
    	spineSideLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 30));
    	spineSideLabel.setBounds(1250,395,160,50);
		spineSideLabel.setHorizontalAlignment(JLabel.CENTER);
    	spineSideLabel.setOpaque(true);
    	background.add(spineSideLabel);
    	//Neck label
    	neckSideLabel.setBackground(Color.WHITE);
    	neckSideLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 30));
    	neckSideLabel.setBounds(1250,455,160,50);
		neckSideLabel.setHorizontalAlignment(JLabel.CENTER);
    	neckSideLabel.setOpaque(true);
    	background.add(neckSideLabel);
    	//Wrist label
    	wristSideLabel.setBackground(Color.WHITE);
    	wristSideLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 30));
    	wristSideLabel.setBounds(1250,515,160,50);
		wristSideLabel.setHorizontalAlignment(JLabel.CENTER);
    	wristSideLabel.setOpaque(true);
    	background.add(wristSideLabel);
    	
    	//Adding mouse listener to each image
    	headlabel.addMouseListener(this);
    	fingerslabel.addMouseListener(this);
    	wristlabel.addMouseListener(this);
    	eyelabel.addMouseListener(this);
    	necklabel.addMouseListener(this);
    	spinelabel.addMouseListener(this);
    	
    	//Adding the label with the user's name to the screen
    	nameLabel.setBackground(Color.WHITE);
    	nameLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 20));
    	nameLabel.setBounds(10,305,420,70);
    	nameLabel.setHorizontalAlignment(JLabel.CENTER);
    	nameLabel.setOpaque(true);
    	background.add(nameLabel);
    	//Adding the label with the user's age to the screen
    	ageLabel.setBackground(Color.WHITE);
    	ageLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 20));
    	ageLabel.setBounds(10,355,420,70);
    	ageLabel.setHorizontalAlignment(JLabel.CENTER);
    	ageLabel.setOpaque(true);
    	background.add(ageLabel);
    	//Adding the label with the user's gender to the screen
    	genderLabel.setBackground(Color.WHITE);
    	genderLabel.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 20));
    	genderLabel.setBounds(10,405,420,70);
    	genderLabel.setHorizontalAlignment(JLabel.CENTER);
    	genderLabel.setOpaque(true);
    	background.add(genderLabel);
    	signout.setBounds(1250,800,150,25);
    	signout.setForeground(Color.GREEN);
    	background.add(signout);
    	signout.addMouseListener(this);
	}

	public static void main(String[] args) {
		Login loginMenu = new Login();
	}
	/*
	 * Purpose: Uses the MouseListener method. Depending on what image on the screen is clicked, 
	 * this method ensures that the right frame will show up by relaying that information to the information panel. 
	 * Pre: MouseEvent e, an object that implements the MouseListener interface gets this MouseEvent when the event occurs.
	 */
	public void mouseClicked(MouseEvent e) {
		//If the head image is clicked, the head frame will open up
		if(e.getSource()==headlabel) {
			type="Head";
			new Information();
			mainFrame.dispose();
		}
		//If the fingers image is clicked, the fingers frame will open up
		if(e.getSource()==fingerslabel) {
			type="Finger";
			new Information();
			mainFrame.dispose();
		}
		//If the wrist image is clicked, the wrist frame will open up
		if(e.getSource()==wristlabel) {
			type="Wrist";
			new Information();
			mainFrame.dispose();
		}
		//If the eye image is clicked, the eye frame will open up
		if(e.getSource()==eyelabel) {
			type="Eye";
			new Information();
			mainFrame.dispose();
		}
		//If the neck image is clicked, the neck frame will open up
		if(e.getSource()==necklabel) {
			type="Neck";
			new Information();
			mainFrame.dispose();
		}
		//If the spine image is clicked, the spine frame will open up
		if(e.getSource()==spinelabel) {
			type="Spine";
			new Information();
			mainFrame.dispose();
		}
		//if the signout button is pressed, it will return to the login page
		if (e.getSource()==signout) {
			new Login();
			mainFrame.dispose();
		}
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
}

