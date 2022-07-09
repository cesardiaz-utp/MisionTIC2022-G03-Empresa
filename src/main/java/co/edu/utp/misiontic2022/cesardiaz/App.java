package co.edu.utp.misiontic2022.cesardiaz;

import co.edu.utp.misiontic2022.cesardiaz.modelo.Cliente;
import co.edu.utp.misiontic2022.cesardiaz.modelo.Directivo;
import co.edu.utp.misiontic2022.cesardiaz.modelo.Empleado;
import co.edu.utp.misiontic2022.cesardiaz.modelo.Empresa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var cesar = new Empleado("Cesar Diaz", 42, 3_000_000d);
        var andres = new Empleado("Andres Londoño", 35);
        var carlos = new Directivo("Carlos Joven", 28);
        var empleados = new Empleado[]{ cesar, andres, carlos };

        var laura = new Cliente("Laura Pacheco", 23, "3105551234");
        var rafael = new Cliente("Rafael Londoño", 33, "3105554321");

        var empresa = new Empresa("Grupo 03", empleados);
        empresa.clientes[0] = laura;
        empresa.clientes[1] = rafael;

        // Imprimir datos
        empresa.mostrar();

    }
}
