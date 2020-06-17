package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String answer= JOptionPane.showInputDialog("Do you know how to write code? (yes or no)");
		// 2. If they say "yes", tell them they will rule the world.
		if( answer.equals("yes") ) {
			JOptionPane.showMessageDialog(null, "You will rule the World!");

		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		else if( answer.equals("no") ) {
		JOptionPane.showMessageDialog(null,"You should sign up for classes at The League");
		}
		else {JOptionPane.showMessageDialog(null,"oh, cool! answer yes or no next time though");

			
		}

	}
}

