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

    }