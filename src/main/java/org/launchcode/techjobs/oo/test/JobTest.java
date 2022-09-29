package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testAll = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        Test if true
        assertTrue(testAll.getName() instanceof String);
        assertTrue(testAll.getEmployer() instanceof Employer);
        assertTrue(testAll.getLocation() instanceof Location);
        assertTrue(testAll.getPositionType() instanceof PositionType);
        assertTrue(testAll.getCoreCompetency() instanceof CoreCompetency);

        //Test if equal
        assertEquals(testAll.getName() = String);


    }

}
