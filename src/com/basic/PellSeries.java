package com.basic;
public class PellSeries {
    public static void main(String[] args) {
        int numberOfTerms = 10; // You can change this to generate more terms
        generatePellSeries(numberOfTerms);
    }

    static void generatePellSeries(int n) {
        int p1 = 0, p2 = 1;

        System.out.println("Pell Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(p1 + " ");

            int nextTerm = 2 * p2 + p1;
            p1 = p2;
            p2 = nextTerm;
        }
    }
}