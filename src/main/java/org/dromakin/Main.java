package org.dromakin;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("101111011", "101111011"));
        System.out.println(Integer.toBinaryString(758).equals(bins.sum("101111011", "101111011")));
        System.out.println(bins.mult("101111011", "1100"));
        System.out.println(Integer.toBinaryString(4548).equals(bins.mult("101111011", "1100")));
    }
}