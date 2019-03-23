package demoGUI;
import javax.swing.*;
import java.awt.*;
public class jFrameDemo {
	public static void main(String args[]) {
		JFrame window1= new JFrame("test for JFrame");
		Container con=window1.getContentPane();
		window1.setBounds(20, 100, 1200, 500);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
