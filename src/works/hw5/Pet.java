package works.hw5;


public class Pet extends Main {
    private String species;
    private String nickname;
    private int Tricklevel;
    private int age;
    private String habits;

    public Pet() {

    }


    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTricklevel(int tricklevel) {
        Tricklevel = tricklevel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTricklevel() {
        return Tricklevel;
    }

    public int getAge() {
        return age;
    }

    public String getHabits() {
        return habits;
    }

    Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
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

    void respond() {
        System.out.printf("Hello owner.I'm%sI miss you.%n", getNickname());

    }

    void foul() {
        System.out.println("I need to cover up");
    }

    public String toString() {
        return species + "{" + " nickname="
                + nickname + " age=" + age + " trickLevel="
                + Tricklevel + " habits[" + habits + "]}";

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
