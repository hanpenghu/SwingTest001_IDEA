package com.hanhan.test;

import javax.swing.*;

/**
 * Created by Administrator on 2017-07-02.
 */
public class MenuTest001 {
    public static void main(String[]args){
        new MenuTest001().f();
    }

    private void f() {
        JFrame jf=new JFrame("Hello Swing !!!");
        jf.setTitle("学生管理系统");
//设置窗口的大小
        jf.setSize(400,400);
//使得窗口上的最大化,最小化,关闭键起作用
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //添加菜单条组件
        JMenuBar jmb=new JMenuBar();
        jf.setJMenuBar(jmb);
        //创建菜单组件
        JMenu jm1=new JMenu("文件");
        JMenu jm2=new JMenu("编辑");
        JMenu jm3=new JMenu("视图");
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);

        //创建菜单项组件
        JMenuItem jmi1=new JMenuItem("打开");
        JMenuItem jmi2=new JMenuItem("保存");
        JMenuItem jmi3=new JMenuItem("打印");
        JMenuItem jmi4=new JMenuItem("退出");
        jm1.add(jmi1);
        //菜单之间添加分隔线
        jm1.addSeparator();
        jm1.add(jmi2);
        jm1.addSeparator();
        jm1.add(jmi3);
        jm1.addSeparator();
        jm1.add(jmi4);







//让前面创建的窗口显示出来//这句话在最后上面才会出现,
        jf.setVisible(true);

    }
}
