package com.hanhan.test.Event;

import javax.swing.*;
import java.awt.*;

public class DefaultListModelTest01 extends JFrame {
    String[]s={"主板","显示器","内存","cpu","硬盘","电源","键盘","鼠标"};
 ////////////////////////////////////////////////////////////////////////////////////////
   public void f(){
       Container c = this.getContentPane();
       DefaultListModel dl=new DefaultListModel();
       for(int i=0;i<s.length;i++){
           dl.addElement((i+1)+"："+s[i]);
       }
       JList list=new JList(dl);
       list.setVisibleRowCount(3);
       list.setBorder(BorderFactory.createTitledBorder("电脑配件!!"));
       c.add(new JScrollPane(list));
       this.setLocation(300,300);
       this.pack();
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setVisible(true);

////////////////////////////
   }
/////////////////////////////////////////////////////


    public static void main(String[]args){
        new DefaultListModelTest01().f();
    }














/////////////////////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////////////////////////