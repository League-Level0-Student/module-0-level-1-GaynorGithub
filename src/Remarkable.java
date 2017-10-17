import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name, friend?");
	if(name.equalsIgnoreCase("Sam")) {
		JOptionPane.showMessageDialog(null, "Hey Sam, you are the best person ever. I know this because I am you.");
	}
	else if(name.equalsIgnoreCase("Ian")) {
		JOptionPane.showMessageDialog(null, "Hey Ian, stop pretending your name is Tate.");
	}
	else if(name.equalsIgnoreCase("Tate")) {
		JOptionPane.showMessageDialog(null, "Hey Tate, stop pretending your name is George");
	}
	else if(name.equalsIgnoreCase("Neal")) {
		JOptionPane.showMessageDialog(null, "Hey Neal, stop pretending your name is George");
	}
	else if(name.equalsIgnoreCase("Peter")) {
		JOptionPane.showMessageDialog(null, "Hey Peter, you were the only one besides Andrew and Jackie to tell me your real name. So thanks.");
	}
	else if(name.equalsIgnoreCase("Andrew")) {
		JOptionPane.showMessageDialog(null, "Hey Andrew, you are an interesting person... It is up to you to interpret what that means.");
	}
	else if(name.equalsIgnoreCase("Jackie")) {
		JOptionPane.showMessageDialog(null, "Hey Jackie, you are a cool teacher");
	}
	else {
	JOptionPane.showMessageDialog(null, "YOU ARE NOT IN THIS CLASS. COMMENCING MISSILE DESTRUCTION SEQUENCE.");	
	}
	}
	}

	
