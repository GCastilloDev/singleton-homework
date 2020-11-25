package singleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tavoGeek
 */
public class Men {

    private String name;
    private String surname;
    private int age;
    private static Men menInstance = null;

    private Men(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static Men getInstance(String name, String surname, int age) {
        if (menInstance == null) {
            menInstance = new Men(name, surname, age);
        }

        return menInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String playSoccer() {
        return this.name + " is playing soccer";
    }
    
    public String buildLaptop() {
        return this.name + " is building a laptop";
    }
}
