import javax.swing.JFrame;
import javax.swing.JLabel;

public class BasicWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame myWindow = new JFrame();

		myWindow.setSize(200, 400);

		JLabel myLable = new JLabel("Please dont click that button!");

		myWindow.getContentPane().add(myLable);

		myWindow.setVisible(true);

	}

}
