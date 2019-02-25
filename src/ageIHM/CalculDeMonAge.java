package ageIHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class CalculDeMonAge {


    private JPanel mainPan = new JPanel();
    private JPanel pan1= new JPanel();
    //private JPanel pan2, pan3, pan4 = new JPanel();
    private JButton b_age = new JButton("Age?");
    private JButton b_reverse = new JButton("Reverse");
    private JTextField t_nom = new JTextField(10);
    private JTextField t_prenom = new JTextField(10);
    private JTextField t_annee = new JTextField(10);
    private JTextField t_result = new JTextField();
    private JLabel l_nom = new JLabel("Votre nom:");
    private JLabel l_prenom = new JLabel("Votre prénom:");
    private JLabel l_annee = new JLabel("Votre annee de naissance: ");
    private JFrame Window = new JFrame();

    public CalculDeMonAge(){

        Window.setTitle("Calcul De Mon Age");
        Window.setSize(400, 400);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setLocationRelativeTo(null);

        pan1.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();


        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        pan1.add(l_nom, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        pan1.add(t_nom, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pan1.add(l_prenom, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        pan1.add(t_prenom, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        pan1.add(l_annee, c);
        c.weightx=0.0;
        pan1.add(t_annee, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        pan1.add(t_result, c);

        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 4;
        pan1.add(b_age, c);

        c.gridx = 1;
        c.gridy = 4;
        pan1.add(b_reverse, c);

        pan1.setBackground(Color.GREEN);
        pan1.setBorder(null);

        mainPan.add(pan1);

        b_age.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t_result.setText(answer());
            }
        });

        b_reverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t_nom.setText(new StringBuilder(t_nom.getText()).reverse().toString()); //reverse t_nom text
                t_prenom.setText(new StringBuilder(t_prenom.getText()).reverse().toString()); //reverse t_prenom text
                t_annee.setText(new StringBuilder(t_annee.getText()).reverse().toString()); //reverse t_annee text
                t_result.setText(answer());
            }
        });

        //mainPan.add(pan1);
        Window.setContentPane(pan1);

        Window.setVisible(true);
    }

    public String answer(){
        return "En " + getCalendar() + " vous avez " + (getCalendar()-Integer.parseInt(t_annee.getText()) ) + "ans.";
    }

    public int getCalendar (){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }

}
