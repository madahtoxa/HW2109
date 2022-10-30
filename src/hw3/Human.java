package hw3;

public class Human {


    private Integer yearOfBirth;
    private String name;
    private String city;
    private String job;

    public void setYearOfBirth(){
        this.yearOfBirth=0;
    }
    public void setYearOfBirth(Integer year1) {
        if (year1 > 0) {
            this.yearOfBirth = year1;
        }if(year1<0) throw new IllegalArgumentException("год не может быть отрицательным!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    Human(String name, String city, int year) {
        this.name = name;
        this.city = city;
        this.yearOfBirth = year;
    }

    Human(String name, String city, int year, String job) {
        this.name = name;
        this.city = city;
        this.yearOfBirth = year;
        this.job = job;
    }

    Human() {
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth +
                " лет. Я работаю на должности " + job + ". Будем знакомы!";

    }

    public void setJob(String job) {
        if (job == null) {
            this.job = "Безработный.";
        } else this.job = job;
    }

    public Human(int year, String city, String job, int year2, String name, String city2, String job2) {

    }

}
