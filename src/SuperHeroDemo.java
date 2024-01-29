public class SuperHeroDemo {
    public static void main(String[] args) {
        Person p1 = new Person(14, "Bob", "Pasta");
        Person p2 = new Person(19, "Steve", "Pizza");
        Person p3 = new Person(p1);

        SuperHero s1 = new SuperHero("Spiderman", "Sticky", "bruh", 19, "Fried Chicken");
        SuperHero s2 = new SuperHero("Iron Man", "Rich", "pew pew", 34, "Sharma");
//
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals(p3));
//        System.out.println(p1.toString());

        s1.speak();
        s2.speak();
        System.out.println(s1.toString());

        System.out.println(SuperHero.villainsCaught());
        SuperHero.catchVillain();
        System.out.println(SuperHero.villainsCaught());
    }
}
