package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("Test");
    private JButton Un = new JButton("Un");
    private JButton Deux = new JButton("Deux");
    private JButton Trois = new JButton("Trois");

    public Fenetre() {

        this.setTitle("TP3 Java");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        pan.add(bouton);
        pan.add(Un);
        //System.out.println(Un);
        //pan.add(Deux);
        //pan.add(Trois);
        Deux = addBoutton("Deux");
        System.out.println(Deux);
        Trois = addBoutton("Trois");
        System.out.println(Trois);
        this.setContentPane(pan);

        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test clic");
            }
        });

        Un.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fenetre.this.setTitle("Un");
            }
        });

        Deux.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fenetre.this.setTitle("Deux");
            }
        });

        Trois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fenetre.this.setTitle("Trois");
            }
        });

        /**
         * Exercice 3 Bis
         *
        Trois.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fenetre.this.setTitle("Trois");
            }
        });*/
    }

    public JPanel getpan(){ return pan; }

    public JButton addBoutton(String name){
        JButton bouton_tmp = new JButton(name);
        pan.add(bouton_tmp);
        return bouton_tmp;
    }
}

