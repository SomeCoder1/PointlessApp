package Stuff;

import javax.swing.*;

public class AppGUI extends JFrame {
    public AppGUI(String title, int x, int y){
        this.setTitle(title);
        this.setSize(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
