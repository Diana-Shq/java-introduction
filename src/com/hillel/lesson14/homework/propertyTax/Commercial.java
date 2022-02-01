package com.hillel.lesson14.homework.propertyTax;

public class Commercial extends Realty {
    int proceeds;

    public Commercial(double s, int proceeds) {
        super(s);
        this.proceeds = proceeds;
    }

    public double getTax() {
        if (proceeds > 100) {
            return result = this.s * taxK;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "commercial";
    }
}
