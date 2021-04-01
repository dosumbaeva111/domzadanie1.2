package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(method(21, 30));
        System.out.println(method(15, 18));
        System.out.println(method(14, 30));
        System.out.println(method(45, 40));
        System.out.println(method(10, 15));

        System.out.println(method(generateRandomAge(), 30));

    }

    public static String method(int age, int temperature) {
        System.out.println("Возраст = " + age);
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

    public static int generateRandomAge (){
        int num = 0;
        Random random = new Random();
        num = random.nextInt(40); // nextInt для указания диапозина
        return num;

    }

}
