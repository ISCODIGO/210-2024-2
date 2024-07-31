package registro;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import static java.time.temporal.ChronoUnit.MINUTES;

public class Marca {
    private Seccion seccion;
    private ArrayList<LocalDateTime> registro;

    public Marca(Seccion seccion) {
        this.seccion = seccion;
        this.registro = new ArrayList<>();
    }

    public void agregarMarca(LocalDateTime instante) {
        this.registro.add(instante);
    }

    public int[] getMinutosRetraso() {
        int[] salida = new int[this.registro.size()];
        int i = 0;
        for (LocalDateTime instante : this.registro) {
            // 1. Obtener de las llegadas la hora (LocalTime) LocalDateTime -> LocalTime
            LocalTime start = seccion.getHoraEntrada();
            LocalTime end = instante.toLocalTime();

            // 2. Una vez obtenido calcular la diferencia en minutos de hora de inicio - hora de llegada
            salida[i++] = (int) MINUTES.between(start, end);
            if (salida[i] < 0) {
                salida[i] = 0;
            }

            // TODO: Que pasa si el alumno no marca un dia?
        }
        return salida;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public ArrayList<LocalDateTime> getRegistro() {
        return registro;
    }

    @Override
    public String toString() {
        return seccion + ": " + this.registro.toString();
    }
}
