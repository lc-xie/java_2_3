package com.company;

public class Main {



    public static void main(String[] args) {

        double monthMoney[]=new double[48];
        monthMoney[47]=1000;
        for (int i=46;i>=0;i--){
            monthMoney[i]=monthMoney[i+1]/(1+0.0171/12)+1000;
        }
        System.out.print("Money:"+monthMoney[0]);
    }
}
