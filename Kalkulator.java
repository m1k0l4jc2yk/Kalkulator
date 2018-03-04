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
//		Rz�d 2 ------------------------------------------
        JButton btn7 = new JButton("7");
        btn7.setBounds(10, 115, 50, 50);
        btn7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn7.getText();
                textField.setText(EnterNumber);

            }
        });
        btn7.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(65, 115, 50, 50);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn8.getText();
                textField.setText(EnterNumber);
            }
        });
        btn8.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(120, 115, 50, 50);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn9.getText();
                textField.setText(EnterNumber);
            }
        });
        btn9.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn9);

        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(175, 115, 50, 50);
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstnumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "-";

            }
        });
        btnMinus.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnMinus);
//		Rz�d 3 ------------------------------------------
        JButton btn4 = new JButton("4");
        btn4.setBounds(10, 170, 50, 50);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn4.getText();
                textField.setText(EnterNumber);
            }
        });
        btn4.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(65, 170, 50, 50);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn5.getText();
                textField.setText(EnterNumber);
            }
        });
        btn5.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(120, 170, 50, 50);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn6.getText();
                textField.setText(EnterNumber);
            }
        });
        btn6.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn6);

        JButton btnMnozenie = new JButton("*");
        btnMnozenie.setBounds(175, 170, 50, 50);
        btnMnozenie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstnumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "*";

            }
        });
        btnMnozenie.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnMnozenie);
//		Rz�d 4 ------------------------------------------
        JButton btn1 = new JButton("1");
        btn1.setBounds(10, 225, 50, 50);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText());
                EnterNumber = textField.getText() + btn1.getText();
                textField.setText(EnterNumber);
            }
        });
        btn1.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(65, 225, 50, 50);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn2.getText();
                textField.setText(EnterNumber);
            }
        });
        btn2.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(120, 225, 50, 50);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNumber = textField.getText() + btn3.getText();
                textField.setText(EnterNumber);
            }
        });
        btn3.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn3);

        JButton btnDzielenie = new JButton("/");
        btnDzielenie.setBounds(175, 225, 50, 50);
        btnDzielenie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstnumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "/";
            }
        });
        btnDzielenie.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnDzielenie);
