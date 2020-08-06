import java.util.Objects;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Task
{
    private String task;
    private boolean isCompleted;
    private LocalDate dueDate;
    private String category;

    public Task(String task, LocalDate dueDate, String category)
    {
        this.task = Objects.requireNonNull(task, "task must not be null");
        this.task = task;
        this.dueDate = dueDate;
        this.category = category;
    }

    public long remainingDays()
    {
        return ChronoUnit.DAYS.between(LocalDate.now(), dueDate);
    }

    public String toString()
    {
        if(category == null && dueDate == null) {
            return task;
        } else if(category == null) {
            return task + ": " + "Due in " + remainingDays() + " days.";
        } else if(dueDate == null) {
            return task + ". Category: " + category;
        }
        return task + ": " + "Due in " + remainingDays() + " days. " + "Category: " + category;
    }
    
    public boolean equals(Task other)
    {
        if(this.task.equals(other.getTask()))
        {
            return true;
        }
        return false;
    }

    /***** Getters & Setters *****/
    public String getTask()
    {
        return task;
    }

    public boolean getIsCompleted()
    {
        return isCompleted;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }

    public String getCategory()
    {
        return category;
    }

    public void setTask(String other)
    {
        task = other;
    }

    public void setIsCompleted(boolean other)
    {
        isCompleted = other;
    }

    public void setDueDate(LocalDate other)
    {
        dueDate = other;
    }

    public void setCategory(String other)
    {
        category = other;
    }
}
