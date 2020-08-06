import java.time.*;
import java.util.ArrayList;

public class TaskBoard
{
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ArrayList<Task> completed = new ArrayList<Task>();

    public void addTask(String task, LocalDate dueDate, String category)
    {
        tasks.add(new Task(task, dueDate, category));
    }

    public void setCompleted(int index)
    {
        completed.add(tasks.get(index));
        tasks.remove(index);
        completed.get(completed.size() - 1).setIsCompleted(true);
    }

    public void viewTask(int index)
    {
        System.out.println(tasks.get(index));
    }
    
    public String viewTaskBoard()
    {
        String taskNames = "";
        for(var i = 0; i < tasks.size(); i++)
        {
            taskNames += tasks.get(i).getTask() + ". ";
        }
        
        return taskNames;
    }
    
    public boolean equals(TaskBoard other)
    {
        if(other.getTasks() == this.tasks && other.getCompleted() == this.completed)
            return true;
        return false;
    }
    
    public String toString()
    {
        return viewTaskBoard();
    }
    
    /***** Getters & Setters *****/
    public ArrayList<Task> getTasks()
    {
        return tasks;
    }

    public ArrayList<Task> getCompleted()
    {
        return completed;
    }
    
    public void setTasks(ArrayList<Task> other)
    {
        tasks = other;
    }
    
    public void setCompleted(ArrayList<Task> other)
    {
        completed = other;
    }
}