//		Rz�d 5 ------------------------------------------
        JButton btn0 = new JButton("0");
        btn0.setBounds(10, 280, 50, 50);
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn0.getText();
                textField.setText(EnterNumber);
            }
        });
        btn0.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btn0);

        JButton btnKropka = new JButton(".");
        btnKropka.setBounds(65, 280, 50, 50);
        btnKropka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + btnKropka.getText());
                }
            }
        });
        btnKropka.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnKropka);

        JButton btnPlusMinus = new JButton("\u00B1");
        btnPlusMinus.setBounds(120, 280, 50, 50);
        btnPlusMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = ops * (-1);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnPlusMinus);

        JButton btnRowne = new JButton("=");
        btnRowne.setBounds(175, 280, 50, 50);
        btnRowne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String answer;
                secondnumber = Double.parseDouble(textField.getText());
                if (operations == "+") {
                    resoult = firstnumber + secondnumber;
                    answer = String.valueOf(resoult);
                    textField.setText(answer);
                } else if (operations == "-") {
                    resoult = firstnumber - secondnumber;
                    answer = String.valueOf(resoult);
                    textField.setText(answer);

                } else if (operations == "*") {
                    resoult = firstnumber * secondnumber;
                    answer = String.valueOf(resoult);
                    textField.setText(answer);

                } else if (operations == "/") {
                    resoult = firstnumber / secondnumber;
                    answer = String.valueOf(resoult);
                    textField.setText(answer);

                }
                secondnumber = Double.parseDouble(textField.getText());

            }
        });
        btnRowne.setFont(new Font("Arial", Font.BOLD, 18));
        getFrameKalkulatorStandardowy().getContentPane().add(btnRowne);

        JPanel panel = new JPanel();
        panel.setBounds(10, 5, 614, 18);
        getFrameKalkulatorStandardowy().getContentPane().add(panel);
        panel.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setFont(new Font("Arial", Font.BOLD, 12));
        menuBar.setBounds(0, 0, 43, 21);
        panel.add(menuBar);

        JMenu mnWidok = new JMenu("Widok");
        mnWidok.setFont(new Font("Segoe UI", Font.BOLD, 12));
        mnWidok.setHorizontalAlignment(SwingConstants.CENTER);
        menuBar.add(mnWidok);

        JMenuItem mntmStandard = new JMenuItem("Standardowy");
        mntmStandard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                getFrameKalkulatorStandardowy().setTitle("Kalkulator Standardowy");
                getFrameKalkulatorStandardowy().setBounds(100, 100, 250, 375);
                textField.setBounds(10, 25, 215, 30);
                panel.setBounds(10, 5, 215, 18);
            }
        });
        mnWidok.add(mntmStandard);

        JMenuItem mntmNaukowy = new JMenuItem("Naukowy");
        mntmNaukowy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                getFrameKalkulatorStandardowy().setTitle("Kalkulator Naukowy");
                getFrameKalkulatorStandardowy().setBounds(100, 100, 430, 375);
                textField.setBounds(10, 25, 395, 30);
                panel.setBounds(10, 5, 395, 18);
            }
        });
        mnWidok.add(mntmNaukowy);

        JMenuItem mntmWalutowy = new JMenuItem("Walutowy");
        mntmWalutowy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                getFrameKalkulatorStandardowy().setTitle("Kalkulator Walutowy");
                getFrameKalkulatorStandardowy().setBounds(100, 100, 650, 375);
                textField.setBounds(10, 25, 395, 30);
                panel.setBounds(10, 5, 614, 18);
            }
        });
        mnWidok.add(mntmWalutowy);

        JMenuItem mntmWyjcie = new JMenuItem("Wyj\u015Bcie");
        mntmWyjcie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnWidok.add(mntmWyjcie);

        JButton buttonLog = new JButton("Log");
        buttonLog.setBounds(235, 60, 50, 50);
        buttonLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.log(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        buttonLog.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(buttonLog);

        JButton buttonPI = new JButton("\u03C0");
        buttonPI.setBounds(235, 115, 50, 50);
        buttonPI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops;
                ops = 3.14159265359;
                textField.setText(String.valueOf(ops));
                ops = firstnumber;

            }
        });
        buttonPI.setFont(new Font("Arial", Font.BOLD, 10));
        getFrameKalkulatorStandardowy().getContentPane().add(buttonPI);

        JButton buttonX1 = new JButton("x^y");
        buttonX1.setBounds(235, 170, 50, 50);
        buttonX1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.pow(ops, ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        buttonX1.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(buttonX1);

        JButton buttonX2 = new JButton("x^2");
        buttonX2.setBounds(235, 225, 50, 50);
        buttonX2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = (ops * ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        buttonX2.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(buttonX2);

        JButton buttonX3 = new JButton("x^3");
        buttonX3.setBounds(235, 280, 50, 50);
        buttonX3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = (ops * ops * ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        buttonX3.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(buttonX3);

        JButton btnSin = new JButton("Sin");
        btnSin.setBounds(295, 60, 50, 50);
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.sin(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnSin.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnSin);

        JButton btnCos = new JButton("Cos");
        btnCos.setBounds(295, 115, 50, 50);
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.cos(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnCos.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnCos);

        JButton btnTan = new JButton("Tan");
        btnTan.setBounds(295, 170, 50, 50);
        btnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.tan(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnTan.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnTan);

        JButton btnBin = new JButton("Bin");
        btnBin.setBounds(355, 61, 50, 50);
        btnBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(a, 2));
            }
        });
        btnBin.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnBin);

        JButton btnx = new JButton("Rou");
        btnx.setBounds(295, 280, 50, 50);
        btnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.round(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;

            }
        });
        btnx.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnx);

        JButton buttonPi2 = new JButton("2*\u03C0");
        buttonPi2.setBounds(295, 225, 50, 50);
        buttonPi2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops;
                ops = (3.14159265359) * 2;
                textField.setText(String.valueOf(ops));
                ops = firstnumber;

            }

        });
        buttonPi2.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(buttonPi2);

        JButton btnHex = new JButton("Hex");
        btnHex.setBounds(355, 115, 50, 50);
        btnHex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(a, 16));

            }
        });
        btnHex.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnHex);

        JButton btnOct = new JButton("Oct");
        btnOct.setBounds(355, 170, 50, 50);
        btnOct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(a, 8));

            }
        });
        btnOct.setFont(new Font("Arial", Font.BOLD, 8));
        getFrameKalkulatorStandardowy().getContentPane().add(btnOct);

        JButton btnPierwiastek = new JButton("\u221A");
        btnPierwiastek.setBounds(355, 225, 50, 50);
        btnPierwiastek.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.sqrt(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnPierwiastek.setFont(new Font("Arial", Font.BOLD, 12));
        getFrameKalkulatorStandardowy().getContentPane().add(btnPierwiastek);

        JButton btnMod = new JButton("lnx");
        btnMod.setBounds(355, 280, 50, 50);
        btnMod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = Math.log10(ops);
                textField.setText(String.valueOf(ops));
                ops = firstnumber;
            }
        });
        btnMod.setFont(new Font("Arial", Font.BOLD, 7));
        getFrameKalkulatorStandardowy().getContentPane().add(btnMod);

        JComboBox jCombo = new JComboBox();
        jCombo.setBounds(415, 60, 209, 34);
        jCombo.setFont(new Font("Arial", Font.BOLD, 12));
        jCombo.setModel(new DefaultComboBoxModel(new String[]{"WYBIERZ WALUT�...", "USA", "EURO", "GBP", "CAD", "AUD", "CHF", "HUF"}));
        getFrameKalkulatorStandardowy().getContentPane().add(jCombo);

        txtKalkulatorWalutowy = new JTextField();
        txtKalkulatorWalutowy.setBounds(415, 30, 209, 25);
        txtKalkulatorWalutowy.setForeground(Color.WHITE);
        txtKalkulatorWalutowy.setBackground(Color.BLACK);
        txtKalkulatorWalutowy.setHorizontalAlignment(SwingConstants.CENTER);
        txtKalkulatorWalutowy.setFont(new Font("Arial", Font.BOLD, 12));
        txtKalkulatorWalutowy.setText("KALKULATOR WALUTOWY");
        getFrameKalkulatorStandardowy().getContentPane().add(txtKalkulatorWalutowy);
        txtKalkulatorWalutowy.setColumns(10);

        JTextPane textPane = new JTextPane();
        textPane.setBounds(415, 170, 209, 75);
        textPane.setFont(new Font("Tahoma", Font.BOLD, 10));
        textPane.setForeground(Color.BLACK);
        frameKalkulatorStandardowy.getContentPane().add(textPane);

        JTextPane textPane2 = new JTextPane();
        textPane2.setBounds(415, 250, 209, 25);
        textPane2.setForeground(new Color(0, 128, 0));
        textPane2.setFont(new Font("Tahoma", Font.BOLD, 11));
        frameKalkulatorStandardowy.getContentPane().add(textPane2);

        JButton btnNewButton = new JButton("Konwertuj");
        btnNewButton.setBounds(415, 280, 110, 20);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double Polski_Zloty = Double.parseDouble(textField1.getText());
                if (jCombo.getSelectedItem().equals("USA")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * UsaDolar);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] usa = {3.464, 3.455, 3.345, 3.4551, 3.445, 3.465, 3.465, 3.472, 3.482, 3.485};

                    double[] usa2 = {3.441, 3.443, 3.442, 3.451, 3.452, 3.453, 3.455, 3.449, 3.451, 3.442, 3.464, 3.455, 3.345, 3.4551, 3.445, 3.465, 3.465, 3.472, 3.482, 3.485};


                    for (int i = 0; i < usa.length; i++) {
                        srednia = srednia + usa[i] / usa.length;
                    }

                    for (int i = 0; i < usa2.length; i++) {
                        srednia2 = srednia2 + usa2[i] / usa2.length;

                    }

                    if (srednia <= usa[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + usa[9] + "\nZmiana kursu = " + String.format("%.3f", usa2[19] - usa2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� USA !!!");


                    } else {
                        textPane.setText("�rednia wi�ksza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + usa[9] + "\nZmiana kursu = " + String.format("%.3f", usa2[19] - usa2[0]));
                        textPane2.setText("Nie inwestuj w walut� USA");

                    }

                } else if (jCombo.getSelectedItem().equals("EURO")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * Euro);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] euro = {4.146, 4.148, 4.150, 4.161, 4.158, 4.154, 4.159, 4.173, 4.202, 4.184};

                    double[] euro2 = {4.182, 4.173, 4.166, 4.175, 4.169, 4.171, 4.163, 4.149, 4.147, 4.142, 4.146, 4.148, 4.150, 4.161, 4.158, 4.154, 4.159, 4.173, 4.202, 4.184};

                    for (int i = 0; i < euro.length; i++) {
                        srednia = srednia + euro[i] / euro.length;
                    }

                    for (int i = 0; i < euro2.length; i++) {
                        srednia2 = srednia2 + euro2[i] / euro2.length;

                    }

                    if (srednia <= euro[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + euro[9] + "\nZmiana kursu = " + String.format("%.3f", euro2[19] - euro2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� EURO !!!");

                    } else {
                        textPane.setText("�rednia wi�ksza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + euro[9] + "\nZmiana kursu = " + String.format("%.3f", euro2[19] - euro2[0]));
                        textPane2.setText("Nie inwestuj w walut� EURO");
                    }
                } else if (jCombo.getSelectedItem().equals("GBP")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * GrpBrytania);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] gbp = {4.706, 4.707, 4.751, 4.738, 4.711, 4.687, 4.688, 4.729, 4.769, 4.724};

                    double[] gbp2 = {4.706, 4.705, 4.721, 4.730, 4.730, 4.752, 4.756, 4.768, 4.748, 4.708, 4.706, 4.707, 4.751, 4.738, 4.711, 4.687, 4.688, 4.729, 4.769, 4.724};


                    for (int i = 0; i < gbp.length; i++) {
                        srednia = srednia + gbp[i] / gbp.length;
                    }

                    for (int i = 0; i < gbp2.length; i++) {
                        srednia2 = srednia2 + gbp2[i] / gbp2.length;

                    }

                    if (srednia <= gbp[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + gbp[9] + "\nZmiana kursu = " + String.format("%.3f", gbp2[19] - gbp2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� GBP !!!");

                    } else {
                        textPane.setText("�rednia wi�ksza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + gbp[9] + "\nZmiana kursu = " + String.format("%.3f", gbp2[19] - gbp2[0]));
                        textPane2.setText("Nie inwestuj w walut� GBP");
                    }
                } else if (jCombo.getSelectedItem().equals("CAD")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * CadCanada);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] cad = {2.712, 2.710, 2.711, 2.709, 2.690, 2.674, 2.691, 2.709, 2.720, 2.714};

                    double[] cad2 = {2.750, 2.739, 2.742, 2.739, 2.728, 2.731, 2.731, 2.711, 2.703, 2.701, 2.712, 2.710, 2.711, 2.709, 2.690, 2.674, 2.691, 2.709, 2.720, 2.714};


                    for (int i = 0; i < cad.length; i++) {
                        srednia = srednia + cad[i] / cad.length;
                    }

                    for (int i = 0; i < cad2.length; i++) {
                        srednia2 = srednia2 + cad2[i] / cad2.length;

                    }

                    if (srednia <= cad[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + cad[9] + "\nZmiana kursu = " + String.format("%.3f", cad2[19] - cad2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� CAD !!!");

                    } else {
                        textPane.setText("�rednia wi�ksza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + cad[9] + "\nZmiana kursu = " + String.format("%.3f", cad2[19] - cad2[0]));
                        textPane2.setText("Nie inwestuj w walut� CAD");
                    }
                } else if (jCombo.getSelectedItem().equals("AUD")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * AudAustralia);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] aud = {2.703, 2.697, 2.703, 2.672, 2.663, 2.652, 2.636, 2.665, 2.671, 2.668};

                    double[] aud2 = {2.718, 2.720, 2.721, 2.727, 2.726, 2.715, 2.718, 2.698, 2.690, 2.699, 2.703, 2.697, 2.703, 2.672, 2.663, 2.652, 2.636, 2.665, 2.671, 2.668};


                    for (int i = 0; i < aud.length; i++) {
                        srednia = srednia + aud[i] / aud.length;
                    }

                    for (int i = 0; i < aud2.length; i++) {
                        srednia2 = srednia2 + aud2[i] / aud2.length;

                    }

                    if (srednia <= aud[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + aud[9] + "\nZmiana kursu = " + String.format("%.3f", aud2[19] - aud2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� AUD !!!");

                    } else {
                        textPane.setText("�rednia wi�ksza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + aud[9] + "\nZmiana kursu = " + String.format("%.3f", aud2[19] - aud2[0]));
                        textPane2.setText("Nie inwestuj w walut� AUD");
                    }
                } else if (jCombo.getSelectedItem().equals("CHF")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * ChfSzwajcaria);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] chf = {3.580, 3.575, 3.580, 3.588, 3.588, 3.585, 3.590, 3.605, 3.650, 3.638};

                    double[] chf2 = {3.542, 3.539, 3.547, 3.557, 3.547, 3.539, 3.546, 3.547, 3.564, 3.562, 3.580, 3.575, 3.580, 3.588, 3.588, 3.585, 3.590, 3.605, 3.650, 3.638};


                    for (int i = 0; i < chf.length; i++) {
                        srednia = srednia + chf[i] / chf.length;
                    }

                    for (int i = 0; i < chf2.length; i++) {
                        srednia2 = srednia2 + chf2[i] / chf2.length;

                    }

                    if (srednia <= chf[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + chf[9] + "\nZmiana kursu = " + String.format("%.3f", chf2[19] - chf2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� CHF !!!");

                    } else {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + chf[9] + "\nZmiana kursu = " + String.format("%.3f", chf2[19] - chf2[0]));
                        textPane2.setText("Nie inwestuj w walut� CHF");
                    }
                } else if (jCombo.getSelectedItem().equals("HUF")) {
                    String Convert1 = String.format("%.2f", Polski_Zloty * HufWegry);
                    textField2.setText(Convert1 + "z�");
                    double srednia = 0;
                    double srednia2 = 0;

                    double[] huf = {1.337, 1.335, 1.338, 1.345, 1.341, 1.339, 1.341, 1.341, 1.346, 1.341};

                    double[] huf2 = {1.353, 1.350, 1.351, 1.349, 1.347, 1.345, 1.347, 1.341, 1.338, 1.338, 1.337, 1.335, 1.338, 1.345, 1.341, 1.339, 1.341, 1.341, 1.346, 1.341};


                    for (int i = 0; i < huf.length; i++) {
                        srednia = srednia + huf[i] / huf.length;
                    }

                    for (int i = 0; i < huf2.length; i++) {
                        srednia2 = srednia2 + huf2[i] / huf2.length;

                    }

                    if (srednia <= huf[9] & srednia >= srednia2) {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + huf[9] + "\nZmiana kursu = " + String.format("%.3f", huf2[19] - huf2[0]));
                        textPane2.setText("Warto Inwestowa� w walut� HUF !!!");

                    } else {
                        textPane.setText("�rednia mniejsza od ostatniej warto�ci\n�rednia (10) = " + String.format("%.3f", srednia) + "\n�rednia (20) = " + String.format("%.3f", srednia2) + "\nOstatnia warto�� kursu = " + huf[9] + "\nZmiana kursu = " + String.format("%.3f", huf2[19] - huf2[0]));
                        textPane2.setText("Nie inwestuj w walut� HUF");
                    }
                }
            }
        });
        getFrameKalkulatorStandardowy().getContentPane().add(btnNewButton);


        JButton btnC = new JButton("Wyczy\u015B\u0107");
        btnC.setBounds(415, 308, 110, 22);
        btnC.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textField1.setText(null);
                textField2.setText(null);
                jCombo.setModel(new DefaultComboBoxModel(new String[]{"WYBIERZ WALUT�...", "USA", "EURO", "GBP", "CAD", "AUD", "CHF", "HUF"}));
                textPane.setText(null);
                textPane2.setText(null);
                srednia = 0;
                srednia2 = 0;
            }
        });
        getFrameKalkulatorStandardowy().getContentPane().add(btnC);

        textField1 = new JTextField();
        textField1.setToolTipText("");
        textField1.setBounds(530, 100, 94, 30);
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        getFrameKalkulatorStandardowy().getContentPane().add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setBounds(530, 135, 94, 30);
        textField2.setHorizontalAlignment(SwingConstants.CENTER);
        textField2.setColumns(10);
        getFrameKalkulatorStandardowy().getContentPane().add(textField2);

        JToggleButton tglbtnNewToggleButton = new JToggleButton("Wykres");
        tglbtnNewToggleButton.setBounds(530, 280, 94, 50);
        tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        tglbtnNewToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Wykres wykres = new Wykres();
                wykres.getFrameWykres().setVisible(true);


                if (jCombo.getSelectedItem().equals("USA")) {

                    wykres.wykresUsa();

                } else if (jCombo.getSelectedItem().equals("EURO")) {

                    wykres.wykresEuro();
                } else if (jCombo.getSelectedItem().equals("GBP")) {

                    wykres.wykresGbp();
                } else if (jCombo.getSelectedItem().equals("CAD")) {

                    wykres.wykresCad();
                } else if (jCombo.getSelectedItem().equals("AUD")) {

                    wykres.wykresAud();
                } else if (jCombo.getSelectedItem().equals("CHF")) {

                    wykres.wykresChf();
                } else if (jCombo.getSelectedItem().equals("HUF")) {
                    wykres.wykresHuf();

                }

            }
        });
    }