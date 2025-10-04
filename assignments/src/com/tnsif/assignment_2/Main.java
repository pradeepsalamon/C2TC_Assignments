package com.tnsif.assignment_2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Commission commission = new Commission();
        commission.acceptDetails();
        commission.calculateCommission();
    }
}
