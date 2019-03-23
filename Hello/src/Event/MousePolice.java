package Event;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePolice implements MouseListener {
    JTextArea jTextArea;

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()>1){
            this.jTextArea.setText("�������"+e.getClickCount()+"�Σ�λ��:"+"("+e.getX()+","+e.getY()+")\n");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jTextArea.append("��갴��,λ��:"+"("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jTextArea.append("����ͷ�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton)
            jTextArea.append("�����밴Ŧ,λ��:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JTextField)
            jTextArea.append("�������ı���,λ��:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JFrame)
            jTextArea.append("�����봰��,λ��:"+"("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jTextArea.append("����˳�,λ��:"+"("+e.getX()+","+e.getY()+")\n");
    }
}

