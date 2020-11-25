/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author tavoGeek
 */
public class Girl {

    private String name;
    private String surname;
    private int age;
    private static Girl girlInstance = null;

    private Girl(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static Girl getInstance(String name, String surname, int age) {
        if (girlInstance == null) {
            girlInstance = new Girl(name, surname, age);
        }

        return girlInstance;
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

    public String playVolleyball() {
        return this.name + " is playing volleyball";
    }

    public String buildMonitor() {
        return this.name + " is building a monitor";
    }
}
