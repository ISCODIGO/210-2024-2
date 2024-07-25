package planilla;

public class EmpleadoPorHora extends Empleado {
    private double valorHora;
    private double horasMensual;
    public EmpleadoPorHora(String nombre, String cedula, String puesto, String departamento, double valorHora) {
        super(nombre, cedula, puesto, departamento, 0);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora <= 0) {
            throw new IllegalArgumentException("Valor hora no puede ser cero o negativo");
        }
        this.valorHora = valorHora;
    }

    public double getHorasMensual() {
        return horasMensual;
    }

    public void setHorasMensual(double horasMensual) {
        if (horasMensual < 0) {
            throw new IllegalArgumentException("Horas mensuales no pueden ser negativas");
        }
        this.horasMensual = horasMensual;
    }

    @Override
    public double valorAPagar() {
        return this.getHorasMensual() * this.getValorHora();
    }
}
