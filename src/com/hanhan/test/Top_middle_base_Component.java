package com.hanhan.test;

import javax.swing.*;

/**
 * Created by Administrator on 2017-07-02.
 */
public class Top_middle_base_Component {
    /**
     *按钮必须放在面板再放入窗口中才会呈现
     * */

    public void f(){
        //顶层容器
        JFrame jf=new JFrame("测试窗口！");//窗体
        //中间容器
        JPanel jp=new JPanel();//面板
        //创建一个基本组件
        JButton jb=new JButton("这是一个测试按钮");//按钮
        //将中间件放在顶层件中
        jf.setContentPane(jp);
        //将基本件放入中间件
        jp.add(jb);
        //调整大小
        jf.setSize(300,200);
        //使得窗口上的最大化,最小化,关闭键起作用
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }

    public static void main(String[]args){
        new Top_middle_base_Component().f();
    }


}
