package hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task hw1.Human");
        Human human1 = new Human();
        human1.setName("Maksim");
        human1.setCity("Minsk");
        human1.setYearOfBirth(1987);
        human1.setJob("Brand manager");
        System.out.println(human1.toString());

        Human human2 = new Human();
        human2.setName("Anna");
        human2.setCity("Moskow");
        human2.setYearOfBirth(1993);
        human2.setJob("Metodist");
        System.out.println(human2.toString());

        Human human3 = new Human();
        human3.setName("Kate");
        human3.setCity("Kaliningrad");
        human3.setYearOfBirth(1994);
        human3.setJob("Product manager");
        System.out.println(human3.toString());

        Human human4 = new Human();
        human4.setName("Artem");
        human4.setCity("Moskow");
        human4.setYearOfBirth(1995);
        human4.setJob("Business development manager");
        System.out.println(human4.toString());


        System.out.println("\nЗадача с машинами");
        Car car1 = new Car();
        car1.setCarBrand("Lada");
        car1.setModel("Grande");
        car1.setEngineVolume(1.7);
        car1.setColor("Yello");
        car1.setProductionYear(2015);
        car1.setProductionCountry("Russia");
        System.out.println(car1.toString());

    }
}