package com.company;

import javax.swing.*;
import java.awt.*;

public class Decouverte extends JFrame {
    private JPanel container = new JPanel();
    private JButton button = new JButton("Entrer");
    private JLabel text = new JLabel("Pseudo");
    private JTextField textField = new JTextField("Entrer Pseudo",10);
    private JPanel pan1 = new JPanel();
    private JPanel pan2 = new JPanel();
    private JPanel pan3 = new JPanel();


    public Decouverte() {
        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java");
        fenetre.setSize(400, 400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        container.setLayout(new BorderLayout());

        textField.setEditable(false);
        textField.setToolTipText("Victor est beau");
        text.setForeground(Color.red);
        button.setBackground(Color.yellow);
        textField.setBorder(BorderFactory.createLineBorder(Color.orange,2));

        pan1.add(button);
        pan2.add(text);
        pan3.add(textField);
        container.add(pan2, BorderLayout.NORTH);
        container.add(pan3, BorderLayout.CENTER);
        container.add(pan1, BorderLayout.SOUTH);

        fenetre.setContentPane(container);
        fenetre.setVisible(true);


    }
}
