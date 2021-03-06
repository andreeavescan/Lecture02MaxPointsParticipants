package Lecture02MaxPointsParticipantsMV;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


//import MaxPointsParticipantsMV.repository.Repository;
//import MaxPointsParticipantsMV.controller.ParticipantController;

import repository.Repository;
import controller.ParticipantController;

public class AppTestWBT extends TestCase {
    private Repository rep;
    private ParticipantController ctrl;


    public void test_tc_1_AllStatements() {

        rep = new Repository("src/test/java/Lecture02MaxPointsParticipantsMV/FileParticipantsMaxStatements.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(2, noParticipantsMax);
        System.out.println();
    }

    public void test_tc_2_S3_True() {


        rep = new Repository("src/test/java/Lecture02MaxPointsParticipantsMV/FileParticipantsMaxConditionsS3.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(1, noParticipantsMax);
        System.out.println();
    }

    public void test_tc_3_Path1() {

        rep = new Repository("src/test/java/Lecture02MaxPointsParticipantsMV/FileParticipantsMaxPath1.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(0, noParticipantsMax);
        System.out.println();
    }

    public void test_tc_4_Loop_1() {

        rep = new Repository("src/test/java/Lecture02MaxPointsParticipantsMV/FileParticipantsMaxLoop1.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(1, noParticipantsMax);
        System.out.println();
    }

    public void test_tc_5_Loop_2() {

        rep = new Repository("src/test/java/Lecture02MaxPointsParticipantsMV/FileParticipantsMaxLoop2.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(1, noParticipantsMax);
        System.out.println();
    }



    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTestWBT( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTestWBT.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
