package registro;

import java.time.LocalTime;

public class Seccion {
    private String periodo;
    private String asignatura;
    private String codigo;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Seccion(String periodo, String asignatura, String codigo, LocalTime entrada, LocalTime salida) {
        this.periodo = periodo;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horaEntrada = entrada;
        this.horaSalida = salida;
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



}
