package co.edu.utp.misiontic2022.cesardiaz.modelo;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;

    private Set<Empleado> empleados;
    private Set<Cliente> clientes;

    public Empresa(String nombre, Set<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;

        this.clientes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);

        // var pos = clientes.indexOf(cliente);
        // if (pos == -1) {
        //     System.err.println("El cliente no existe");
        //     return;
        // }

        // clientes.remove(pos);
    }

    public void mostrar() {
        System.out.printf("La empresa %s tiene los siguientes empleados: %n", nombre);
        // for (var empleado : empleados) {
        //     empleado.mostrar();
        // }
        empleados.forEach(empleado -> empleado.mostrar());

        System.out.println("Y tiene los siguientes clientes:");
        clientes.forEach(cliente -> {
            if( cliente == null) {
                return;
            }
            cliente.mostrar();
        });
        // for (var cliente : clientes) {
        //     if (cliente == null) {
        //         break;
        //     }
        //     cliente.mostrar();
        // }
    }

}
