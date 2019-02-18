package com.company;

import javax.swing.*;

public class Decouverte extends JFrame {
    public Decouverte() {
        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java");
        fenetre.setSize(400, 400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

        // Creation d'un objet Jpanel
        JPanel pan = new JPanel();
        fenetre.setContentPane(pan);
        fenetre.setVisible(true);
    }
}
