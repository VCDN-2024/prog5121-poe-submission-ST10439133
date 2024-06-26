package partone;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import javax.swing.JOptionPane;

/**
 *
 * https://youtu.be/KpmWN5k6G-I
 * https://youtu.be/2eKjuhzI87g?si=u1UF_A3ycpgRFA2f
 * https://youtu.be/ejI4iHiumrg?si=zTg1RTg13T7yVVXF
 * https://youtu.be/ih0wQ1nBkTA?si=QiQWTJNihC5NDWnQ
 * author Camryn Naidoo ST10439133
 */
public class Tasks
{
    private String taskName;
    private int taskNumber = 0;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration = 0;
    private String taskID;
    private String taskStatus;
    private int sum = 0;

    
        
    // Create and initialize arrays with a 100 maximum capacity, and set the starting size to increase by one for each array index.

    String developerArr[] = new String[100];
    int devSize = 0;
    String nameArr[] = new String[100];
    int nSize = 0;
    String IDarr[] = new String[100];
    int IDSize = 0;
    int durationArr[] = new int[100];
    int durSize = 0;
    String statusArr[] = new String[100];
    int sSize = 0;
    
 
    
    //To call every method needed to add a task, use addTask.
    public void addTask(String taskName, int taskNumber, String developerDetails, String taskDescription, int taskDuration, String taskStat)
    {
            this.taskNumber = taskNumber;
            this.taskName = taskName;
            this.developerDetails = developerDetails;
            returnTotalHours(taskDuration);
            calculateStatus(taskStat);
            createTaskID(taskID);    
            checkTaskDescription(taskDescription);
    }

    public boolean checkTaskDescription(String description) 
    {
        //return true only if there are less than 50 characters
        if(description.length() < 50)
        {
            //JOptionPane.showMessageDialog(null, "Task successfully captured");
            taskDescription = description;
            return true;
        }
        else
        {
            //JOptionPane.showMessageDialog(null, "ERROR: Please enter a task description of less than 50 characters!");
            return false;
        }
    }

    //user inputs a value and the status is calculated using a switch statement
    public void calculateStatus(String taskStat)
    {
        while(true)
        {
            switch (taskStat)
            {
                case "1":
                    taskStatus = "TO DO";
                break;
                case "2":
                    taskStatus = "DONE";
                break;
                case "3":
                    taskStatus = "DOING";
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Value is incorrect please try again");
                    taskStat = JOptionPane.showInputDialog("Please enter the status of the task: \n1. TO DO\n2. DONE\n3. DOING");
                break;
            }  
            break;
        }
    }

    //builds a string to create the task ID
    //only the last 3 letters of the developers first name is used
    public String createTaskID(String taskID) 
    {
        String out;
        if(developerDetails.contains(" ") && developerDetails.length() > 3)
        {
            int space = developerDetails.indexOf(" ");
            String devID = developerDetails.substring(space-3,space);
            out = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + devID.toUpperCase();
            this.taskID = out;
        }
        else
        {
            developerDetails = JOptionPane.showInputDialog("Please enter the developers first name and surname");
        }
        return taskID;
    }

    //calculates the total hours and returns the sum
    public int returnTotalHours(int duration1) 
    {
        sum = sum + duration1;
        taskDuration = sum;
        return sum;
    }
    
    //StringBuilder used to diplay all the data provided by a user
    public String printTaskDetails() 
    {
        StringBuilder display = new StringBuilder();
        display.append("Status: ").append(taskStatus);
        display.append("\nTask Developer: ").append(developerDetails);
        display.append("\nTask Number: ").append(taskNumber);
        display.append("\nTask Name: ").append(taskName);
        display.append("\nTask Description: ").append(taskDescription);
        display.append("\nTaskID: ").append(taskID);
        display.append("\nDuration: ").append(taskDuration);
        //JOptionPane.showMessageDialog(null, display.toString());
        return display.toString();
    }
    
    //to help with unit testing 
    public boolean isTaskDescriptionValid(String description) 
    {
        return description.length() < 50;
    }
    
    public String createTaskID(String taskName, int taskNumber, String developerDetails) 
    {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }
    
    public double getDuration() 
    {
        return taskDuration;
    }
        
