package Lesson1.homework1;

public class Lesson1 {
    //step 1 Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        //Задание № 2 Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte by = 126;
        short sh = 2786;
        int in = 897601;
        long lon = 34534534123412L;
        float fl = 12.466f;
        double dou = 215415.2431;
        char ch = 'y';
        boolean bool = false;
        String def = "apple";

        //Подставление значений в методы для проверки
        System.out.println(step3(4, 6, 12, 2)); //Задание № 3
        System.out.println(step4(2, 9)); // Задание № 4
        step5(6); // Задание № 5
        System.out.println(step6(-9)); //Задание № 6
        step7("Роман");
        step8(1976);
    }

    //Задание № 3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    private static int step3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //Задание № 4 Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от
    // 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean step4(int g, int j) {
        int sum = g + j;
        return sum >= 10 && sum <= 20;
    }

    //Задание № 5 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    private static void step5(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Задание № 6 Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    private static boolean step6(int compare) {
        return compare < 0;
    }

    // Задание № 7 Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    private static void step7(String name) {
        System.out.println("Привет, " + name);
    }

    //Задание № 8 Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void step8(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");
    }
}
