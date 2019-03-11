package ageIHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class CalculDeMonAge {


    private JPanel mainPan = new JPanel();
    private JPanel pan1= new JPanel();
    private JPanel pan2=new JPanel();
    private JPanel pan3=new JPanel();
    private JPanel pan4 = new JPanel();
    private JButton b_age = new JButton("Age?");
    private JButton b_reverse = new JButton("Reverse");
    private JTextField t_nom = new JTextField(10);
    private JTextField t_prenom = new JTextField(10);
    private JTextField t_annee = new JTextField(4);
    private JTextField t_result = new JTextField();
    private JLabel l_nom = new JLabel("Votre nom:");
    private JLabel l_prenom = new JLabel("Votre prénom:");
    private JLabel l_annee = new JLabel("Votre annee de naissance: ");
    private JFrame Window = new JFrame();

    public CalculDeMonAge(){

        //Window set up
        Window.setTitle("Calcul De Mon Age");
        Window.setSize(400, 180);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setLocationRelativeTo(null);

        pan1.setLayout(new GridBagLayout());
        pan2.setLayout(new FlowLayout());
        pan3.setLayout(new GridBagLayout());
        pan4.setLayout(new FlowLayout());
        mainPan.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        //pan 1 : Nom, Prenom
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        pan1.add(l_nom, c);
        pan1.setMinimumSize(new Dimension(300, 200));


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

        //pan2 : Date de naissance
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        pan2.add(l_annee);
        pan2.add(t_annee);
        pan1.add(pan2, c);

        //pan3 : Resultat
        c.fill = GridBagConstraints.HORIZONTAL;
        t_result.setBackground(Color.CYAN);
        pan3.add(t_result, c);

        /*c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=3;
        pan1.add(pan3, c);*/

        //pan4 : Boutons Age? et Reverse
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        pan4.add(b_age, c);
        pan4.add(b_reverse, c);

        /*c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=4;
        pan1.add(pan4, c);*/

        //mainPan
        pan1.setBackground(Color.GREEN);
        pan2.setBackground(Color.GREEN);
        pan3.setBackground(Color.CYAN);
        pan4.setBackground(Color.YELLOW);

        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weighty=1;
        c.weightx=1;
        c.gridx=0;
        c.gridy=0;
        mainPan.add(pan1, c);

        c.fill = GridBagConstraints.BOTH;
        c.weighty=1;
        c.weightx=1;
        c.gridx=0;
        c.gridy=1;
        mainPan.add(pan3, c);

        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weighty=1;
        c.weightx=1;
        c.gridx=0;
        c.gridy=2;
        mainPan.add(pan4, c);



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
        Window.setContentPane(mainPan);

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
