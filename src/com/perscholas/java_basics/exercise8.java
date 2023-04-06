package com.perscholas.java_basics;
//Ahmed Ali RTT-57 4/6/2023 //
public class exercise8 {
    public static void main(String[] args) {
        double coffee = 2.50;
        double sandwhich = 4.29;
        double donut = 1.40;
        final double salesTax = .30;
        double subtotal;
        double totalSale;

        subtotal= (coffee*3)+(sandwhich*4)+(donut*2);

        totalSale= subtotal+salesTax;

        System.out.println(totalSale);




    }
}
