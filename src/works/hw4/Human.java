package works.hw4;

public class Human extends Main {
    String name;
    String surname;
    int IQ;
    int year;
    String mother;
    String father;


    String scedule[][] = {
            {"Monday", " go to university ; read a book"},
            {"Tuesday", " do your homework"},
            {"Wednesday", " go sport"},
            {"Thursday", " clean a room"},
            {"Friday", " meeting with friend"},
            {"Saturday", " have a rest"},
            {"Sunday", " prepare to new week"}
    };
    Pet pet;



    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    Human() {

    }

    Human(String name, String surname, int IQ, int year, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.IQ = IQ;
        this.year = year;
        this.mother = mother;
        this.father = father;

    }
    Human(String name, String surname, int IQ, int year, String mother, String father,Pet pet) {
        this.name = name;
        this.surname = surname;
        this.IQ = IQ;
        this.year = year;
        this.mother = mother;
        this.father = father;
        this.pet=pet;

    }



    void greetPet() {
        System.out.println("Hello" + pet.nickname);
    }

    void describePet() {
        if (pet.Tricklevel > 50) System.out.println("I have a" +
                pet.species +
                " He is" + pet.age + "years old" + " He is very sly"
        );
        else System.out.println("I have a" +
                pet.species +
                " He is" + pet.age + "years old" + " He is almost not sly"
        );
    }

    public String toString() {
        return String.format("Human{name =%s surname%s age=%d iq=%d mother=%s father=%s %s{nickname =%s age=%d trickLevel=%d habits=[%s]}",
                name, surname, year, IQ, mother, father, pet.species, pet.nickname, pet.age, pet.Tricklevel, pet.habits);

    }

    public static void main(String[] args) {

    }
}
