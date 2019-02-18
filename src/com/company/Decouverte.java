package com.company;

import javax.swing.*;
import java.awt.*;

public class Decouverte extends JFrame {
    private JPanel container = new JPanel();
    private JButton button = new JButton("Entrer");
    private JLabel text = new JLabel("Pseudo");
    private JPanel pan1 = new JPanel();
    private JPanel pan2 = new JPanel();
    private JPanel pan3 = new JPanel();
    private JTextField textField = new JTextField(10);

    public Decouverte() {
        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java");
        fenetre.setSize(400, 400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);

        textField.setToolTipText("Victor est beau");
        pan1.add(button);
        pan2.add(text);
        pan3.add(textField);
        container.add(pan2);
        container.add(pan3);
        container.add(pan1);
        fenetre.setContentPane(container);
        fenetre.setVisible(true);


    }
}
