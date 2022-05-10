package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

//    What fields do ALL FOUR of the classes have in common?
    public int id;
    public static int nextId = 1;
    public String value;

//    Which constructors are the same in ALL FOUR classes?
    //accepts no arguments and assigns the value of nextId to the id field.
// It then increments nextId.
// Thus, every new Employer object will get a different ID number.
    public JobField() {
    id = nextId;
    nextId++;
    }

    //this constructor assigns a value to the value field, and initializes the id for the object
    //by calling the first constructor with the this(); statement.
    public JobField(String value) {
        this();
        this.value = value;
    }


//    Which custom methods are identical in ALL of the classes?
    //custom toString, equals and hashCode methods

   //toString method that just returns the value of object
    @Override
    public String toString() {
    return value;
}

    //use IntelliJ Generate to generate the equals and hashCode
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

    //   What getters and setters do ALL of the classes share?
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
