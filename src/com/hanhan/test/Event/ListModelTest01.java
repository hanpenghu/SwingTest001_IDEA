package com.hanhan.test.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListModelTest01 extends JFrame {
    ////////////////////////////////////////////////////////////////////
    void f() {





        Container contentPane = this.getContentPane();



        ListModel model=new AbstractListModel() {
            String[]s={"主板","显示器","内存","cpu","硬盘","电源","键盘","鼠标"};
            @Override
            public int getSize() {
                return s.length;
            }

            @Override
            public Object getElementAt(int index) {
                return (index+1)+"："+s[index++];
            }
        };


        JList list=new JList(model);
        list.setVisibleRowCount(5);//设置程序一打开时候能看到的数据个数
        list.setBorder(BorderFactory.createTitledBorder("配置一台电脑所需要的组件"));
        contentPane.add(new JScrollPane(list));
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {//这个可以用this.setDefaultCloseOperation(EXIT_ON_CLOSE);代替
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });











    }

    ////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        new ListModelTest01().f();
    }

//////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////