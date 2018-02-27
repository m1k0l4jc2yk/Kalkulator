package Kalkulator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;


public class Kalkulator extends Wykres {


    private JFrame frameKalkulatorStandardowy;
    private JTextField textField;

    double firstnumber;
    double secondnumber;
    double resoult;
    String operations;
    String answer;

    private String EnterNumber;
    private JTextField txtKalkulatorWalutowy;
    private JTextField textField1;
    private JTextField textField2;

    double UsaDolar = 3.48;
    double Euro = 4.18;
    double GrpBrytania = 4.71;
    double CadCanada = 2.70;
    double AudAustralia = 2.67;
    double ChfSzwajcaria = 3.52;
    double HufWegry = 0.0131;
    double CzkCzechy = 0.161;
    double JpyJaponia = 0.0303;
    private JTextField textField_1;

    double srednia = 0;
    double srednia2 = 0;
    private JTextField txtPodajWarto;
    private JTextField txtWartoWZ;

    /**
     * Create the application.
     */
    public Kalkulator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frameKalkulatorStandardowy = new JFrame();
        frameKalkulatorStandardowy.getContentPane().setBackground(Color.BLACK);
        frameKalkulatorStandardowy.setTitle("Kalkulator Walutowy");
        frameKalkulatorStandardowy.setBounds(100, 100, 650, 375);
        frameKalkulatorStandardowy.setVisible(true);
        frameKalkulatorStandardowy.setBackground(Color.WHITE);
        frameKalkulatorStandardowy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameKalkulatorStandardowy.getContentPane().setLayout(null);


        textField = new JTextField();
        textField.setBounds(10, 30, 215, 25);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        getFrameKalkulatorStandardowy().getContentPane().add(textField);
        textField.setColumns(10);
//		Rz�d 1 ------------------------------------------
        JButton btnBackSpace = new JButton("\uF0E7");
        btnBackSpace.setBounds(10, 60, 50, 50);
        btnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (textField.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(textField.getText());
                    strB.deleteCharAt(textField.getText().length() - 1);
                    backspace = strB.toString();
                    textField.setText(backspace);
                }
            }
        });
        btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 14));
        getFrameKalkulatorStandardowy().getContentPane().add(btnBackSpace);

        JButton btnClear = new JButton("C");
        btnClear.setBounds(65, 60, 50, 50);
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        btnClear.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnClear);

        JButton btnProcent = new JButton("%");
        btnProcent.setBounds(120, 60, 50, 50);
        btnProcent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = firstnumber * ops / 100;
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnProcent.setFont(new Font("Arial", Font.BOLD, 16));
        getFrameKalkulatorStandardowy().getContentPane().add(btnProcent);

        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(175, 60, 50, 50);
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "+";

            }
        });
        btnPlus.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnPlus);
    }