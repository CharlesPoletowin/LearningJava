package Event;

import java.awt.*;
import javax.swing.*;

public class WindowMouse extends JFrame{
	JButton button;
    JTextArea textArea;
    JTextField textField;
    MousePolice mousePolice;
    MouseMotion mouseMotion;
    MouseFocus mouseFocus;
	   
	WindowMouse() {
	      init();
	      setBounds(100,100,420,300);
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	   }
	   
	public void init(){
        setTitle("处理鼠标事件");
        textField=new JTextField(8);
        textArea=new JTextArea(18,28);
        setLayout(new FlowLayout());
        button=new JButton("按钮");
        mousePolice=new MousePolice();
        mouseMotion=new MouseMotion();
        mouseFocus=new MouseFocus();
        mouseMotion.setjTextArea(textArea);
        mousePolice.setjTextArea(textArea);
        mouseFocus.setjTextArea(textArea);
        addMouseListener(mousePolice);
        addMouseMotionListener(mouseMotion);
        textField.addMouseListener(mousePolice);
        textField.addMouseMotionListener(mouseMotion);
        textField.addFocusListener(mouseFocus);
        button.addMouseListener(mousePolice);
        button.addMouseMotionListener(mouseMotion);
        add(button);
        add(textField);
        add(new JScrollPane(textArea));
    }
}
