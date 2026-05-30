package tasks;

public class TaskFactory {

    public static Task createTask(String type) {

        switch (type) {
            case "вундеркинд":
                return new FunTask();

            case "фитнес":
                return new HardTask();

            case "калитко":
                return new EasyTask();

            default:
                return new EasyTask();
        }
    }
}