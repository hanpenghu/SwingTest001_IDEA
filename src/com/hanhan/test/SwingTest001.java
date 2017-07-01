package com.hanhan.test;

import javax.swing.JFrame;

/**
 * Created by hanhan on 2017-07-01.
 */
public class SwingTest001 {
    public  void f(){
        int width=300;
         int heigth=200;
        JFrame jf=new JFrame("Hello Swing !!!");
        jf.setSize(width,heigth);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String[]args){
       new SwingTest001().f();
    }
}
