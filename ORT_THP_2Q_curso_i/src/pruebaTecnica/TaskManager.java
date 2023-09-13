package pruebaTecnica;

import java.util.*;
import java.text.SimpleDateFormat;

public class TaskManager {

    private static Scanner scanner = new Scanner(System.in);
    private static String dni;
    private static List<Task> tasks = new ArrayList<>();
    private static List<Task> completedTasks = new ArrayList<>(); // Lista para tareas finalizadas
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("Bienvenido al Administrador de Tareas");

        // Solicitar DNI del usuario
        System.out.print("Por favor, ingrese su DNI: ");
        dni = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Crear nueva tarea");
            System.out.println("2. Editar tarea");
            System.out.println("3. Finalizar tarea");
            System.out.println("4. Ver tareas históricas");
            System.out.println("5. Exportar tareas a CSV");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion deseada: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (option) {
                case 1:
                    createNewTask();
                    break;
                case 2:
                    editTask();
                    break;
                case 3:
                    finishTask();
                    break;
                case 4:
                    viewHistoricalTasks();
                    break;
                case 5:
                    exportToCSV();
                    break;
                case 6:
                    System.out.println("Gracias por usar el Administrador de Tareas. ¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opcion no valida. Por favor, elija una opción valida.");
            }
        }
    }

    private static void createNewTask() {
        System.out.print("\nIngrese un titulo descriptivo para la tarea: ");
        String title = scanner.nextLine();

        // Crear una nueva tarea
        Task newTask = new Task(title, dni);
        newTask.setStartTime(new Date());
        newTask.setEndTime(null);

        // Agregar la tarea a la lista de tareas
        tasks.add(newTask);

        System.out.println("\nTarea registrada exitosamente.");
    }

    private static void editTask() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas para editar.");
            return;
        }

        System.out.println("\nLista de tareas:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getTitle() + (task.getEndTime() != null ? " (Finalizada)" : ""));
        }

        System.out.print("\nSeleccione el numero de la tarea que desea editar: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("\nNumero de tarea no válido.");
            return;
        }

        Task selectedTask = tasks.get(taskNumber - 1);

        if (selectedTask.getEndTime() != null) {
            System.out.println("\nEsta tarea ya está finalizada y no se puede editar.");
            return;
        }

        System.out.println("\nSeleccione la opcion de edicion:");
        System.out.println("\n1. Modificar titulo");
        System.out.println("2. Modificar descripcion");
        System.out.print("\nIngrese la opcion deseada: ");
        int editOption = scanner.nextInt();
        scanner.nextLine();

        switch (editOption) {
            case 1:
                System.out.print("\nIngrese el nuevo titulo: ");
                String newTitle = scanner.nextLine();
                selectedTask.setTitle(newTitle);
                System.out.println("\nTitulo modificado exitosamente.");
                break;
            case 2:
                System.out.print("\nIngrese la nueva descripcion: ");
                String newDescription = scanner.nextLine();
                selectedTask.setDescription(newDescription);
                System.out.println("\nDescripcion modificada exitosamente.");
                break;
            default:
                System.out.println("\nOpcion de edicion no valida.");
        }
    }

    private static void finishTask() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas para finalizar.");
            return;
        }

        System.out.println("\nLista de tareas activas:");
        List<Task> activeTasks = new ArrayList<>();

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getEndTime() == null) {
                activeTasks.add(task);
                System.out.println((i + 1) + ". " + task.getTitle());
            }
        }

        if (activeTasks.isEmpty()) {
            System.out.println("No hay tareas activas para finalizar.");
            return;
        }

        System.out.print("\nSeleccione el numero de la tarea que desea finalizar: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if (taskNumber < 1 || taskNumber > activeTasks.size()) {
            System.out.println("\nNumero de tarea no válido.");
            return;
        }

        Task selectedTask = activeTasks.get(taskNumber - 1);

        // Registrar hora de finalización de la tarea seleccionada
        selectedTask.setEndTime(new Date());
        // Calcular tiempo invertido en la tarea seleccionada
        long timeElapsed = selectedTask.getEndTime().getTime() - selectedTask.getStartTime().getTime();
        selectedTask.setTimeSpent(timeElapsed);

        // Mover la tarea completada a la lista de tareas finalizadas
        completedTasks.add(selectedTask);

        // Eliminar la tarea de la lista de tareas activas
        tasks.remove(selectedTask);

        System.out.println("\nTarea finalizada exitosamente.");
    }
    
    private static void viewHistoricalTasks() {
        if (completedTasks.isEmpty()) {
            System.out.println("No hay tareas históricas para mostrar.");
            return;
        }

        System.out.println("\nHistorial de tareas:");

        for (Task task : completedTasks) {
            System.out.println("\nTítulo: " + task.getTitle());
            System.out.println("Descripción: " + task.getDescription());
            System.out.println("Hora de inicio: " + formatDate(task.getStartTime()));
            System.out.println("Hora de finalización: " + formatDate(task.getEndTime()));
            System.out.println("Tiempo invertido: " + formatTime(task.getTimeSpent()) + "\n");
        }
    }

    private static void exportToCSV() {
        if (tasks.isEmpty() && completedTasks.isEmpty()) {
            System.out.println("No hay tareas para exportar.");
            return;
        }

        // Crear una cadena CSV
        StringBuilder csvData = new StringBuilder();
        csvData.append("\nTítulo,Descripción,Hora de inicio,Hora de finalización,Tiempo invertido (segundos)\n");

        // Exportar tareas activas
        for (Task task : tasks) {
            csvData.append(task.getTitle()).append(",");
            csvData.append(task.getDescription()).append(",");
            csvData.append(formatDate(task.getStartTime())).append(",");

            // Verificar si endTime es nulo antes de formatearlo
            if (task.getEndTime() != null) {
                csvData.append(formatDate(task.getEndTime())).append(",");
                csvData.append(task.getTimeSpent() / 1000).append("\n");  // Convertir tiempo a segundos
            } else {
                csvData.append("(No registrada),");
                csvData.append("(No registrado)\n");
            }
        }

        // Exportar tareas finalizadas
        for (Task task : completedTasks) {
            csvData.append(task.getTitle()).append(",");
            csvData.append(task.getDescription()).append(",");
            csvData.append(formatDate(task.getStartTime())).append(",");
            csvData.append(formatDate(task.getEndTime())).append(",");
            csvData.append(task.getTimeSpent() / 1000).append("\n");
        }

        // Imprimir la cadena CSV
        System.out.println("\nDatos exportados a CSV:");
        System.out.println(csvData.toString());
    }


    private static String formatDate(Date date) {
        return dateFormat.format(date);
    }

    private static String formatTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        seconds %= 60;
        long hours = minutes / 60;
        minutes %= 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

class Task {
    private String title;
    private String description;
    private String dni;
    private Date startTime;
    private Date endTime;
    private long timeSpent;
    private int taskNumber; // Número de tarea en la lista

    public Task(String title, String dni) {
        this.title = title;
        this.dni = dni;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDni() {
        return dni;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(long timeSpent) {
        this.timeSpent = timeSpent;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }
}
