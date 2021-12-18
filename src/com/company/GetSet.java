package com.company;

import javax.swing.*;

public class GetSet {



    public String a,b,h;
    public double S,V;


    public String getA() {
        return a;
    }

    public void setA(String a) {
        if(a.equals("")){
                JOptionPane.showMessageDialog(null,"Введите значение");
        }
        else {
            this.a = a;
        }
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {

        if(b.equals("")){
            JOptionPane.showMessageDialog(null,"Введите значение");

        }
        else {
            this.b = b;
        }

    }

    public String getH() {
        return h;
    }

    public void setH(String h) {

        if(h.equals("")){
            JOptionPane.showMessageDialog(null,"Введите значение");

        }
        else {
            this.h = h;
        }

    }

    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public double getV() {
        return V;
    }

    public void setV(double v) {
        V = v;
    }









}
