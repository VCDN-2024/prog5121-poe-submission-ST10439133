/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

public class Tasks 
{
   
    private String TaskName;
    private String TaskNumber;
    private String TaskDescription;
    private String DeveloperDetails;
    private int TaskDuration;
    private String TaskID;
    private String TaskStatus;
    private int sum = 0;
    
    public void addTask(String TaskName, String TaskNumber, String TaskDescription, String DeveloperDetails, int TaskDuration, String TaskID, String TaskStatus)
    {       
            this.TaskName = TaskName;
            this.TaskNumber = TaskNumber;
            CheckTaskDescription(TaskDescription);
            this.DeveloperDetails = DeveloperDetails;
            this.TaskDuration = TaskDuration;
            CreateTaskID(TaskName, TaskNumber, DeveloperDetails);
            this.TaskStatus = TaskStatus;
        }

    private boolean CheckTaskDescription(String TaskDescription)
    {
        if(TaskDescription.length() <= 100)
        {
            return true;
        }
        else return false;
}

//first 2 letters of task name, a colon, task number, a colon, last 3 letters of developer assigned to task name
private String CreateTaskID(String TaskName, String TaskNumber, String DeveloperName)
{
    String output;

    if(DeveloperName.contains(" ") && TaskName.length() > 2)
    {
        int space = DeveloperDetails.indexOf(" ");
        

        String DeveloperID = DeveloperName.substring(space-2, space).toUpperCase();
        String nameID =  TaskName.substring(0, 2);

        //construct the output
        output = nameID + ":" + TaskNumber + ":" + DeveloperID;
        TaskID = output;
    }
    else
    {
        JOptionPane.showMessageDialog(null, "An Error has occured.");
    }
    return TaskID;
}

//string manipulation
public String PrintTaskDetails()
{
    StringBuilder display = new StringBuilder();
    //append, toString...
    display.append("\nStatus: ").append(TaskStatus);
    display.append("\nTask Developer: ").append(DeveloperDetails);
    display.append("\nTask Number: ").append(TaskNumber);
    display.append("\nTask Name: ").append(TaskName);
    display.append("\nTask Description: ").append(TaskDescription);
    display.append("\nTask ID: ").append(TaskID);
    display.append("\nTask Duration: ").append(TaskDuration);

    return display.toString();
}

public int ReturnTotalHours(int duration)
{
    sum += duration;
    TaskDuration = sum;
    return sum;
}

public String CalculateStatus(int TaskStatus)
{
    while(true)
    {
     
        switch (TaskStatus)
        {
            case 1:
                TaskStatus = "TO DO";
                break;

            case 2:
                TaskStatus = "DOING";
                break;

            case 3:
                TaskStatus = "DONE";
                break;

            default:
                //JOptionPane.showMessageDialog(null, "The value you have entered is incorrect. Please enter a number.");
                TaskStatus = Integer.parseInt(JOptionPane.showInputDialog("Please enter the status of the Task: \n1. TO DO\n2. COMPLETED\n3. DOING"));
                break;
        }
    }
}

public void TaskMenu()
{
    int option = Integer.parseInt(JOptionPane.showInputDialog("Please select an option: \n1. Add Task\n2. Show Report\n 3. Quit"));
    while(!(option ==3))
    {
        try
        {
            case 1:
                int numTasks =Integer.parseInt(JOptionpane.showInputDialog("How many tasks would like to enter?"));
                
            for(int x=0; x< numTasks; x++)
            {
                
                //user enters the name of the task
                String TaskName = JOptionPane.showInput.Dialog("Please enter the name of the Task");

                //user enters the Task Number 
                String TaskNumber = JOptionPane.showInputDialog("Please enter the Task Number of" + DeveloperName);

                //user enter the first name and last name of the developer
                String DeveloperDetails = JOptionPane.showInputDialog("Please enter the developer of " + TaskName);

                //user enters the task duration of the developer
                int duration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the estimated task duration of " + TaskName + " (hours)"));

                //user enters the status of the Task
                String TaskStatus = JOptionPane.showInputDialog("Please enter the status of the task:\n1. TO DO\n2. DONE\n3. DOING");

                //user enters a brief description of the book
                String description = JOptionPane.showInputDialog("Please enter a brief description of " + TaskName);

                //checks if the description meets the requirements
                if(CheckTaskDescription(description))
                {
                    JOptionPane.showMessageDialog(null, "Task successfully captured");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter a brief description of " + TaskName + "(Please ensure that your description is no more than 50 words long)");
                }

                addTask(TaskName, TaskNumber,TaskDescription, DeveloperDetails, TaskDuration, TaskID, TaskStatus);
                JOptionPane.showMessageDialog(null, PrintTaskDetails());
            }
            break;

        {
        case 2:
            JOptionPane.showMessageDialog(null, "COMING SOON!");
            break;

        case 3:
            System.exit(0);
            break;

            default:
            System.exit(0);

        }
    }
    catch(NumberFormatException n)
    {
    JOptionPane.showInputDialog(null,"Error: " + n + " Invalid value please enter a number");
    }

option = Integer.parseInt(JOptionPane.showInputDialog("Please select an option: \n1. Add Task\n2. Show Report\n3. Quit"));

        }
    }
}
        

            

   
    

    
    

