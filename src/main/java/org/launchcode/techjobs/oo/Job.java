package org.launchcode.techjobs.oo;

import java.util.Objects;


public class Job {

    private int id;
    private static int nextId = 1;

    private String value;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.value = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
//        this.id = nextId;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        if (getName().toString() == "" || getName() == null) {
            setName("Data not available");
        }
        if (getEmployer().toString() == "" || getEmployer() == null) {
            employer.setValue("Data not available");
        }
        if (getLocation().toString() == "" || getLocation() == null) {
            location.setValue("Data not available");}
        if (getPositionType().toString() == "" || getPositionType() == null) {
            positionType.setValue("Data not available");
        }
        if (getCoreCompetency().toString() == "" || getCoreCompetency() == null) {
            coreCompetency.setValue("Data not available");
        }
        return "\nID: " + getId() +
                "\nName: " + value +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency +"\n";
    }

        @Override
        public boolean equals (Object o){  // Two objects are equal if they have the same id.
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Job job = (Job) o;
            return id == job.id;
        }

        @Override
        public int hashCode () {
            return Objects.hash(id);
        }

        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id.

    public int getId() {
        return id;
    }
        public Employer getEmployer(){
            return employer;
        }

        public Location getLocation () {
            return location;
        }

        public PositionType getPositionType () {
            return positionType;
        }

        public CoreCompetency getCoreCompetency () {
            return coreCompetency;
        }

        public String getName () {
        return value;
    }

        public void setName (String name){
            this.value = name;
        }

        public void setEmployer (Employer employer){
            this.employer = employer;
        }

        public void setLocation (Location location){
            this.location = location;
        }

        public void setPositionType (PositionType positionType){
            this.positionType = positionType;
        }
        public void setCoreCompetency (CoreCompetency coreCompetency){
            this.coreCompetency = coreCompetency;
        }
    }
