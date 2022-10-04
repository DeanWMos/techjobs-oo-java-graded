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
        Job testAll = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: \nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", testAll.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJobNoName = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job testJobNoEmployer = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job testJobNoLocation = new Job("Product Tester", new Employer("ACME"), new Location(""), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job testJobNoPositionType = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        Job testJobNoCoreCompetency = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        assertEquals("\nID: \nName: Data not available\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJobNoName.toString());
        assertEquals("\nID: 7\nName: Product Tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJobNoEmployer.toString());
        assertEquals("\nID: 5\nName: Product Tester\nEmployer: ACME\nLocation: Data not available\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJobNoLocation.toString());
        assertEquals("\nID: 4\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Data not available\nCore Competency: Persistence\n", testJobNoPositionType.toString());
        assertEquals("\nID: 3\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Data not available\n", testJobNoCoreCompetency.toString());

}}
