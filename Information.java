package technologicalHealthProject;
/*
 * Hannah and Manahill
 * Date: January 9
 * Purpose: This class programs the panels that have the information in them. 
 * After the user clicks on one of the clickable images on the main page, it will open one of the frames 
 * coded by the information panel. The frame that opens depends on the body part clicked. It will give the
 *  user information about the pain they experience including what causes it, symptoms, and advice they should 
 *  follow to ease some of that pain.
 */
import javax.swing.* ;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class Information extends JFrame implements MouseListener{
	JFrame frame = new JFrame();
	//labels for advice, explanation, and title
	JLabel explanation = new JLabel();
	JLabel advice = new JLabel();
	JLabel title = new JLabel();
	//components in head panel
	JPanel headPnl=new JPanel();
	ImageIcon head = new ImageIcon("headache.png");
	Image headPic=head.getImage();
	Image newhead=headPic.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
	ImageIcon headPic1=new ImageIcon(newhead);
	JLabel headDiagram = new JLabel(headPic1);
	//components in fingers panel
	JPanel fingerPnl=new JPanel();
	ImageIcon finger = new ImageIcon("handPic.png");
	Image fingerPic=finger.getImage();
	Image newfinger=fingerPic.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
	ImageIcon fingerPic1=new ImageIcon(newfinger);
	JLabel fingerDiagram = new JLabel(fingerPic1);
	ImageIcon fingericon = new ImageIcon("src/fingerexercise.gif");
	JLabel fingerlabel = new JLabel();
	//components in eyes panel
	JPanel eyePnl=new JPanel();
	ImageIcon eye = new ImageIcon("eyePic.png");
	Image eyePic=eye.getImage();
	Image neweye=eyePic.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
	ImageIcon eyePic1=new ImageIcon(neweye);
	JLabel eyeDiagram = new JLabel(eyePic1);
	//reccomended food
	ImageIcon eyeFood = new ImageIcon("eyeFood.jpeg");
	Image eyefoodPic=eyeFood.getImage();
	Image neweyefood=eyefoodPic.getScaledInstance(450, 340, java.awt.Image.SCALE_SMOOTH);
	ImageIcon eyeFoodPic1=new ImageIcon(neweyefood);
	JLabel eyeRecommendations = new JLabel(eyeFoodPic1);
	//components in neck panel
	JPanel neckPnl=new JPanel();
	ImageIcon neck = new ImageIcon("neckPic.png");
	Image neckPic=neck.getImage();
	Image newneck=neckPic.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
	ImageIcon neckPic1=new ImageIcon(newneck);
	JLabel neckDiagram = new JLabel(neckPic1);
	//neck exercise
	ImageIcon neckExercise = new ImageIcon("neckExercise.png");
	Image neckExercisePic=neckExercise.getImage();
	Image newneckExercise=neckExercisePic.getScaledInstance(500, 280, java.awt.Image.SCALE_SMOOTH);
	ImageIcon neckPic2=new ImageIcon(newneckExercise);
	JLabel neckExerciseDiagram = new JLabel(neckPic2);
	//components in spine panel
	JPanel spinePnl=new JPanel();
	ImageIcon spine = new ImageIcon("spinePic.png");
	Image spinePic=spine.getImage();
	Image newspine=spinePic.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
	ImageIcon spinePic1=new ImageIcon(newspine);
	JLabel spineDiagram = new JLabel(spinePic1);
	//spine exercise
	ImageIcon spineicon = new ImageIcon("src/spineExercise.gif");
	JLabel spineElabel = new JLabel();
	//components in wrist panel
	JPanel wristPnl = new JPanel();
	ImageIcon wrist = new ImageIcon("wristCast.jpeg");
	Image wristPic=wrist.getImage();
	Image newWrist=wristPic.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
	ImageIcon wristPic1=new ImageIcon(newWrist);
	JLabel wristDiagram = new JLabel(wristPic1);
	//wrist exercise
	ImageIcon wristicon = new ImageIcon("src/wristExercise.gif");
	JLabel wristExerciselabel = new JLabel();
	//back button
	ImageIcon back = new ImageIcon("return.png");
	Image back1=back.getImage();
	Image backPic=back1.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon back2=new ImageIcon(backPic);
	JLabel backButton = new JLabel(back2);
	public Information() {
		//frame
		frame.setSize(1589,980);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		//setting fixed bounds for back button
		backButton.setBounds(50,30,100,100);
		backButton.addMouseListener(this);
		//title label
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(Color.decode("#FEFCF3"));
		title.setBounds(50,30,1340,100);
		title.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 50));
		title.setOpaque(true);
		//explanation label
		explanation.setBackground(Color.decode("#FEFCF3"));
		explanation.setOpaque(true);
		explanation.setBounds(600,150,790,300);
		explanation.setVerticalAlignment(JLabel.TOP);
		explanation.setBorder(new EmptyBorder(15,15,15,15));
		explanation.setFont(new Font("Courier", Font.PLAIN, 15));
		//advice label
		advice.setVerticalAlignment(JLabel.TOP);
		advice.setBorder(new EmptyBorder(10,10,15,15));
		advice.setBackground(Color.decode("#FEFCF3"));
		advice.setOpaque(true);
		advice.setBounds(50,475,1340,340);
		advice.setFont(new Font("Courier", Font.PLAIN, 15));
		//if the wrist button was pressed
		if ((Main.type).equals("Wrist")) {
			//wrist panel
			frame.add(wristPnl);
			wristPnl.setLayout(null);
			wristPnl.setBackground(Color.decode("#E8F3D6"));
			//back button
			wristPnl.add(backButton);
			//wrist title
			title.setText("Wrist");
			//wrist diagram
			wristDiagram.setBackground(Color.decode("#FEFCF3"));
			wristDiagram.setOpaque(true);
			wristDiagram.setBounds(50,150,500,300);
			//wrist advice
			advice.setText("<html>Advice:<br/>"
					+ "- Avoid activities that make symptoms worse, especially repetitive activites that strain <br/> "
					+ "the same tendons continously.<br/> "
					+ "- Apply cold packs on your wrists to reduce swelling.<br/>"
					+ "- Wear splints, which are cast-like devices that protect injuries, on your wrists to hold it <br/> "
					+ "in place and eradicate further pain. <br/>"
					+ "- Elevate your hands and wrists whenever possible by placing it on a pillow.<br/>"
					+ "- Take over-the-counter medication such as Tylenol, Aleve, or Ibuprofen.<br/>"
					+ "- Get an ergonomic or padded keyboard and mouse pad that has hand rests if you must <br/> "
					+ "continue typing. <br/>"
					+ "</html>"); 
			//wrist explanation
			explanation.setText("<html>Long-term keyboard use may result in wrist pain. Wrist pain commonly leads to Carpal Tunnel syndrome."
					+ " It is a narrow canal or tube in the wrist. Similarly to a tunnel you could travel through by car, this part of the wrist allows "
					+ "the median nerve and tendons to connect the hand and forearm. Carpal Tunnel syndrome is caused by pressure on a nerve in your wrist. "
					+ "Doing repetitive tasks such as typing or controlling the mouse or playing on a game controller can worsen the pain.<br/>"
					+ "<br/>"
					+ "Symptoms of carpal tunnel:<br/>"
					+ "Wrist Pain<br/>"
					+ "Aching in fingers<br/>"
					+ "Numbness in fingers<br/>"
					+ "Difficulty moving your hand<br/>"
					+ "Usually the thumb and index, middle or ring fingers feel tingly<br/>"
					+ "Swelling in the wrist<br/>"
					+ "<html>");
			//adding the wrist exercise gif to the panel
			wristExerciselabel.setBounds(900,475,490,340);
			wristicon.setImage(wristicon.getImage().getScaledInstance(490, 340, Image.SCALE_DEFAULT));
			wristExerciselabel.setIcon(wristicon);
			//adding the components to the wrist panel
			wristPnl.add(title);
			wristPnl.add(wristDiagram);
			wristPnl.add(explanation);
			wristPnl.add(wristExerciselabel);
			wristPnl.add(advice);
		}
		//if the spine button was pressed
		else if (Main.type.equals("Spine")) {
			//spine panel
			frame.add(spinePnl);
			spinePnl.setLayout(null);
			spinePnl.setBackground(Color.decode("#FFE1E1"));
			//back button
			spinePnl.add(backButton);
			//spine title
			title.setText("Spine");
			//spine diagram
			spineDiagram.setBackground(Color.ORANGE);
			spineDiagram.setOpaque(true);
			spineDiagram.setBounds(50,150,500,300);
			//spine advice
			advice.setText("<html>Advice:<br/>"
					+ "Get an ergonomic chair<br/>"
					+ "Take frequent exercise breaks (walk around, do physical activities, etc)<br/>"
					+ "Get a back brace to wear when you sit for long periods of time<br/>"
					+ "Get an adjustable standing desk<br/>"
					+ "<html>");
			//spine explanation
			explanation.setText("<html>Long term sitting results in pressure on the spine. If your technology is not in a good position, you would have to hunch/bend down in order to look at your screen, which leads to a hunched back and bad posture. Inadequate back support causes tense and straining of the back muscles, which can lead to chronic back pain."
					+ "<br/>"
					+ "Symptoms:<br/>"
					+ "- Back pain \n"
					+ "- Inability to move around easily (feeling sore)<br/>"
					+ "- Inability to sit for long periods of time<br/>"
					+ "- Hunch back<br/>"
					+ "- Bad posture<br/>"
					+ "<html>");
			//spine exercise gif
			spineElabel.setBounds(1030,475,360,340);
	    	spineicon.setImage(spineicon.getImage().getScaledInstance(360, 340, Image.SCALE_DEFAULT));
	    	spineElabel.setIcon(spineicon);
	    	//adding the components to the spine panel
			spinePnl.add(title);
			spinePnl.add(spineDiagram);
			spinePnl.add(explanation);
			spinePnl.add(spineElabel);
			spinePnl.add(advice);
		}
		//if the neck button was pressed
		else if (Main.type.equals("Neck")) {
			//neck panel
			frame.add(neckPnl);
			neckPnl.setLayout(null);
			neckPnl.setBackground(Color.decode("#D6EFED"));
			//back button
			neckPnl.add(backButton);
			//setting the exercise gif on the panel
			neckExerciseDiagram.setBounds(890,490,490,270);
			neckPnl.add(neckExerciseDiagram);
			//neck title
			title.setText("Neck");
			//neck diagram
			neckDiagram.setBackground(Color.ORANGE);
			neckDiagram.setOpaque(true);
			neckDiagram.setBounds(50,150,500,300);
			//neck advice
			advice.setText("<html>Advice:<br/>"
					+ "Perform at-home exercises.<br/> "
					+ "use ergonomic princples to set up your workspace. For example, keep your screen at eye<br/> "
					+ "level.<br/>"
					+ "Use over-the-counter, nonsteroidal, and antiinflammatory medication to relieve stiffness <br/>"
					+ "and pain.<br/>"
					+ "Get a neck massage.<br/>"
					+ "Use Voltaren, a pain relieving gel, on your neck daily. <br/>"
					+ "</html>"); 
			//neck explanation
			explanation.setText("<html><br/>"
					+ "More often than not, we tilt our head down in order to look at our technology, whether it's a phone or a laptop, and this is not good for your neck because it has to contract in order to keep our head up.<br/>"
					+ " <br/>"
					+ "When we constantly look down, our neck has to work harder to support our head. In fact, tolting your head down at a 45 degree angle is equivalent to putting a 60 kilogram weight around your neck. Since our muscles are working overtime, this can lead to pain and discomfort.<br/>"
					+ " <br/>"
					+ "Symptoms: <br/>"
					+ "- Neck pain<br/>"
					+ "- Inability to move the neck<br/>"
					+ "- Common neck crepitus (aka neck popping)<br/>"
					+ "- A sharp, stabbing pain in one part of the neck<br/>"
					+ "<html>");
			//adding the components to the neck panel
			neckPnl.add(title);
			neckPnl.add(neckDiagram);
			neckPnl.add(explanation);
			neckPnl.add(advice);
		}
		//if the eye button was pressed
		else if (Main.type.equals("Eye")) {
			//eye panel
			frame.add(eyePnl);
			eyePnl.setLayout(null);
			eyePnl.setBackground(Color.decode("#AEBDCA"));
			//back button
			eyePnl.add(backButton);
			//eye title
			title.setText("Eye Strain");
			//eye diagram
			eyeDiagram.setBackground(Color.ORANGE);
			eyeDiagram.setOpaque(true);
			eyeDiagram.setBounds(50,150,500,300);
			//eye advice
			advice.setText("<html>Symptoms:<br/>"
					+ "- Headache<br/>"
					+ "- Dry, irritated, red, eyes<br/>"
					+ "- Blurry vision <br/>"
					+ "- Double vision<br/>"
					+ "- Watery eyes<br/>"
					+ "- Tiredness<br/>"
					+ "Advice:<br/>"
					+ "- Once you notice blurry vision, it is best to book an appointment with your eye doctor<br/>"
					+ "and do a check-up. <br/>"
					+ "- Get blue light glasses. They help in blocking a fraction of the harmful blue light rays <br/> "
					+ "emitted from the screen.<br/> "
					+ "- If your eyes feel dry, try purchasing eye drops from local pharmacies to hydrate your eyes. <br/>"
					+ "- Make sure there is no glare casted on your computer screen due to the lighting position <br/>"
					+ " and that your screen should be at eye level. <br/> "
					+ "- At night, adjust the brightness of your screen. <br/>"
					+ "- Additionally, the color of the light can be adjusted in settings.<br/>"
					+ "Warm yellow is preferred by most people because it is less intense than white.<br/> "
					+ "</html>"); 
			//eye explanation
			explanation.setText("<html>Looking at a screen for prolonged periods of time makes your eye muscles have to strain for them to focus. "
					+ "When your eyes focus on a screen, you don’t blink as frequently, leading to dry eyes. Additionally, LED devices emit "
					+ "blue light, which suppresses the secretion of melatonin, making it hard for you to fall asleep. Many people experience "
					+ "computer vision syndrome, which are dry, irritated, and red eyes. This makes it hard for your eyes to focus on anything,"
					+ " which can lead to permanent vision problems, such as blurred vision and near-sightedness. Many individuals found themselves "
					+ "wearing glasses or a need to get stronger glasses after prolonged exposure to LED screens.<html>");
			//adding the components to the eye panel
			eyeRecommendations.setBounds(940,475,450,340);
			eyePnl.add(title);
			eyePnl.add(eyeDiagram);
			eyePnl.add(explanation);
			eyePnl.add(eyeRecommendations);
			eyePnl.add(advice);
		}
		//if the fingers button was pressed
		else if (Main.type.equals("Finger")) {
			//finger panel
			frame.add(fingerPnl);
			fingerPnl.setLayout(null);
			fingerPnl.setBackground(Color.decode("#C9BBCF"));
			headPnl.add(backButton);
			//setting the exercise gif on the panel
			fingericon.setImage(fingericon.getImage().getScaledInstance(470, 280, Image.SCALE_DEFAULT));
			fingerlabel.setIcon(fingericon);
			fingerlabel.setBounds(910,490,490,280);
			fingerPnl.add(fingerlabel);
			//back button
			fingerPnl.add(backButton);
			//finger title
			title.setText("Fingers");
			//finger diagram
			fingerDiagram.setBackground(Color.ORANGE);
			fingerDiagram.setOpaque(true);
			fingerDiagram.setBounds(50,150,500,300);
			//finger advice
			advice.setText("<html>Advice:<br/>"
					+ "Perform at-home hand exercises to release the tension in your tendons and muscles.<br/> "
					+ "Use software such as the voice-to-text feature to minimize the amount of typing you do.<br/>"
					+ "When you're not typing, rest your fingers instead of holding them in an upright position.<br/>"
					+ "Keep your fingernails reasonably short to make typing an easier activity.<br/>"
					+ "Use ergonomically correct alternatives to mouses such as joystick mouses and vertical mouses.<br/>"
					+ "Wear finger splints to relieve any joint pain.<br/>"
					+ "</html>"); 
			//finger explanation
			explanation.setText("<html><br/>"
					+ "Pain in the fingers can be caused by overuse of technology, especially phones and computers or laptops. This condition is often called tendinitis, gamer's thumb, and texting thumb.<br/>"
					+ " <br/>"
					+ "The repetitive motions one goes through while using technology, such as typing, leads to inflammation and soreness because a lot of stress is out on our finger's muscles, nerves, and tendons. <br/>"
					+ " <br/>"
					+ " The fingers get cramped after overuse and are not able to relax, causing more pain.<br/>"
					+ " <br/>"
					+ "Symptoms: <br/>"
					+ "- Pain in the fingers<br/>"
					+ "- Inability to move fingers freely<br/>"
					+ "- Swollen or red knuckles<br/>"
					+ "<html>");
			//adding the components to the finger panel
			fingerPnl.add(title);
			fingerPnl.add(fingerDiagram);
			fingerPnl.add(explanation);
			fingerPnl.add(advice);
		}
		//if the head button was pressed
		else if (Main.type.equals("Head")) {
			//adding head panel to the frame
			frame.add(headPnl);
			headPnl.setLayout(null);
			headPnl.setBackground(Color.decode("#FEBE8C"));
			//chaning head title to headache
			title.setText("Headache");
			//setting bounds forhead diagram picture
			headDiagram.setBounds(50,150,500,300);
			//change the advice label to head advice
			advice.setText("<html> Advice:<br/>"
					+ "The best cure for all technology-caused pain is to minimize the time spent in front of a screen. If that is not possible, try:<br/>"
					+ "- 20-20-20 rule: try to look at nature 20 feet away for 20 seconds every 20 minutes in front of the screen to relax your eyes. <br/>"
					+ "- Adjust the lighting: try to use warm yellow or warm white for the room light. Make sure it is not too harsh or too dark<br/>"
					+ "- Medicine: take tylenol, advil, or any painkillers to reduce the pain from headaches<br/>"
					+ "<html>");
			//change the explanation label to head explanation
			explanation.setText("<html>Overuse of electronic devices results in headaches. When you have a headache, the pain and pressure can make"
					+ " it difficult to function. They may last a few hours to a few days.<br/>"
					+ " <br/>"
					+ "Cervicogenic headaches are caused by poor postures at your workstation, which are caused by severe cervical muscle inflammation and tightness.<br/>"
					+ " <br/>"
					+ "Migraine headaches are caused by light sensitivity from the screens. Eye strain, brightness, blue light and screen flickering can trigger migraines.<br/>"
					+ " <br/>"
					+ "Symptoms: <br/>"
					+ "- Throbbing or pulsing pain on one or both sides of the head<br/>"
					+ "- Usually connected to eye strains<br/>"
					+ "<html>");
			//adding the components to the head panel
			headPnl.add(backButton);
			headPnl.add(title);
			headPnl.add(headDiagram);
			headPnl.add(explanation);
			headPnl.add(advice);
		}
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==backButton) {
			new Main();
			frame.dispose();
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
