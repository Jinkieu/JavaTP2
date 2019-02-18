package com.company;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g) {
        System.out.println("paintComponent invoque");
        g.fillOval(20,20,75,75);
    }
}
