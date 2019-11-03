package works.hw5;


import java.util.Arrays;

public class Human extends Main {
    private String name;
    private String surname;
    private int IQ;
    private int year;

    private String scedule[][];

    public Human() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIQ() {
        return IQ;
    }


    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    Human(String name, String surname, int IQ, int year, String scedule[][]) {
        this.name = name;
        this.surname = surname;
        this.IQ = IQ;
        this.year = year;
        this.scedule = scedule;

    }

    Human(String name, String surname, int IQ, int year) {
        this.name = name;
        this.surname = surname;
        this.IQ = IQ;
        this.year = year;


    }


    public String[][] getScedule(String[][] scedule) {
        return this.scedule;
    }

    public String toString() {
        return String.format("Human{name =%s, surname%s, age=%d, iq=%d, scedule=%s",
                name, surname, year, IQ, Arrays.deepToString(getScedule(scedule)));

    }


    public int hashCode(Object that) {
        return hashCode();
    }

    @Override
    public boolean equals(Object that) {
        if (!(that instanceof Pet)) return false;
        if (this.hashCode() != that.hashCode()) return false;
        return true;
    }
}

