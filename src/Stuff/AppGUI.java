package Stuff;

import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class AppGUI extends JFrame {

    JLabel welcome;
    JMenu menu;
    JMenuItem i1, i2, i3;

    public AppGUI(String title, int x, int y){

        //JFrame
        this.setTitle(title);
        this.setSize(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);

        //JLabels
        welcome = new JLabel( "Welcome User to this pointless app.", SwingConstants.CENTER);
        this.add(welcome);

        welcome.setFont(new Font("Serif", Font.PLAIN, 15));
        welcome.setForeground(Color.GREEN);

//menu and menu bar
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("Menu");
        i1=new JMenuItem("Item 1");
        i2=new JMenuItem("Item 2");
        i3=new JMenuItem("Item 3");

        i1.setForeground(Color.GREEN);
        i2.setForeground(Color.GREEN);
        i3.setForeground(Color.GREEN);
        menu.setForeground(Color.GREEN);

        i1.setBackground(Color.DARK_GRAY);
        i2.setBackground(Color.DARK_GRAY);
        i3.setBackground(Color.DARK_GRAY);
        mb.setBackground(Color.DARK_GRAY);
        menu.setBackground(Color.DARK_GRAY);


        menu.add(i1); menu.add(i2); menu.add(i3);

        mb.add(menu);
        this.setJMenuBar(mb);



        // always put this last
        this.setVisible(true);
    }
}

