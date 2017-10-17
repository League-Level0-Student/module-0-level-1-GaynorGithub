import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String day = JOptionPane.showInputDialog("What is your birthday? (mm/dd)");
	if (day.equals("10/16")) {
		JOptionPane.showMessageDialog(null, "I wish you a happy birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Well then I wish you a merry UNBIRTHDAY.");
		
	}
	}
}
	
