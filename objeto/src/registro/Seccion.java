package registro;

import java.time.LocalTime;

public class Seccion {
    public Seccion(String asignatura, LocalTime horaEntrada) {
        this.asignatura = asignatura;
        this.horaEntrada = horaEntrada;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime hora) {
        if (hora.getHour() < 6 || hora.getHour() > 21) {
            throw new IllegalArgumentException("Hora invalida");
        }
        horaEntrada = hora;
    }

    @Override
    public String toString() {
        return "Seccion{" +
                "asignatura='" + asignatura + '\'' +
                ", horaEntrada=" + horaEntrada +
                '}';
    }

    String asignatura;
    LocalTime horaEntrada;

}
