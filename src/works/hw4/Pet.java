package works.hw4;

public class Pet extends Main {
    String species;
    String nickname;
    int Tricklevel;
    int age;
    String habits;

    Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    Pet(String dog, String rock, int i, String s) {

    }

    Pet(String species, String nickname, int Tricklevel, int age, String habits) {
        this.species = species;
        this.nickname = nickname;
        this.Tricklevel = Tricklevel;
        this.age = age;
        this.habits = habits;

    }

    void eat() {
        System.out.println("I'm eating");
    }

    void respond(String name) {
        System.out.printf("Hello owner.I'm%sI miss you.%n", name);

    }

    void foul() {
        System.out.println("I need to cover up");
    }

    public String toString() {
        return species +"{"+" nickname="+nickname+" age="+age+" trickLevel="+Tricklevel+" habits["+habits+"]}";

    }

    public static void main(String[] args) {

    }
}
