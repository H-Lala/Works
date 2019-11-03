package works.hw5;

public class Family {
    Human mother = new Human();
    Human father = new Human();
    Human children[] = new Human[10];
    private static int length = 0;
    Pet pet = new Pet();
   public  static int countFamily = 0;


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human [] children){
        this.children=children;
    }

    public Family(Human mother ,Human father) {
        this.mother = mother;
        this.father = father;
        countFamily = 2;

    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void addChild(Human child) {

        this.children[length] = child;
        length++;
        countFamily++;
    }

    public void deleteChild(Human child) {

    }

    @Override
    public String toString() {

        return "Father :" + this.father.toString()
                + "Mother: " + this.mother.toString();
    }
}
