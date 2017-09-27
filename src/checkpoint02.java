import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint02 {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hi");
	String TVFav=JOptionPane.showInputDialog( "what is your favorite TV show?");
	JOptionPane.showMessageDialog(null, TVFav +" is my faviorte too");
	JOptionPane.showMessageDialog (null, "cool");
	
	Robot john=new Robot ();
	john.setSpeed(10);
	john.penDown();
	john.turn(60);
	john.move(200);
	john.turn(120);
	john.move(200);
	john.turn(120);
	john.move(200);
	john.hide();

}
}
