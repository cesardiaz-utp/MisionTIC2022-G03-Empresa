package co.edu.utp.misiontic2022.cesardiaz.modelo;

public class Cliente extends Persona {

    private String telefono;

    public Cliente(String nombre, Integer edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            return;
        }
        this.telefono = telefono;
    }

    @Override
    public void mostrar() {
        System.out.printf("El cliente %s tiene %d años y su teléfono es %s %n",
                getNombre(), getEdad(), telefono);
    }

}
