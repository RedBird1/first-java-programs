import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Zach
 *
 */
public class FirstMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JMenu displayMenu = new JMenu(" fdsaafasdfasfas");

		JFrame menuFrame = new JFrame();
		JPanel panel = new JPanel();
		menuFrame.getContentPane().add("Center", panel);
		menuFrame.setSize(5000,400000);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.pack();
		menuFrame.setVisible(true);
		
		
		
	}

}
