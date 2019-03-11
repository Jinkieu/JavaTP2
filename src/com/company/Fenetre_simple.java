package com.company;

import javax.swing.*;
import java.awt.*;


public class Fenetre_simple extends JFrame
{

    private JPanel container = new JPanel();
    private JComboBox combo = new JComboBox();
    JButton button = new JButton("OK");


    public Fenetre_simple() {

        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java exo1");

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        fenetre.setSize(400, 600);


        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        JPanel top = new JPanel();


        JPanel ok = new JPanel();
        ok.add(button);
        container.add(top);
        container.add(ok, BorderLayout.SOUTH);
        this.setContentPane(container);


        this.setVisible(true);
    }


}
