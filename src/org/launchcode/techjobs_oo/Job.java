package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

   //only name is a String all other properties are Classes of their own
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    //1st constructor DONE
    public Job(){
        id = nextId;
        nextId++;
    }

    //2nd constructor takes 5 parameters and assigns values to name, employer, location, positionType, and coreCompetency.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //DONE
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //5) Code toString to Pass the Tests
//   @Override
    public String toString(){
    //there has got to be a more dry way to do this
        if (this.getName().isEmpty()) {
            this.name = "Data not available";
            }
            else if (this.getEmployer().getValue().isEmpty()){
                this.employer.setValue("Data not available");
            }
            else if (this.getLocation().getValue().isEmpty()){
                this.location.setValue("Data not available");
            }
            else if (this.getPositionType().getValue().isEmpty()){
                this.positionType.setValue("Data not available");
            }
            else if (this.getCoreCompetency().getValue().isEmpty()){
                this.coreCompetency.setValue("Data not available");
            }

        return "\n" + "ID: " + this.getId()
                + "\n" + "Name: " + this.getName()
                + "\n" + "Employer: " + this.getEmployer()
                + "\n" + "Location: " + this.getLocation()
                + "\n" + "Position Type: " + this.getPositionType()
                + "\n" + "Core Competency: " + this.getCoreCompetency()
                + "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // DONE

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }



}
