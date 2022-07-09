package co.edu.utp.misiontic2022.cesardiaz.modelo;

public class Cliente extends Persona {

    public String telefono;

    public Cliente(String nombre, Integer edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    @Override
    public void mostrar() {
        System.out.printf("El cliente %s tiene %d años y su teléfono es %s %n",
                nombre, edad, telefono);
    }
    
}
