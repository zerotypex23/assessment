package com.assessment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton submitButton;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField birthDate;
    private JTextField email;
    private JTextField sex;
    private JPanel panelMain;

    public App(){
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        lastName.getText()+" "+firstName.getText()+" ("+sex.getText()+")" +
                                "\n"+"Born on "+birthDate.getText()+
                                "\n"+email.getText());
            }
        });
    }
    public static void main(String[] args){
    JFrame frame = new JFrame("Apps");
    frame.setContentPane(new App().panelMain);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
}
