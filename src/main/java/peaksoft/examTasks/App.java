package peaksoft.examTasks;

public class App {
    public static void main(String[]args){

        TasksService tasksService = new TasksService();
        ExamTasks examTasks1 = new ExamTasks("if else", "jdbc", "17.04.2023");
        ExamTasks examTasks2 = new ExamTasks("OOP", "spring core", "01.05.2023");
        ExamTasks examTasks3 = new ExamTasks("arrays", "hibernate", "20.04.2023");
        ExamTasks examTasks4 = new ExamTasks("methods", "SQL", "25.04.2023");
        tasksService.create(examTasks1);
        tasksService.create(examTasks2);
        tasksService.create(examTasks3);
        tasksService.create(examTasks4);
    }
}
