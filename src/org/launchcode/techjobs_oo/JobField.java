package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

//    What fields do ALL FOUR of the classes have in common?
    public int id;
    public static int nextId = 1;
    public String value;

//    Which constructors are the same in ALL FOUR classes?
    public JobField() {
    id = nextId;
    nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

//    What getters and setters do ALL of the classes share?
    public int getId() {
    return id;
}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


//    Which custom methods are identical in ALL of the classes?
    //custom toString and hashCode methods
    @Override
    public String toString() {
    return value;
}

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
