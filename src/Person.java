/**
 *  Nghia (Sam) Ly Bronco# 016723759
 *  CS1400
 *  Assignment 6
 *  December 7, 2023
  */

public class Person {
    private int age;
    private String name;
    private String favoriteFood;

    public Person(int age, String name, String favoriteFood) {
        this.age = age;
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public Person(Person p) {
        this.age = p.getAge();
        this.name = p.getName();
        this.favoriteFood = p.getFavoriteFood();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Person p = (Person) o;
            return age == p.getAge() &&
                    name.equals(p.getName()) &&
                    favoriteFood.equals(p.getFavoriteFood());
        }
        catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }
}