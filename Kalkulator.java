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

