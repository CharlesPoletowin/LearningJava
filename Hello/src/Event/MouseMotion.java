package Event;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotion implements MouseMotionListener{
	JTextArea jTextArea;
	public void setjTextArea(JTextArea jTextArea1) {
		this.jTextArea = jTextArea1;
	}
	
	@Override
    public void mouseDragged(MouseEvent e) {
        if(e.getSource() instanceof JButton)
            jTextArea.append("鼠标在按纽上拖动,位置:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JTextField)
            jTextArea.append("鼠标在文本框上拖动,位置:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JFrame)
            jTextArea.append("鼠标在窗口上拖动,位置:"+"("+e.getX()+","+e.getY()+")\n");
    }
	@Override
    public void mouseMoved(MouseEvent e) {
        if(e.getSource() instanceof JButton)
            jTextArea.append("鼠标在按纽上移动,位置:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JTextField)
            jTextArea.append("鼠标在文本框上移动,位置:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JFrame)
            jTextArea.append("鼠标在窗口上移动,位置:"+"("+e.getX()+","+e.getY()+")\n");
    }
}
