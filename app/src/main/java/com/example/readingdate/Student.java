package com.example.readingdate;

public class Student {
    String name;
    int id;
    boolean iselegeble;

    public Student(String name, int id, boolean iselegeble) {
        this.name = name;
        this.id = id;
        this.iselegeble = iselegeble;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIselegeble() {
        return iselegeble;
    }

    public void setIselegeble(boolean iselegeble) {
        this.iselegeble = iselegeble;
    }
}
