package com.example.task09;

public class Task09 {

    public static double solution() {
        // TODO Устраните ошибку вычисления выражения, не изменяя типы данных у переменных
        float a = 1f;
        float b = 3f;
        double x = ((double)a / b - 1.0 / 3.0) * 1.0e9;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
