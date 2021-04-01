package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(method(21, 30));
        System.out.println(method(15, 18));
        System.out.println(method(14, 30));
        System.out.println(method(45, 40));
        System.out.println(method(10, 15));

    }

    public static String method(int age, int temperature) {
        String result = "";
        if (age > 20 && age < 45) {
            if (temperature > -20 && temperature > 30) {

                result = "Можно идти гулять!";
            }

        } else if (age < 20 && temperature > 0 && temperature < 28) {
            result = "Можно идти гулять!!!";
        }
        else if (age >= 45 && temperature > -10 && temperature < 25) {
            result = "Можно идти гулять!!!";
        } else {
            result = "Лучше остаться дома!";
        }
        return result;

    }

}
