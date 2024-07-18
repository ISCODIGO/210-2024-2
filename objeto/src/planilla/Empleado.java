package planilla;

public class Empleado {
    private int id;
    private String nombre;
    private String cedula;
    private String puesto;
    private String departamento;
    private String cuentaBancaria;
    private double salario;

    private static int secuencia = 0;

    public Empleado(String nombre, String cedula, String puesto, String departamento, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
        this.id = ++secuencia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setSalario(double salario) {
        if (salario < this.salario) {
            throw new IllegalArgumentException("El salario no puede disminuir");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public valorAPagar() {

    }
}
