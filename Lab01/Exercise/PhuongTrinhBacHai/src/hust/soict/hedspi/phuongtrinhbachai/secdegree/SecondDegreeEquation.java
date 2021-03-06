/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.phuongtrinhbachai.secdegree;

/**
 *
 * @author DuyKhanh
 */
public class SecondDegreeEquation {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public String resolve() {
        int delta = this.getB() * this.getB() - 4 * this.getA() * this.getC();
        
        if (delta == 0) {
            return ("Phuong trinh co nghiem duy nhat x = " + -(double)this.getB()/(2 * this.getA()));
        }
        else if (delta > 0) {
            return ("Phuong trinh co 2 nghiem phan biet x1 = " + (-(double)b + Math.sqrt(delta))/(2 * a)
                    + " va x2 = " + (-(double)b - Math.sqrt(delta))/(2 * a));
        }
        return ("Phuong trinh vo nghiem");
    }
}
