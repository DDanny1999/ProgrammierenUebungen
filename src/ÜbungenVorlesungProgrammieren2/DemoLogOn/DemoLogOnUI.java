package ÜbungenVorlesungProgrammieren2.DemoLogOn;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;

public class DemoLogOnUI extends JFrame {

    private DemoLogOnUI(){
        super("Logon");

        JPanel rootWindow = new JPanel();
        rootWindow.setLayout(new BorderLayout());

        JPanel rotesPanel = new JPanel();
        rotesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


        Border blauesPanelLinksBorder = BorderFactory.createTitledBorder("Verbindung");

        JPanel blauesPanelLinks = new JPanel();
        blauesPanelLinks.setLayout(new GridLayout(5,2));

        blauesPanelLinks.add(new JLabel("User: "));
        blauesPanelLinks.add(new JTextField());
        blauesPanelLinks.add(new JLabel("Password: "));
        blauesPanelLinks.add(new JPasswordField());
        blauesPanelLinks.add(new JLabel("Art: "));

        String[] comboBoxListe = new String[2];
        comboBoxListe[0] = "FTP";
        comboBoxListe[1] = "P2P";

        JComboBox art = new JComboBox(comboBoxListe);

        blauesPanelLinks.add(art);

        blauesPanelLinks.add(new JLabel("Host: "));
        blauesPanelLinks.add(new JTextField());
        blauesPanelLinks.add(new JLabel("Port: "));
        blauesPanelLinks.add(new JTextField());

        blauesPanelLinks.setBorder(blauesPanelLinksBorder);

        rotesPanel.add(blauesPanelLinks);

        rootWindow.add(rotesPanel, BorderLayout.NORTH);

        // Ende von Verbindungen

        // Hier gehts los mit "Dateien"

        Border blauesPanelRechtsBorder = BorderFactory.createTitledBorder("Dateien");

        JPanel blauesPanelRechts = new JPanel();
        blauesPanelRechts.setLayout(new GridLayout(2,2));

        blauesPanelRechts.add(new JLabel("Quelle: "));
        blauesPanelRechts.add(new JTextField());
        blauesPanelRechts.add(new JLabel("Ziel: "));
        blauesPanelRechts.add(new JTextField());

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
