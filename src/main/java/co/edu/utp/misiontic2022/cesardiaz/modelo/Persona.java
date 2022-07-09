package co.edu.utp.misiontic2022.cesardiaz.modelo;

public abstract class Persona {
    public String nombre;
    public Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrar();
}
