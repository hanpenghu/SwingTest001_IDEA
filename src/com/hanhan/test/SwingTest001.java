package com.hanhan.test;

import javax.swing.JFrame;

/**
 * Created by hanhan on 2017-07-01.
 */
public class SwingTest001 {
    //创建一个顶层窗口
    public  void f(){
        int width=300;
         int heigth=200;
        JFrame jf=new JFrame("Hello Swing !!!");
        //设置窗口的大小
        jf.setSize(width,heigth);
        //使得窗口上的最大化,最小化,关闭键起作用
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);//让前面创建的窗口显示出来
    }
    public static void main(String[]args){
       new SwingTest001().f();
    }
}
