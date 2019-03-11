package com.company;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g) {

        int x1= this.getWidth()/4;
        int y2 = this.getHeight()/4;



        System.out.println("paintComponent invoque");
       g.drawString("Bogoss Mascado",this.getWidth()/4,this.getHeight()/2);
    }

}

