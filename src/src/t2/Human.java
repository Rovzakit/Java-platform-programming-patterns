package t2;

import java.time.LocalDate;

public class Human {
    public Human(int age, String firstName, String lastName,
                 LocalDate birthDate, int weight){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }
    public int age;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public int weight;
}
