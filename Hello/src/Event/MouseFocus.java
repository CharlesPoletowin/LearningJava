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
            jTextArea.append("�ı����ý���\n");
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource() instanceof JTextField)
            jTextArea.append("�ı���ʧȥ����\n");
    }
}
