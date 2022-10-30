package hw1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task hw1.Human");
        Human h1 = new Human("Maksim", "Minsk", 1987, "Brand manager");
        Human h2 = new Human("Anna", "Moskow", 1993, "Metodist");
        Human h3 = new Human("Kate", "Kaliningrad", 1994, "Product manager");
        Human h4 = new Human("Artem", "Moskow", 1995, "Business development manager");


        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());



        System.out.println("Task hw1.Car");

        Car c1 = new Car("Lada", "Grande", 1.7, "Yellow", 2015, "Russia");
        Car c2 = new Car("Audi A8 50", "L TDI quattro", 3, "Black", 2020, "German");
        Car c3 = new Car("BMW", "Z8", 3, "Black", 2021, "German");
        Car c4 = new Car("Kia", "Sportage 4", 2.4, "Red", 2018, "South Korean");
        Car c5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korean");


    }
}