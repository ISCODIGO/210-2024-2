import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Seccion prog2 = new Seccion(
                "II PAC 2024",
                "1800",
                LocalTime.of(18,0,0),
                LocalTime.of(19, 0, 0),
                "Programacion II"
        );
        Estudiante estudiante = new Estudiante("1234", "Juan Lopez");  // Constructur por defecto
        estudiante.agregarSeccion(prog2);
    }
}
