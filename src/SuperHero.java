/**
 *  Nghia (Sam) Ly Bronco# 016723759
 *  CS1400
 *  Assignment 6
 *  December 7, 2023
 */

public class SuperHero extends Person {
    private static int totalNumberVillainsCaught = 0;
    private String superPower;
    private String catchPhrase;

    public SuperHero(String name, String superPower, String catchPhrase, int age, String favoriteFood) {
        super(age, name, favoriteFood);
        this.superPower = superPower;
        this.catchPhrase = catchPhrase;
    }

    public static void catchVillain() {
        totalNumberVillainsCaught++;
    }

    public static int villainsCaught() {
        return totalNumberVillainsCaught;
    }

    public void speak() {
        System.out.println(catchPhrase);
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "superPower='" + superPower + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                '}';
    }
}