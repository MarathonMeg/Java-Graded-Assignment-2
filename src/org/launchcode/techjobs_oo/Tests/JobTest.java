package org.launchcode.techjobs_oo.Tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    Job job;
    Job job2;

    @BeforeEach
    //create 2 job objects using the empty constructor
    public void CreateJobObjects() {

        job = new Job();
        job2 = new Job();
    }
    @Test
    public void testSettingJobId(){
        //ids are not the same
        assertFalse(job.getId() == job2.getId());
        //ids differ by 1
        assertTrue(job2.getId() - job.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //assertTrue(job3.getName()instanceof Job && job3.getName().getValue().equals("Product tester"));
        assertTrue(job3.getId() == 3);
        assertTrue(job3.getName().equals("Product tester"));
        assertTrue(job3.getEmployer()instanceof Employer && job3.getEmployer().getValue().equals("ACME"));
        assertTrue(job3.getLocation()instanceof Location && job3.getLocation().getValue().equals("Desert"));
        assertTrue(job3.getPositionType()instanceof PositionType && job3.getPositionType().getValue().equals("Quality control"));
        assertTrue(job3.getCoreCompetency()instanceof CoreCompetency && job3.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality() {
        //two job objects with identical values except for id
        Job job4 = new Job("UX Designer", new Employer("Twitter"), new Location("Austin"), new PositionType("User Experience"), new CoreCompetency("Accessibility"));
        Job job5 = new Job("UX Designer", new Employer("Twitter"), new Location("Austin"), new PositionType("User Experience"), new CoreCompetency("Accessibility"));

        //use .equals
        assertFalse(job4.equals(job5));
    }
}
