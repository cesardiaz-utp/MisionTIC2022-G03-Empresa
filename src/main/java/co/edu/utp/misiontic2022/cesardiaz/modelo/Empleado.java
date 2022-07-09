package co.edu.utp.misiontic2022.cesardiaz.modelo;

public class Empleado extends Persona {
    public static final Double SALARIO_MINIMO = 1_000_000d;

    public Double sueldoBruto;

    public Empleado(String nombre, Integer edad) {
        this(nombre, edad, SALARIO_MINIMO);
    }

    public Empleado(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public void mostrar() {
        System.out.printf("El empleado %s tiene %d años y su sueldo es de $ %,.2f %n",
                nombre, edad, sueldoBruto);
    }

    public void calcularSalarioNeto() {
        // TODO: Calcular salario neto
    }

}
