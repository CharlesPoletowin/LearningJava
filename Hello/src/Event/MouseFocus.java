package Event;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MouseFocus implements FocusListener{
	JTextArea jTextArea;

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() instanceof JTextField)
            jTextArea.append("文本框获得焦点\n");
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource() instanceof JTextField)
            jTextArea.append("文本框失去焦点\n");
    }
}
