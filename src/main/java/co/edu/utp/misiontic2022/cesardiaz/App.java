package co.edu.utp.misiontic2022.cesardiaz;

import java.util.HashSet;

import co.edu.utp.misiontic2022.cesardiaz.excepciones.SueldoErroneoException;
import co.edu.utp.misiontic2022.cesardiaz.excepciones.TelefonoErroneoException;
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
        var cesar = new Empleado("Cesar Diaz", 42, 3_007_000d);
        var andres = new Empleado("Andres Londoño", 35);
        var carlos = new Directivo("Carlos Joven", 28, 1100000d);
        var ivonne = new Directivo("Ivonne Natalhy", 27, "Jefe de personal");
        var jhon = new Empleado("Jhon Gomez", 23, 3_000_000d);
        var empleados = new HashSet<Empleado>();
        empleados.add(cesar);
        empleados.add(andres);
        empleados.add(carlos);
        empleados.add(ivonne);
        empleados.add(jhon);

        carlos.getSubordinados().add(jhon);
        carlos.getSubordinados().add(cesar);
        carlos.getSubordinados().add(andres);

        ivonne.getSubordinados().add(carlos);

        // var empleados = new Empleado[]{ cesar, andres, carlos };

        var laura = new Cliente("Laura Pacheco", 23, "6015551234 ext 301");
        var rafael = new Cliente("Rafael Londoño", 33, "3105554321");

        var empresa = new Empresa("Grupo 03", empleados);
        empresa.agregarCliente(laura);
        empresa.agregarCliente(rafael);

        try {
            cesar.setSueldoBruto(5_001_000d);
        } catch (SueldoErroneoException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            laura.setTelefono("5551111");
        } catch (TelefonoErroneoException ex) {
            System.err.println("El telefono no puede ser vacío");
        }

        // Imprimir datos
        empresa.mostrar();

    }
}
