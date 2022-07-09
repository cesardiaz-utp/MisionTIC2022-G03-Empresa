package co.edu.utp.misiontic2022.cesardiaz.modelo;

public class Empresa {
    private String nombre;

    private Empleado[] empleados;
    private Cliente[] clientes;
    private Integer numClientes;

    public Empresa(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;

        this.clientes = new Cliente[100];
        this.numClientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Cliente cliente){
        clientes[numClientes] = cliente;
        numClientes++;
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
