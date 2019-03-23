package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyDialog extends JDialog implements ActionListener{
	JTextField jTextField;
    String string;
    TextArea textArea;

    MyDialog(JFrame f,String s,TextArea textArea){
        super(f,s);
        setTextArea(textArea);
        setLayout(new FlowLayout());
        jTextField=new JTextField(10);
        jTextField.addActionListener(this);
        jTextField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                actionPerformed(null);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        add(new JLabel("输入相关信息至主窗口"));
        add(jTextField);
        setBounds(60,60,300,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        string=jTextField.getText();
        if(string!=null){
            textArea.append(string+"\n");
        }
    }
}
