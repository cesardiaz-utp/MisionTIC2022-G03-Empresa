package co.edu.utp.misiontic2022.cesardiaz.modelo;

import co.edu.utp.misiontic2022.cesardiaz.excepciones.SueldoErroneoException;

public class Empleado extends Persona implements Comparable<Empleado> {
    public static final Double SALARIO_MINIMO = 1_000_000d;

    private Double sueldoBruto;

    public Empleado(String nombre, Integer edad) {
        this(nombre, edad, SALARIO_MINIMO);
    }

    public Empleado(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        if (sueldoBruto < this.sueldoBruto) {
            throw new SueldoErroneoException("El sueldo no puede ser menor al anterior");
        }
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public void mostrar() {
        System.out.printf("El empleado %s tiene %d años y su sueldo es de $ %,.2f %n",
                getNombre(), getEdad(), sueldoBruto);
    }

    public void calcularSalarioNeto() {
        // TODO: Calcular salario neto
    }

    @Override
    public int compareTo(Empleado o) {
        var comparacion = sueldoBruto.compareTo(o.getSueldoBruto());

        if (comparacion == 0) {
            comparacion = getNombre().compareTo(o.getNombre());
        }

        return comparacion;
    }

}
