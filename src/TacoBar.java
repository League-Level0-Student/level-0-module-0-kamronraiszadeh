import javax.swing.JOptionPane;

public class TacoBar {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("How many tacos would you like ");
		String meat =JOptionPane.showInputDialog ("What type of meat do you want in your taco"); 
		String drinks= JOptionPane.showInputDialog ("what do you want to drink");
		JOptionPane.showMessageDialog (null,"You ordered " +number+ " tacos with " +meat+ " inside them with " +drinks+ " to drink");
		
		
	}

}
