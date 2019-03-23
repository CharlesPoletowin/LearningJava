package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEvent implements ActionListener{
	TextArea textArea;

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyDialog myDialog=new MyDialog(null,"",textArea);
        myDialog.setVisible(true);
    }
}
