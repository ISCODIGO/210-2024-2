package registro;

import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Seccion prog2 = new Seccion(
                "II PAC 2024",
                "Programacion II",
                "1800",
                LocalTime.of(18,0,0),
                LocalTime.of(19, 0, 0)
        );
        Estudiante estudiante = new Estudiante("1234", "Juan Lopez");  // Constructur por defecto
        estudiante.agregarSeccion(prog2);
        estudiante.agregarLlegada(prog2, LocalDateTime.now());
        System.out.println(estudiante);
    }
}
