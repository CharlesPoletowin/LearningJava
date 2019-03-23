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
            jTextArea.append("����ڰ�Ŧ���϶�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JTextField)
            jTextArea.append("������ı������϶�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JFrame)
            jTextArea.append("����ڴ������϶�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
    }
	@Override
    public void mouseMoved(MouseEvent e) {
        if(e.getSource() instanceof JButton)
            jTextArea.append("����ڰ�Ŧ���ƶ�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JTextField)
            jTextArea.append("������ı������ƶ�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JFrame)
            jTextArea.append("����ڴ������ƶ�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
    }
}
