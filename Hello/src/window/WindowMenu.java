package window;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowMenu extends JFrame{
	JMenuBar MenuBar;
	JMenu menu,menu2,menu3,menu4,itemFormat;
	JMenuItem itemNew,itemOpen,itemClose,itemSave,itemChangeSave,itemExit,item1;
	ButtonGroup group;
	JRadioButton radio1,radio2;
	public WindowMenu(){}
	public WindowMenu(String s,int x,int y,int w,int h) {
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setBackground(Color.cyan);
		getContentPane().setBackground(Color.red);
		getContentPane().setVisible(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	}
	void init(String s) {
		setTitle(s);
		MenuBar = new JMenuBar();
		itemFormat = new JMenu("文件格式");
		menu=new JMenu("菜单");
		menu2=new JMenu("编辑");
		menu3=new JMenu("视图"); 
		menu4=new JMenu("帮助"); 
		itemNew=new JMenuItem("新建文件");
		itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK));
		itemOpen=new JMenuItem("打开文件");
		itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		itemClose=new JMenuItem("关闭文件");
		itemClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_MASK));
		itemSave=new JMenuItem("保存文件");
		itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));
		itemChangeSave=new JMenuItem("文件另存为");
		itemExit=new JMenuItem("退出");
		menu.add(itemNew);
		menu.add(itemOpen);
		menu.add(itemClose);
		menu.addSeparator();
		menu.add(itemFormat);
		itemFormat.add(new JCheckBox("Java文件"));
		itemFormat.add(new JCheckBox("Txt文件"));
		itemFormat.addSeparator();
		group=new ButtonGroup();
		radio1=new JRadioButton("只读");
		radio2=new JRadioButton("可写");
		group.add(radio1);
		group.add(radio2);
		itemFormat.add(radio1);
		itemFormat.add(radio2);
		menu.add(itemSave);
		menu.add(itemChangeSave);
		menu.addSeparator();
		menu.add(itemExit);
		MenuBar.add(menu);
		MenuBar.add(menu2);
		MenuBar.add(menu3);
		MenuBar.add(menu4);
		setJMenuBar(MenuBar);
	}
}
