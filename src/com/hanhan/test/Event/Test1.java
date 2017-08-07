package com.hanhan.test.Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 {
    static final int width=300;
    static final int height=200;
    static JTextField jtf=new JTextField(20);
    public static void main(String[]args){
        JFrame jf=new JFrame("测试程序！！！");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp=new JPanel();
        jp.setLayout(new BorderLayout());
        jf.setContentPane(jp);
        JButton jb=new JButton("清空文本框中的信息！！！");
        jp.add(jtf,"North");
        jp.add(jb,"South");
        jf.setVisible(true);


        ActionListener ac=new ActionHandler();
        jb.addActionListener(ac);
    }
}

class ActionHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        new Test1().jtf.setText("");
    }
}