/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import partone.Tasks;

/**
 *
 * @author lab_services_student
 */
public class TasksTest {
    
    public TasksTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTask method, of class Tasks.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String taskName = "Create Task, Create Add Features, Create Reports, Add Arrays";
        int taskNumber = 1-4;
        String developerDetails = "Mike Smith, Edward Harrington, Samantha Paulson, Glenda Oberholzer";
        String taskDescription = "5, 8, 2, 11";
        int taskDuration = 11;
        String taskStat = "To Do, Doing, Done, To Do";
        Tasks instance = new Tasks();
        instance.addTask(taskName, taskNumber, developerDetails, taskDescription, taskDuration, taskStat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Tasks.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "";
        Tasks instance = new Tasks();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateStatus method, of class Tasks.
     */
    @Test
    public void testCalculateStatus() {
        System.out.println("calculateStatus");
        String taskStat = "";
        Tasks instance = new Tasks();
        instance.calculateStatus(taskStat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Tasks.
     */
    @Test
    public void testCreateTaskID_String() {
        System.out.println("createTaskID");
        String taskID = "";
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.createTaskID(taskID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Tasks.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int duration1 = 0;
        Tasks instance = new Tasks();
        int expResult = 0;
        int result = instance.returnTotalHours(duration1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Tasks.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTaskDescriptionValid method, of class Tasks.
     */
    @Test
    public void testIsTaskDescriptionValid() {
        System.out.println("isTaskDescriptionValid");
        String description = "";
        Tasks instance = new Tasks();
        boolean expResult = false;
        boolean result = instance.isTaskDescriptionValid(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Tasks.
     */
    @Test
    public void testCreateTaskID_3args() {
        System.out.println("createTaskID");
        String taskName = "";
        int taskNumber = 0;
        String developerDetails = "";
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Tasks.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Tasks instance = new Tasks();
        double expResult = 0.0;
        double result = instance.getDuration();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskMenu method, of class Tasks.
     */
    @Test
    public void testTaskMenu() {
        System.out.println("taskMenu");
        Tasks instance = new Tasks();
        instance.taskMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCompletedTasks method, of class Tasks.
     */
    @Test
    public void testDisplayCompletedTasks() {
        System.out.println("displayCompletedTasks");
        Tasks instance = new Tasks();
        instance.displayCompletedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longestDuration method, of class Tasks.
     */
    @Test
    public void testLongestDuration() {
        System.out.println("longestDuration");
        Tasks instance = new Tasks();
        instance.longestDuration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskName method, of class Tasks.
     */
    @Test
    public void testSearchTaskName() {
        System.out.println("searchTaskName");
        Tasks instance = new Tasks();
        instance.searchTaskName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of developerTasks method, of class Tasks.
     */
    @Test
    public void testDeveloperTasks() {
        System.out.println("developerTasks");
        Tasks instance = new Tasks();
        instance.developerTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class Tasks.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        Tasks instance = new Tasks();
        instance.deleteTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReport method, of class Tasks.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        Tasks instance = new Tasks();
        instance.displayReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of functionMenu method, of class Tasks.
     */
    @Test
    public void testFunctionMenu() {
        System.out.println("functionMenu");
        Tasks instance = new Tasks();
        instance.functionMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDevelopers method, of class Tasks.
     */
    @Test
    public void testDisplayDevelopers() {
        System.out.println("displayDevelopers");
        String[] devArray = null;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.displayDevelopers(devArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testLongestDuration method, of class Tasks.
     */
    @Test
    public void testTestLongestDuration() {
        System.out.println("testLongestDuration");
        String[] devArr = null;
        int[] durArr = null;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.testLongestDuration(devArr, durArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testSearchTaskName method, of class Tasks.
     */
    @Test
    public void testTestSearchTaskName() {
        System.out.println("testSearchTaskName");
        String input = "";
        String[] devArr = null;
        String[] nArr = null;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.testSearchTaskName(input, devArr, nArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testDeveloperTasks method, of class Tasks.
     */
    @Test
    public void testTestDeveloperTasks() {
        System.out.println("testDeveloperTasks");
        String input = "";
        String[] devArr = null;
        String[] nArr = null;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.testDeveloperTasks(input, devArr, nArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testDeleteTask method, of class Tasks.
     */
    @Test
    public void testTestDeleteTask() {
        System.out.println("testDeleteTask");
        String input = "";
        String[] devArr = null;
        String[] nArr = null;
        int[] durArr = null;
        String[] sArr = null;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.testDeleteTask(input, devArr, nArr, durArr, sArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testDisplayReport method, of class Tasks.
     */
    @Test
    public void testTestDisplayReport() {
        System.out.println("testDisplayReport");
        String[] devArr = null;
        String[] nArr = null;
        int[] durArr = null;
        String[] sArr = null;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.testDisplayReport(devArr, nArr, durArr, sArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
