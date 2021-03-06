//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xlsxEditor.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class editorUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblsheetName;
    public JTextField sheetNameTextField;
    private JLabel lblInputFile;
    public JTextField inputFileTextField;
    public JButton fileSelectButton;
    public JButton runButton;
    public JProgressBar progressBar;
    private JLabel lblStatus;
    public JLabel statusLabel;
    private JLabel lblcolumn;
    public JTextField columnTextField;

    public editorUI() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Throwable var3) {
            var3.printStackTrace();
        }

//        JTabbedPane jtp = new JTabbedPane();
//        getContentPane().add(jtp);
//        JPanel jp1 = new JPanel();
//        JPanel jp2 = new JPanel();
//        JLabel label1 = new JLabel();
//        label1.setText("You are in area of Tab1");
//        JLabel label2 = new JLabel();
//        label2.setText("You are in area of Tab2");
//        jp1.add(label1);
//        jp2.add(label2);
//        jtp.addTab("Tab1", jp1);
//        jtp.addTab("Tab2", jp2);

        this.setTitle("xlsx Editor");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 490, 200);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        
        this.lblInputFile = new JLabel("Input File:");
        this.lblInputFile.setBounds(10, 20, 90, 14);
        this.contentPane.add(this.lblInputFile);
        
        this.inputFileTextField = new JTextField();
        this.inputFileTextField.setBounds(96, 17, 250, 20);
        this.contentPane.add(this.inputFileTextField);
        this.inputFileTextField.setColumns(10);
        
        this.lblsheetName = new JLabel("Tab/sheet name:");
        this.lblsheetName.setBounds(10, 50, 90, 14);
        this.contentPane.add(this.lblsheetName);

        this.sheetNameTextField = new JTextField();
        this.sheetNameTextField.setBounds(96, 47, 250, 20);
        this.contentPane.add(this.sheetNameTextField);
        this.sheetNameTextField.setColumns(10);

        this.lblcolumn = new JLabel("Column to edit:");
        this.lblcolumn.setBounds(10, 80, 90, 14);
        this.contentPane.add(this.lblcolumn);

        this.columnTextField = new JTextField();
        this.columnTextField.setBounds(96, 77, 250, 20);
        this.contentPane.add(this.columnTextField);
        this.columnTextField.setColumns(10);
        
        this.fileSelectButton = new JButton("Select File");
        this.fileSelectButton.addActionListener(new editorUI.BtnSelectActionListener());
        this.fileSelectButton.setBounds(362, 14, 89, 23);
        this.fileSelectButton.setMnemonic(67);
        
        this.contentPane.add(this.fileSelectButton);
        this.runButton = new JButton("Run");
        this.runButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        this.runButton.setFont(new Font("Tahoma", 0, 11));
        this.runButton.setBounds(362, 74, 89, 23);
        this.runButton.setMnemonic(82);
        this.contentPane.add(this.runButton);
        
        this.progressBar = new JProgressBar();
        this.progressBar.setBounds(174, 116, 146, 14);
        this.contentPane.add(this.progressBar);
        
        this.lblStatus = new JLabel("Status:");
        this.lblStatus.setBounds(10, 116, 46, 14);
        this.contentPane.add(this.lblStatus);
        
        this.statusLabel = new JLabel("Idle");
        this.statusLabel.setForeground(Color.BLUE);
        this.statusLabel.setFont(new Font("Tahoma", 0, 15));
        this.statusLabel.setBounds(96, 116, 71, 21);
        this.contentPane.add(this.statusLabel);
        this.setVisible(true);
    }

    public void showAlert(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void addButtonActionListener(JButton jButton, ActionListener al) {
        jButton.addActionListener(al);
    }

    private class BtnSelectActionListener implements ActionListener {
        private BtnSelectActionListener() {
        }

        public void actionPerformed(ActionEvent arg0) {
        }
    }
}
