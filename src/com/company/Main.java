package com.company;
import java.lang.System;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        GetSet getSet = new GetSet();
        getSet.setA(JOptionPane.showInputDialog("Введите сторону а"));

        getSet.setB(JOptionPane.showInputDialog("Введите сторону b"));

        getSet.setH(JOptionPane.showInputDialog("Введите высоту h"));


        getSet.setS( 0.5 * (Double.parseDouble(getSet.getA()) + Double.parseDouble(getSet.getB())) * Double.parseDouble(getSet.getH()));
        getSet.setV((getSet.getS() * Double.parseDouble(getSet.getH()))/2);

        JOptionPane.showMessageDialog(null,getSet.getV(),"Половина объема трапеции равна",JOptionPane.INFORMATION_MESSAGE);


    }
}

