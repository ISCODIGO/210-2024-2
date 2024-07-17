package registro;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.MINUTES;

public class Estudiante {
    // pertenece a la clase y es compartido por todos los objetos
    static int conteoEstudiantes = 0;

    // Atributos
    private String cuenta;
    private String nombre;
    private String clave;
    private ArrayList<Marca> marcas;

    // Funciones
    // 1. Constructor: Permite inicializar el objeto
    public Estudiante(String cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.marcas = new ArrayList<>();
        conteoEstudiantes++;
    }

    // 2. Accesores / Getter: leer atributos
    public String getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    // 3. Setter / mutadores: modificar un atributo
    public void setClave(String clave) {
        this.clave = clave;
    }

    // 4. Auxiliar
    public String toString() {
        return nombre + "(" + cuenta + ")\n" +
                this.marcas;
    }

    public void agregarSeccion(Seccion seccion) {
        this.marcas.add(new Marca(seccion));
    }

    public void agregarMarca(Seccion seccion, LocalDateTime instante) {
        for (Marca marca : this.marcas) {
            if (marca.getSeccion().equals(seccion)) {
                marca.agregarMarca(instante);
            }
        }
    }
}

/*

Clases envoltorias o wrappers son:
boolean -> Boolean
byte -> Byte
short -> Short
char -> Character
int -> Integer
long -> Long
float -> Float
double -> Double

 */