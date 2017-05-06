package pl.marcin.grabowski.exc1p1.model;

import java.io.Serializable;

/**
 * Created by marcin on 09.04.17.
 */
public class Person implements Serializable{
    String firstName;
    String lastName;
    String birthday;
    int age;

    Person (String firstName, String lastName, String birthday, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
