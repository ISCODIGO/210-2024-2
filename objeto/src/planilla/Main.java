package planilla;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double sueldo = 23000;
        Empleado emp1 = new Empleado(
                "Jose A",
                "0810192",
                "Analista de Datos",
                "Tecnologia",
                sueldo
        );
        Deduccion ihss = new Deduccion("IHSS", sueldo*0.05);
        Deduccion isr = new Deduccion("ISR", sueldo*0.1);

        EmpleadoPorHora emp2 = new EmpleadoPorHora(
                "Claudio X",
                "082342",
                "Pintor",
                "Mantenimiento",
                500
        );



        emp1.agregarDeduccion(ihss);
        emp1.agregarDeduccion(new Deduccion("ISR", sueldo*0.1));
        System.out.println("Pago emp1: ");
        System.out.println(emp1.valorAPagar());
        System.out.println("Pago emp2: ");
        emp2.setHorasMensual(20);
        System.out.println(emp2.valorAPagar());

        ArrayList<Empleado> nomina = new ArrayList<>();
        nomina.add(emp1);
        nomina.add(emp2);

        Empleado x = emp2;
        System.out.println("Emp x");
        System.out.println(x.valorAPagar());

        for (Empleado item : nomina) {
            System.out.println(item.getNombre() + ": " + item.valorAPagar());
        }

    }
}