     public void taskMenu()
    {
        /*String taskName;
        String developerDetails;
        String taskDescription;
        int duration;
        String taskStatus;   
        int taskNumber = 0;*/
        
        Tasks tasks = new Tasks();
        //menu
        int option = Integer.parseInt(JOptionPane.showInputDialog("Please select an option below:\n1. ADD TASK\n2. SHOW REPORT\n3. QUIT"));
        while(!(option == 3))
        {
            try
            {
                switch (option)
                {
                    case 1:
                        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Please enter amount of tasks"));
                            //loops through how mny tasks the useer wishes to enter
                            for(int x=0; x<numTasks; x++)
                            {
                                taskName = JOptionPane.showInputDialog("Enter the task name");
                                nameArr[nSize] = taskName;
                                nSize++;
                                
                                developerDetails = JOptionPane.showInputDialog("Please enter the developers first name and surname");
                                developerArr[devSize] = developerDetails;
                                devSize++;
                                
                                taskDescription = JOptionPane.showInputDialog("Please enter a brief description of your task, no more than 50 words.");
                                if(tasks.checkTaskDescription(taskDescription) == true)
                                {
                                    JOptionPane.showMessageDialog(null, "Task successfully captured");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "ERROR: Please enter a task description of less than 50 characters!");
                                    taskDescription = JOptionPane.showInputDialog("Please enter a brief description of your task");
                                }
                                
                                taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of hours taken on this task"));
                                durationArr[durSize] = taskDuration;
                                durSize++;
                                
                                taskStatus = JOptionPane.showInputDialog("Please enter the status of the task: \n1. TO DO\n2. DONE\n3. DOING");
                                statusArr[sSize] = taskStatus;
                                sSize++;
                                
                                //creates an object 
                                tasks = new Tasks();
                                //calls addTask from the task class
                                tasks.addTask(taskName, taskNumber, developerDetails, taskDescription, taskDuration, taskStatus);
                                JOptionPane.showMessageDialog(null, tasks.printTaskDetails());
                                //task number incrments
                                taskNumber++;
                                //JOptionPane.showMessageDialog(null,"please work");
                            }
                        break;
                    case 2:
                        //JOptionPane.showMessageDialog(null, "COMING SOON");
                        functionMenu();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.exit(0);
                }
            }
            catch(NumberFormatException e) //try-catch to make sure that only numbers are entered
            {
                JOptionPane.showMessageDialog(null, e + ": Invalid value entered! Please make sure that no letters are used");
            } 
            option = Integer.parseInt(JOptionPane.showInputDialog("Please select an option below:\n1. ADD TASK\n2. VIEW TASKS\n3. QUIT"));
        }         
    }
    
    // method that displays all tasks that have a "done" status
    public void displayCompletedTasks()
    {
        for(int x=0; x<sSize; x++)
        {
            if(statusArr[x].equals("2"))
            {
                JOptionPane.showMessageDialog(null, "COMPLETED TASKS: \n\nDeveloper: " + developerArr[x] + "\nTask Name: " + nameArr[x] + "\nDuration: " + durationArr[x]);
            }
        }
    }
    
    // loops through the duration array and finds the longest duration
    public void longestDuration()
    {
        int high = durationArr[0];
        for(int x=0; x<durSize; x++)
        {
            if(durationArr[x] > high)
            {
                high = durationArr[x];
                JOptionPane.showMessageDialog(null, "LONGEST DURATION:\n\n" + developerArr[x] + " " + durationArr[x] + " hours");
            }
        }
    }
    
    // method that gets the name of a task and displays all the details
    public void searchTaskName()
    {
        String inputTaskName = JOptionPane.showInputDialog("Please enter the task name you would like to search for");
        for(int x=0; x<nSize; x++)
        {
            if(nameArr[x].equals(inputTaskName))
            {
                JOptionPane.showMessageDialog(null, "Task Name: " + nameArr[x] + "\nDeveloper: " + developerArr[x] + "\nTask Status: " + statusArr[x]);
                break;
            }
        }
    }
    
    // method that gets the name of a developer and displays all the details
    public void developerTasks()
    {
        String inputDeveloperName = JOptionPane.showInputDialog("Please enter the developer you would like to search for");
        for(int x=0; x<devSize; x++)
        {
            if(developerArr[x].equalsIgnoreCase(inputDeveloperName))
            {
                JOptionPane.showMessageDialog(null, "ALL TASKS COMPLETED BY: " + inputDeveloperName + "\n\nTask Name: " + nameArr[x] + "\nTask Status: " + statusArr[x]);
                break;
            }
        }    
    }
    
    // deletes a task based on the task name
    public void deleteTask()
    {
        String inputTaskName = JOptionPane.showInputDialog("Please enter the task you would like to search for");
        for(int x=0; x<devSize - 1; x++)
        {
            if(nameArr[x].equals(inputTaskName))
            {
                developerArr[x] = developerArr[x + 1];
                nameArr[x] = nameArr[x + 1];
                durationArr[x] = durationArr[x + 1];
                statusArr[x] = statusArr[x + 1];
                JOptionPane.showMessageDialog(null, "entry " + inputTaskName + " successfully deleted");
            }
        }    
    }
    
    // displays a full report of all the data in the arrays 
    public void displayReport()
    {
        StringBuilder display = new StringBuilder();
        display.append("REPORT:\n\n");
        for(int x=0; x<devSize; x++)
        {
            display.append("Status: ").append(statusArr[x]);
            display.append("\nTask Developer: ").append(developerArr[x]);
            display.append("\nTask Name: ").append(nameArr[x]);
            display.append("\nDuration: ").append(durationArr[x]);
        }
        JOptionPane.showMessageDialog(null, display.toString());
    }
    
    //menu that displays options and calls the respective methods to perfprm functions
    public void functionMenu()
    {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Please select an option below:\n1. DISPLAY COMPLETED TASKS\n2. DEVELOPER WITH LONGEST DURATION\n3. SEARCH USING TASK NAME\n4.DISPLAY ALL TASKS FROM A SPECIFIC DEVELOPER\n5. DELETE A TASK\n6. DISPLAY REPORT\n7. QUIT"));
        while(!(option == 7))
        {
            try
             {
                 switch (option)
                 {
                     case 1:
                         displayCompletedTasks();
                     break;

                     case 2:
                         longestDuration();
                     break;

                     case 3:
                         searchTaskName();
                     break;

                     case 4:
                         developerTasks();
                     break;

                     case 5:
                         deleteTask();
                     break;

                     case 6:
                         displayReport();
                     break;

                     case 7:
                         System.exit(0);
                     break;

                     default:
                         System.exit(0);
                     break;
                 }
             }
             catch(NumberFormatException e) //try-catch to make sure that only numbers are entered
             {
                 JOptionPane.showMessageDialog(null, e + ": Invalid value entered! Please make sure that no letters are used");
             }
        option = Integer.parseInt(JOptionPane.showInputDialog("Please select an option below:\n1. DISPLAY COMPLETED TASKS\n2. DEVELOPER WITH LONGEST DURATION\n3. SEARCH USING TASK NAME\n4.DISPLAY ALL TASKS FROM A SPECIFIC DEVELOPER\n5. DELETE A TASK\n6. DISPLAY REPORT\n7. QUIT"));
        }
    }
    
    //used for unit testing
    public String displayDevelopers(String devArray[])
    {
        String out = "";
        for(int x=0; x<devArray.length; x++)
        {
            out += devArray[x] + "\n";
        }
        return out;
    }
    
    public String testLongestDuration(String devArr[], int durArr[]) 
    {
        int high = durArr[0];
        String out = "";
        for (int x = 0; x < durArr.length; x++) 
        {
            if (durArr[x] > high) 
            {
                high = durationArr[x];
                out = devArr[x] + " " + durArr[x];
            }
        }
        return out;
    }
    
    public String testSearchTaskName(String input, String devArr[], String nArr[]) 
    {
        String out = "";
        for (int x = 0; x < nArr.length; x++) 
        {
            if (nArr[x].equals(input)) 
            {
                out = devArr[x] + ", " + input;
                break;
            }
        }
        return out;
    }

    public String testDeveloperTasks(String input, String devArr[], String nArr[])
    {
        String out = "";
        for(int x=0; x<devArr.length; x++)
        {
            if(devArr[x].equalsIgnoreCase(input))
            {
                out = nArr[x];
                break;
            }
        } 
        return out;
    }
    

    public String testDeleteTask(String input, String devArr[], String nArr[], int durArr[], String sArr[])
    {
        String out = "";
        for(int x=0; x<devArr.length - 1; x++)
        {
            if(nArr[x].equalsIgnoreCase(input))
            {
                devArr[x] = devArr[x + 1];
                nArr[x] = nArr[x + 1];
                durArr[x] = durArr[x + 1];
                sArr[x] = sArr[x + 1];
                out = "entry " + input + " successfully deleted";
            }
        }  
        return out;
    }
    
    public String testDisplayReport(String devArr[], String nArr[], int durArr[], String sArr[])
    {
        String out = "";
        for(int x=0; x<devArr.length; x++)
        {
            out += devArr[x] + ", " + nArr[x] + ", " + durArr[x] + ", " + sArr[x] + "\n";
        }
        return out;
    }

    
    
}
        

            

   
    

    
    

