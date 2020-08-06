import java.time.*; 

public class main
{
    public static void main()
    {
        TaskBoard taskBoard = new TaskBoard();
        taskBoard.addTask("Wash the dishes", null, null);
        taskBoard.addTask("Do laundry", format("2020-08-07"), null);
        taskBoard.addTask("Email doctor", null, "Health");
        taskBoard.addTask("Get school supplies", format("2020-09-01"), "School");
        
        taskBoard.viewTask(3);
        
        taskBoard.setCompleted(1);
        
        System.out.println(taskBoard.getCompleted().get(0).getIsCompleted());
        
        System.out.println(taskBoard.getTasks());
        
        System.out.println(taskBoard);
    }
    
    public static LocalDate format(String date)
    {
        return LocalDate.parse(date);
    }
}
