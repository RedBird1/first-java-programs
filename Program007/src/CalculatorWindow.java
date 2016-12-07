import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Zach
 * 
 *         This Class consists of a constructor that build the calculator window
 *         using JFrame. This Class also conatins private helper methods to
 *         initialize and add components. There are sub classes with in the
 *         CalculatorWindow class that have action listeners that perform events
 *         when fired.
 *
 */

public class CalculatorWindow extends JFrame {

	// private JFrame calculatorWindow = new JFrame();
	// Button Arrays.
	private JButton numberButtons[] = new JButton[10];
	private JButton functionButtons[] = new JButton[8];
	private JButton allButtons[];

	// BorderLayout- main panel.
	// private JPanel mainPanel = new JPanel();
	private JPanel numberPanel = new JPanel();
	private JPanel functionPanel = new JPanel();

	// input line
	private String inputDisplay;
	private String tempNum1;
	private String tempNum2;

	/**
	 * Default constructor
	 * 
	 * sets the window visible and at default dimensions
	 * 
	 */
	public CalculatorWindow() {
		// mainPanel.setLayout(new BorderLayout(10, 0));
		this.setLayout(new BorderLayout(10, 0));
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add number buttons to number panel.
		addNumberButtons();
		addFunctionButtons();
		this.add(numberPanel, BorderLayout.CENTER);
		this.add(functionPanel, BorderLayout.EAST);

	}

	/**
	 * Helper method initializes the numberButtons array, then adds the buttons
	 * to the nummberPanel. The number panel consistes of numbers 0-9
	 * ".', and "C"
	 */
	private void addNumberButtons() {
		numberPanel.setLayout(new GridLayout(4, 3));
		NumberButtonListener numberListener = new NumberButtonListener();
		for (int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(Integer.toString(i));
			numberButtons[i].addActionListener(numberListener);
			numberPanel.add(numberButtons[i]);
		}
		numberPanel.add(new JButton("."));
		numberPanel.add(new JButton("C"));

	}

	/*
	 * Helper method initializes the function buttons and adds them to the
	 * functions panel
	 */
	private void addFunctionButtons() {
		functionPanel.setLayout(new GridLayout(5, 1));
		// add the functionButtons to the panel and initialize the button array.
		functionPanel.add(functionButtons[0] = new JButton("x"));
		functionPanel.add(functionButtons[1] = new JButton("+"));
		functionPanel.add(functionButtons[2] = new JButton("/"));
		functionPanel.add(functionButtons[3] = new JButton("-"));
		functionPanel.add(functionButtons[4] = new JButton("="));
		functionPanel.add(functionButtons[5] = new JButton("-/+"));
	}

	/**
	 * This is an inner class to the calculator window that adds functionallity
	 * to the number buttons.
	 * 
	 * @author Zach
	 *
	 */
	private class NumberButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//This will get the source of the action which is the button.
			JButton actionButton = null;
			for (int i =0; i< numberButtons.length; i++)
			{
				if (e.getSource()==numberButtons[i])
				{
					actionButton=numberButtons[i];
				}
			
			}
			System.out.println(actionButton.getText());
			
			

		}

	}

	/**
	 * This is an inner class to the calculator window that assd functionallity
	 * to the clear button
	 * 
	 * @author Zach
	 *
	 */
	private class ClearAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
