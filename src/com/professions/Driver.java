package com.professions;

import com.katetaier13.Person;

public class Driver extends Person {

    protected int experience;

    public Driver(String dateOfBirth, String fullName, int experience) {
        super(dateOfBirth, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", fullName='" + fullName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
