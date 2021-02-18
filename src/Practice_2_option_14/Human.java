package Practice_2_option_14;

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

    public void Out(){
        System.out.println("age: " + age + "; first name: " + firstName + "; last name: " + lastName
                + "; birth date: " + birthDate + "; weight: " + weight);
    }
}