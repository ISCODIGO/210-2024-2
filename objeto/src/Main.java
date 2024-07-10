import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("1234", "Juan Lopez");  // Constructur por defecto
        estudiante.setAsignatura("Programacion II");
        estudiante.setHoraEntrada(LocalTime.of(18, 0, 0));
        estudiante.horaEntrada = LocalTime.of(3, 0, 0);
        estudiante.agregarEntrada(LocalDateTime.now());

        System.out.println(Arrays.toString(estudiante.llegadas));

        System.out.println(estudiante);
        System.out.println(Arrays.toString(estudiante.getMinutosRetraso()));
        System.out.println(Estudiante.conteoEstudiantes);

        Estudiante estudiante2 = new Estudiante("346546", "Maria Jimenez");
        System.out.println(Estudiante.conteoEstudiantes);
    }
}
