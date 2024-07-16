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
    private ArrayList<Seccion> secciones;
    private ArrayList<LocalDateTime> llegadas;

    // Funciones
    // 1. Constructor: Permite inicializar el objeto
    public Estudiante(String cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.llegadas = new ArrayList<>();
        this.secciones = new ArrayList<>();
        conteoEstudiantes++;
    }


    // 4. Auxiliar
    public void agregarEntrada(LocalDateTime instante) {
        this.llegadas.add(instante);
    }

    public void agregarSeccion(Seccion seccion) {
        this.secciones.add(seccion);
    }

    /*public int[] getMinutosRetraso() {
        int[] salida = new int[this.llegadas.length];
        for (int i = 0; i < this.llegadas.length; i++) {
            if (this.llegadas[i] == null) {
                salida[i] = -1;
            } else {
            // 1. Obtener de las llegadas la hora (LocalTime) LocalDateTime -> LocalTime
                LocalTime start = this.horaEntrada;
                LocalTime end = this.llegadas[i].toLocalTime();

            // 2. Una vez obtenido calcular la diferencia en minutos de hora de inicio - hora de llegada
                salida[i] = (int) MINUTES.between(start, end);
                if (salida[i] < 0) {
                    salida[i] = 0;
                }
            }
        }
        return salida;
    }*/

    public String toString() {
        return nombre + "(" + cuenta + ")";
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