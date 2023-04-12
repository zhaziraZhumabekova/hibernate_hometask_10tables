package peaksoft.student;

public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = new Student("Zhazira", "Zhumabekova", 21);
        Student student2 = new Student("Meerjan", "Aymatova", 21);
//        Student student3 = new Student("Kayrat", "Kayraybekovich", 21);
        studentService.create(student);
//        studentService.create(student2);
//        studentService.create(student3);
//        System.out.println(studentService.getById(2L));
//        studentService.deleteById(3L);
//        studentService.deleteAll();
        for(Student student1 : studentService.getAll()){
            System.out.println(student1);
        }


    }
}
