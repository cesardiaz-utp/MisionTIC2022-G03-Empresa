package co.edu.utp.misiontic2022.cesardiaz.modelo;

public class Empresa {
    public String nombre;

    public Empleado[] empleados;
    public Cliente[] clientes;

    public Empresa(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = new Cliente[100];
    }

    public void mostrar() {
        System.out.printf("La empresa %s tiene los siguientes empleados: %n", nombre);
        for (var empleado : empleados) {
            empleado.mostrar();
        }

        System.out.println("Y tiene los siguientes clientes:");
        for (var cliente : clientes) {
            if (cliente == null) {
                break;
            }
            cliente.mostrar();
        }
    }

}
