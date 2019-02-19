package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factorielle {
    private JLabel title = new JLabel("Calcul de factorielle");
    private JTextField textField = new JTextField(10);
    private JButton button = new JButton("Entrer");
    private JLabel resultat = new JLabel("Result :");
    private JPanel container = new JPanel();
    private JPanel panTitle = new JPanel();
    private JPanel panTextField = new JPanel();
    private JPanel panButton = new JPanel();
    private String text;
    private JPanel panResultat = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();

    public Factorielle() {


        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java");
        fenetre.setSize(400, 400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);

        container.setLayout(new GridBagLayout());
        textField.setToolTipText("Entrer un nombre");
        textField.setBorder(BorderFactory.createLineBorder(Color.black,2));


        panTitle.add(title);
        panTextField.add(textField);
        panButton.add(button);
        panResultat.add(resultat);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        container.add(panTitle,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        container.add(panTextField,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        container.add(panResultat,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        container.add(panButton,c);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fetchData();

                //remove
                panResultat.removeAll();
                panResultat.repaint();
                panResultat.revalidate();

                //processes user's input
                displayResult();

                //update Jpanel of the result
                panResultat.add(resultat);
                panResultat.repaint();
                panResultat.revalidate();
            }
        });


        fenetre.setContentPane(container);
        fenetre.setVisible(true);

    }

    public String fetchData() {
        text = textField.getText();
        return text;
    }

    public int calculFactoriel(int x) {
        if(x!=0) return x*calculFactoriel(x-1);
        else return 1;
    }

    public JLabel displayResult() {
        int x = Integer.parseInt(text);
        int result = calculFactoriel(x);
        resultat = new JLabel("Resultat :"+result);
        return resultat;
    }
}
