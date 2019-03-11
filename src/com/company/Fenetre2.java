package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre2 {
    private JLabel title = new JLabel("Calcul de factorielle");
    private JTextField textField = new JTextField(10);
    private JButton button = new JButton("ADD");
    private JButton button2 = new JButton("RESET");
    private JButton resultat = new JButton("new");
    private JPanel container = new JPanel();
    private JPanel panTitle = new JPanel();
    private JPanel panTextField = new JPanel();
    private JPanel panButton = new JPanel();
    private JPanel panButton2 = new JPanel();
    private String text;
    private JPanel panResultat = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();
    int numero_button = 0;

    public Fenetre2() {


        JFrame fenetre = new JFrame();
        fenetre.setTitle("TP Java exo 4");
        fenetre.setSize(400, 400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);

        container.setLayout(new GridBagLayout());




        panButton.add(button);
        panButton2.add(button2);



        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        container.add(panTitle, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        container.add(panTextField, c);

       /* c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        container.add(panResultat,c);
        */

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        container.add(panButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        container.add(panButton2, c);




        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //remove
                container.removeAll();
                container.repaint();
                container.revalidate();

                //processes user's input

                    add();


                //update Jpanel of the result
                container.add(button2);
               container.add(button);
               container.repaint();
               container.revalidate();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //remove
                container.removeAll();
                container.repaint();
                container.revalidate();

                //processes user's input

                    reset();


                //update Jpanel of the result
                container.add(button);
                container.repaint();
                container.revalidate();
            }
        });


        fenetre.setContentPane(container);
        fenetre.setVisible(true);

    }


    public void add()
    {
        String name = Integer.toString(numero_button++);
        JButton nouveau = new JButton(name);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = numero_button;

        panButton.add(nouveau);
        container.add(panButton,c);


    }
    public void reset()
    {
        numero_button =0;
        container.removeAll();
        panButton.removeAll();
        panButton.add(button);
        panButton2.add(button2);

        container.add(panButton);
        container.add(panButton2);

    }

}