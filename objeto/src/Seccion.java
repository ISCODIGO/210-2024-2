import java.time.LocalTime;

public class Seccion {
    private String asignatura;

    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private String codigo;
    public Seccion(String periodo, String codigo, LocalTime horaEntrada, LocalTime horaSalida, String asignatura) {
        this.periodo = periodo;
        this.codigo = codigo;
        this.setHoraEntrada(horaEntrada);
        this.setHoraSalida(horaSalida);
        this.asignatura = asignatura;
    }
    private String periodo;

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

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        if (this.horaEntrada.getHour() >= horaSalida.getHour()) {
            throw new IllegalArgumentException("La hora de entrada debe ser menor a la de salida");
        }
        this.horaSalida = horaSalida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Seccion{" +
                "asignatura='" + asignatura + '\'' +
                ", codigo='" + codigo + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
