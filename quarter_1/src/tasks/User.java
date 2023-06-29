package tasks;

// Создайте класс User с полями firstName, lastName и age.
// В другом классе в методе main создайте массив объектов класса User
// с произвольными данными и с помощью цикла выведите на экран строки формата:
// “Last name: <lastName>, name: <firstName> - <age>”.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class user {
    public String firstName;
    public String lastName;
    public String age;

    user(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {

        List<user> users = new ArrayList<>();
        users.add(new user("Ivan", "Ivanov", "55"));
        users.add(new user("Sergey", "Petrov", "45"));
        users.add(new user("Maria", "Popova", "35"));

        Scanner myScanner = new Scanner(System.in);


}