import powers.*;
import strategy.*;
import students.Student;
import tasks.Task;
import tasks.TaskFactory;
import university.University;

public class Main {

    public static void main(String[] args) {

        University university = University.getInstance();
        university.startExam();

        System.out.println("\n----- СТУДЕНТ 1 -----");

        Student student1 = new Student("вундеркинд", new Teleportation());
        student1.arrive();

        Task task1 = TaskFactory.createTask(student1.getType());
        task1.show();

        Power power1 = new SuperFocus(new BasicPower());
        power1.use();

        System.out.println("\n----- СТУДЕНТ 2 -----");

        Student student2 = new Student("фитнес", new JumpRunning());
        student2.arrive();

        Task task2 = TaskFactory.createTask(student2.getType());
        task2.show();

        Power power2 = new FastWriting(new BasicPower());
        power2.use();

        System.out.println("\n----- СТУДЕНТ 3 -----");

        Student student3 = new Student("калитко", new SleepingBus());
        student3.arrive();

        Task task3 = TaskFactory.createTask(student3.getType());
        task3.show();

        Power power3 = new Telepathy(new BasicPower());
        power3.use();
    }
}