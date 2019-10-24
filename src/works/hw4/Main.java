package works.hw4;

public class Main {
    public static void main(String[] args) {
        Human P = new Human("Lala", "Hajiyeva", 100, 1999, "Madre", "Padre");

        Human P2 = new Human("Lola", "Kelly", 2000);
        System.out.println(P2.name + P2.surname + P2.year);

        Human P3 = new Human();


        Pet dog = new Pet("dog", "keyush", 75, 3, "eat,sleep,drink");
        System.out.println(dog.toString());

        Pet cat = new Pet("cat", "meow", 65, 2, "eat,sleep,drink");
        System.out.println(cat.toString());

        Human P4 = new Human("John", "Ello", 100, 1956, "Madam", "Padre", dog);
        System.out.println(P4.toString());

    }
}
