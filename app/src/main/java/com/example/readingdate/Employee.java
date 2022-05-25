package com.example.readingdate;

public class Employee {
    String ename;
    int eid;
    boolean eelegible;

    public Employee(String ename, int eid, boolean eelegible) {
        this.ename = ename;
        this.eid = eid;
        this.eelegible = eelegible;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public boolean isEelegible() {
        return eelegible;
    }

    public void setEelegible(boolean eelegible) {
        this.eelegible = eelegible;
    }
}
