package com.company;

import javax.swing.*;
import java.awt.*;

public class Factorielle {
    private JLabel title = new JLabel("Calcul de factorielle");
    private JTextField textField = new JTextField("entrer un nombre",10);
    private JButton button = new JButton("Entrer");

    private JPanel container = new JPanel();
    private JPanel panTitle = new JPanel();
    private JPanel panTextField = new JPanel();
    private JPanel panButton = new JPanel();
    public Factorielle() {
        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java");
        fenetre.setSize(400, 400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        container.setLayout(new BorderLayout());

        textField.setToolTipText("Entrer un nombre");
        textField.setBorder(BorderFactory.createLineBorder(Color.black,2));

        panTitle.add(title);
        panTextField.add(textField);
        panButton.add(button);

        fenetre.setVisible(true);
    }
}
