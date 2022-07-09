package co.edu.utp.misiontic2022.cesardiaz.modelo;

import java.util.Set;
import java.util.TreeSet;

public class Directivo extends Empleado {
    public static final String CATEGORIA_DEFAULT = "Sin Categoria";

    private String categoria;

    private Set<Empleado> subordinados;

    public Directivo(String nombre, Integer edad, Double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
        this.subordinados = new TreeSet<Empleado>();
    }

    public Directivo(String nombre, Integer edad, Double sueldoBruto) {
        this(nombre, edad, sueldoBruto, CATEGORIA_DEFAULT);
    }

    public Directivo(String nombre, Integer edad, String categoria) {
        this(nombre, edad, SALARIO_MINIMO, categoria);
    }

    public Directivo(String nombre, Integer edad) {
        this(nombre, edad, CATEGORIA_DEFAULT);
    }

    public String getCategoria() {
        return categoria;
    }

    public Set<Empleado> getSubordinados() {
        return subordinados;
    }

    @Override
    public void mostrar() {
        System.out.printf("El directivo %s tiene %d años y su sueldo es de $ %,.2f y su categoria es %s",
                getNombre(), getEdad(), getSueldoBruto(), categoria);

        // System.out.print(" y sus subordinados son: ");
        // var agregarComa = false;
        // for (var empleado : subordinados) {
        // if(agregarComa) {
        // System.out.print(", ");
        // }
        // System.out.print(empleado.getNombre());
        // agregarComa = true;
        // }
        // System.out.println();
        System.out.println(" y sus subordinados son: " +
                subordinados.stream()
                        .filter(empleado -> empleado.getSueldoBruto() > SALARIO_MINIMO)
                        .map(empleado -> empleado.getNombre())
                        .reduce((a, b) -> a + ", " + b)
                        .orElse("Sin subordinados"));
    }
}
