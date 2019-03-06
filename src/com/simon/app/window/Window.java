package com.simon.app.window;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {

    public JFrame frame;
    private String title;
    private int width, height;

    private JButton messageBtn;
    private JPanel myPanel;

    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        create_window();

        messageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });


    }

    private void create_window() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}








/*
    private JFrame frame;
    private String title;
    private int width, height;

    // items:
    private JLabel label;
    private JTextField textField;


    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        createWindow();
    }

    private void createWindow() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        label = new JLabel("label");
        label.setToolTipText("boom");
        frame.add(label);

        textField = new JTextField(10);
        frame.add(textField);

    }

    */