package works.hw5;



public class Main {
    public static void main(String[] args) {
        Human child= new Human("Lara", "Jelly", 100, 1999);
        Human P2 = new Human("Lola", "Kelly",100,2000,new String[][]{{"DAY","Task"}});
        Human P4 = new Human("John", "Ello", 100, 1956,new String[][]{{"DAY2","Task2"}});
        Pet dog = new Pet("dog", "keyush", 75, 3, "eat,sleep,drink");
        Pet cat = new Pet("cat", "meow", 65, 2, "eat,sleep,drink");
        Human father = new Human("James","Malhon",1986);
        Human mother = new Human("Jenny","Malhon",1977);
        Family family = new Family (mother,father);

        family.addChild(child);
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        if(!dog.equals(cat)) System.out.println("They are different");
        System.out.println(P2.toString());
        System.out.println(P4.toString());
        dog.eat();
        cat.foul();


    }
}
