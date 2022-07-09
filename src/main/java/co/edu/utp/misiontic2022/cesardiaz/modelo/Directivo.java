package co.edu.utp.misiontic2022.cesardiaz.modelo;

public class Directivo extends Empleado {
    public static final String CATEGORIA_DEFAULT = "Sin Categoria";

    public String categoria;

    public Empleado[] subordinados;

    public Directivo(String nombre, Integer edad, Double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
        this.subordinados = new Empleado[10];
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

    @Override
    public void mostrar() {
        System.out.printf("El directivo %s tiene %d años y su sueldo es de $ %,.2f y su categoria es %s %n",
                nombre, edad, sueldoBruto, categoria);
    }
}
