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
            this.jTextArea.setText("鼠标连击"+e.getClickCount()+"次，位置:"+"("+e.getX()+","+e.getY()+")\n");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jTextArea.append("鼠标按下,位置:"+"("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jTextArea.append("鼠标释放,位置:"+"("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton)
            jTextArea.append("鼠标进入按纽,位置:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JTextField)
            jTextArea.append("鼠标进入文本框,位置:"+"("+e.getX()+","+e.getY()+")\n");
        if(e.getSource() instanceof JFrame)
            jTextArea.append("鼠标进入窗口,位置:"+"("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jTextArea.append("鼠标退出,位置:"+"("+e.getX()+","+e.getY()+")\n");
    }
}

