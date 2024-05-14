package technologicalHealthProject;
/*
 * Manahill Sajid and Hannah Ye
 * December 16, 2022
 * Purpose: Create the background that will be used not only in the login class, 
 * but also the SignUpWindow class and the Main class.
 */
import java.awt.*;
import javax.swing.*;
public class LoginPanel extends JPanel{

	Image  medBackground;
	public LoginPanel() {
    	super();
    	Toolkit kit = Toolkit.getDefaultToolkit();
    	medBackground = kit.getImage("medBackground.jpg");
	}
	/*
	 * Purpose: This method is used when it’s time to “paint” and it is what renders the component, 
	 * in this case the background, onto the screen.
	 * pre: Graphics comp (allows the code to draw the component)
	 */
	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D) comp;
		comp2D.drawImage(medBackground, 0, 0, this);
	}

}
