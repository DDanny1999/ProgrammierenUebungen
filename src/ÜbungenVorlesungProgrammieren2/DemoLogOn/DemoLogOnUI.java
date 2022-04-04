package ÜbungenVorlesungProgrammieren2.DemoLogOn;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;

public class DemoLogOnUI extends JFrame {

    private DemoLogOnUI(){
        super("Logon");

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userPanel.add(new JLabel("User:            "));
        userPanel.add(new JTextField(5));

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        passwordPanel.add(new JLabel("Password:  "));
        passwordPanel.add(new JPasswordField(6));

        JPanel artPanel = new JPanel();
        artPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        artPanel.add(new JLabel("Art:                "));

        String[] comboBoxListe = new String[2];
        comboBoxListe[0] = "FTP";
        comboBoxListe[1] = "P2P";

        JComboBox art = new JComboBox(comboBoxListe);

        artPanel.add(art);

        JPanel hostPanel = new JPanel();
        hostPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        hostPanel.add(new JLabel("Host:            "));
        hostPanel.add(new JTextField(6));

        JPanel portPanel = new JPanel();
        portPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        portPanel.add(new JLabel("Port:             "));
        portPanel.add(new JTextField(1));

        JPanel quellePanel = new JPanel();
        quellePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        quellePanel.add(new JLabel("Quelle:           "));
        quellePanel.add(new JTextField(8));

        JPanel zielPanel = new JPanel();
        zielPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        zielPanel.add(new JLabel("Ziel:                "));
        zielPanel.add(new JTextField(8));

        JPanel rootWindow = new JPanel();
        rootWindow.setLayout(new BorderLayout());

        JPanel rotesPanel = new JPanel();
        rotesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


        Border blauesPanelLinksBorder = BorderFactory.createTitledBorder("Verbindung");

        JPanel blauesPanelLinks = new JPanel();
        blauesPanelLinks.setLayout(new GridLayout(5,1));

        blauesPanelLinks.add(userPanel);
        blauesPanelLinks.add(passwordPanel);
        blauesPanelLinks.add(artPanel);
        blauesPanelLinks.add(hostPanel);
        blauesPanelLinks.add(portPanel);

        blauesPanelLinks.setBorder(blauesPanelLinksBorder);

        rotesPanel.add(blauesPanelLinks);

        rootWindow.add(rotesPanel, BorderLayout.NORTH);

        // Ende von Verbindungen

        // Hier gehts los mit "Dateien"

        Border blauesPanelRechtsBorder = BorderFactory.createTitledBorder("Dateien");

        JPanel blauesPanelRechts = new JPanel();
        blauesPanelRechts.setLayout(new GridLayout(2,1));

        blauesPanelRechts.add(quellePanel);
        blauesPanelRechts.add(zielPanel);

        blauesPanelRechts.setBorder(blauesPanelRechtsBorder);

        rotesPanel.add(blauesPanelRechts);

        JPanel continuePanel = new JPanel();
        continuePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        continuePanel.add(new JButton("OK"));
        continuePanel.add(new JButton("Cancel"));

        rootWindow.add(continuePanel, BorderLayout.CENTER);


        this.add(rootWindow);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }


    public static void main(String[] args) {
        new DemoLogOnUI();
    }
}
