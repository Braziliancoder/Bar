/**
 * Created by wizlamar on 26.04.17.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Java_GUI extends JFrame implements ActionListener {

    //JPanels
    JPanel buttonPanel = new JPanel();

    //JButtons
    JButton bierButton = new JButton("Bier");
    JButton weinButton = new JButton("Wein");
    JButton ginButton = new JButton("Gin");

    //JTextFields
    JTextField TextField = new JTextField();

    //JLabels


    public Java_GUI() {

        setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(1, 3));

        bierButton.setPreferredSize(new Dimension(50, 20));
        weinButton.setPreferredSize(new Dimension(50, 20));
        ginButton.setPreferredSize(new Dimension(50, 20));

        buttonPanel.setMaximumSize(new Dimension(500, 200));

        //Elemente dem Panel Adden

        buttonPanel.add(bierButton);
        buttonPanel.add(weinButton);
        buttonPanel.add(ginButton);

        //Positionieren von Panel

        add(buttonPanel, BorderLayout.CENTER);

        //Actionlistener auf buttons zuweisen

        bierButton.addActionListener(this);
        weinButton.addActionListener(this);
        ginButton.addActionListener(this);

        //Anzeigen des Fensters
        setVisible(true);
        //Grösse des Fensters
        setSize(1200, 670);
        //Titel des Fensters
        setTitle("Dr Völlscht isch dr töllscht");
        //Schliesst Programm
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
       /* if (e.getSource() == addButton) {
            listModel.addElement(TextField.getText());
        }
        if (e.getSource() == removeButton) {
            listModel.removeElementAt(toDoList.getSelectedIndex());
        } */
    }

    public static void main(String[] args) {
        Java_GUI JG = new Java_GUI();
    }

}