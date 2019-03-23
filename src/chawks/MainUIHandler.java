package chawks;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


/**
 * A UI built to create a simulacrum of the hardware configuration setup the FTC robot control apps use to map
 * hardware to identifiers. While this will not actually look for actual hardware, it will create an environment so
 * that it looks like it is. This is to demonstrate an accurate representation of our systems to people so they can
 * try it out without actually using and possibly breaking our actual systems.
 * @author Isaac Blum
 *
 */
public class MainUIHandler extends JPanel {
	private JLabel titleLabel;
	private JButton whyNot;
	public MainUIHandler() {
		setLayout(new BorderLayout());
		titleLabel = new JLabel("Hardware Configuration Setup");
		titleLabel.setFont(new Font("times roman",Font.BOLD,18));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		whyNot = new JButton("This is a large button put here for testing purposes. Why not press the button?");
		whyNot.addActionListener(new WhyNotDialog());
		add(whyNot,BorderLayout.CENTER);
		add(titleLabel,BorderLayout.NORTH);
	}
	/**
	 * A pretty much useless action listener that is solely used to pop up a useless dialog that tells the user
	 * what they did to bring the dialog up. Then, when the dialog is closed, nothing happens because as I said
	 * this action listener is pretty much completely useless in every way. Enjoy regardless.
	 * @author Isaac Blum
	 */
	private class WhyNotDialog implements ActionListener {
		/**
		 * This method represents the code that will run when the action listener it is within is triggered. This
		 * can mean different things depending on the attached UI element. In this case, it pops up a dialog, the
		 * content of which never changes, simply telling the user that they pressed the button that the action
		 * listener that this method is within was activated.
		 * @param e (ActionEvent) The action event performed and the associated information.
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(new JFrame(), "You clicked the large button.", "Useless Dialog", JOptionPane.WARNING_MESSAGE);
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("DnD Character Creator Main Menu");
		frame.setSize(600,500);
		frame.setLocation(200, 200);
		frame.setContentPane(new MainUIHandler());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
