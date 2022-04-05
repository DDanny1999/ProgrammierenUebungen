package ÜbungenVorlesungProgrammieren2.DemoLogOn;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class DemoLogOnUI extends JFrame {

    private DemoLogOnUI() throws ParseException {
        super("Logon");

        // MaskFormater's

        MaskFormatter intOnly = new MaskFormatter("##");
        MaskFormatter stringOnlyBIG = new MaskFormatter("UUUUUUU");
        MaskFormatter stringOnly = new MaskFormatter("???????");

        // JPANELS für einzelne Felder

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userPanel.add(new JLabel("User:            "));
        userPanel.add(new JTextField(4));

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        passwordPanel.add(new JLabel("Password:  "));
        passwordPanel.add(new JPasswordField(5));

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
        JFormattedTextField hostField = new JFormattedTextField(stringOnlyBIG);
        hostField.setColumns(4);

        hostPanel.add(hostField);

        JPanel portPanel = new JPanel();
        portPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        portPanel.add(new JLabel("Port:             "));

        // PortFeld

        JFormattedTextField portField = new JFormattedTextField(intOnly);
        portField.setColumns(2);

        portPanel.add(portField);

//        NumberFormat intFormat = NumberFormat.getIntegerInstance();
//
//        NumberFormatter intFormatter = new NumberFormatter(intFormat);
//        intFormatter.setValueClass(Integer.class); //optional, ensures you will always get a int value
//        intFormatter.setAllowsInvalid(false); //this is the key!!
//
//        JFormattedTextField portField = new JFormattedTextField(intFormatter);
//        portField.setColumns(4);
//
//        portPanel.add(portField);

        JPanel quellePanel = new JPanel();
        quellePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        quellePanel.add(new JLabel("Quelle:           "));
        quellePanel.add(new JTextField(8));

        JPanel zielPanel = new JPanel();
        zielPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        zielPanel.add(new JLabel("Ziel:                "));
        zielPanel.add(new JTextField(8));

        // HauptPanel

        JPanel rootWindow = new JPanel();
        rootWindow.setLayout(new BorderLayout());

        // RotesPanel

        JPanel rotesPanel = new JPanel();
        rotesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        // BlauePanels

        JPanel blauesPanelLinks = new JPanel();
        blauesPanelLinks.setLayout(new GridLayout(5,1));

        JPanel blauesPanelRechts = new JPanel();
        blauesPanelRechts.setLayout(new GridLayout(2,1));

        // ButtonPanel

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Borders

        Border roterEingelassenerBorder = BorderFactory.createBevelBorder(1);

        rotesPanel.setBorder(roterEingelassenerBorder);

        Border blauesPanelLinksBorder = BorderFactory.createTitledBorder("Verbindung");

        blauesPanelLinks.setBorder(blauesPanelLinksBorder);

        Border blauesPanelRechtsBorder = BorderFactory.createTitledBorder("Dateien");

        blauesPanelRechts.setBorder(blauesPanelRechtsBorder);

        // Hinzufügen der Elemente auf das BlauePanelLinks

        blauesPanelLinks.add(userPanel);
        blauesPanelLinks.add(passwordPanel);
        blauesPanelLinks.add(artPanel);
        blauesPanelLinks.add(hostPanel);
        blauesPanelLinks.add(portPanel);

        rotesPanel.add(blauesPanelLinks);

        rootWindow.add(rotesPanel, BorderLayout.NORTH);

        // Ende von Verbindungen

        // Hier gehts los mit "Dateien"

        // Hinzufügen der Elemente auf das BlauePanelRechts

        blauesPanelRechts.add(quellePanel);
        blauesPanelRechts.add(zielPanel);

        rotesPanel.add(blauesPanelRechts);

        buttonPanel.add(new JButton("OK"));
        buttonPanel.add(new JButton("Cancel"));

        rootWindow.add(buttonPanel, BorderLayout.CENTER);

        // Ende von Verbindungen

        // StandardParameter

        this.add(rootWindow);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }


    public static void main(String[] args) throws ParseException{
        new DemoLogOnUI();
    }
}
