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
        assertEquals("Product tester", testAll.getName());
        assertEquals("ACME", testAll.getEmployer().toString());
        assertEquals("Desert", testAll.getLocation().toString());
        assertEquals("Quality control", testAll.getPositionType().toString());
        assertEquals("Persistence", testAll.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine (){
        Job testString = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', testString.toString().charAt(0));
        assertEquals('\n', testString.toString().charAt(testString.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testString = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: \nName: Product tester \nEmployer: ACME \nLocation: Desert \nPostion Type: Quality Control \nCore Competency: Persistence");
    }

}
