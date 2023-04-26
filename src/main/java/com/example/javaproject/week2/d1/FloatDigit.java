package com.example.javaproject.week2.d1;

public class FloatDigit {
    public static void main(String[] args) {

        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;

        System.out.printf("f5:%f\n", f5);
        System.out.printf("f6:%f\n", f6);
        System.out.printf("f7:%f\n", f7);
        System.out.printf("f8:%f\n", f8);

        String val1 = "1.5";
        String val2 = "2.5";

        Float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);

        String val3 = "1.11111111";
        String val4 = "2.11111111";
        double result2 = Double.parseDouble(val3) + Double.parseDouble(val4);
        System.out.println(result2);

    }
}
