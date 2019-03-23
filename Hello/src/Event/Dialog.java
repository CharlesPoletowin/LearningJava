package Event;

import javax.swing.*;
import java.awt.*;

public class Dialog extends JFrame{
	JButton button;
    TextArea textArea;
    DialogEvent dialogEvent;
    Dialog(){
    	init();
        setBounds(100,100,600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void init(){
        button=new JButton("打开对话框");
        textArea=new TextArea();
        setLayout(new BorderLayout());
        dialogEvent=new DialogEvent();
        dialogEvent.setTextArea(textArea);
        button.addActionListener(dialogEvent);

        add(button,BorderLayout.NORTH);
        add(textArea,BorderLayout.CENTER);
    }
    public static void main(String argv[]) {
    	Dialog a=new Dialog();
    }
}
