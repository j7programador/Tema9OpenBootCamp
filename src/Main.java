

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad  = 45;
        cliente.nombre = "Mario";
        cliente.telefono = "41234";
        cliente.credito = 421341234;

        trabajador.edad = 23;
        trabajador.nombre = "Fabio";
        trabajador.telefono = "2341234";
        trabajador.credito = 341234;
        trabajador.salario = 341234;


        System.out.printf("El cliente %s tiene una edad de %s, %nsu telefono " +
                "es el %s y tiene un credito por %s", cliente.nombre, cliente.edad, cliente.telefono, cliente.credito);
        System.out.printf("El trabajador %s tiene una edad de %s, %nsu telefono " +
                "es el %s, tiene un credito por %s y un salario de %s", trabajador.nombre, trabajador.edad, trabajador.telefono, trabajador.credito,
                trabajador.salario);

    }
}

class Persona {

    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {

    int credito;
}
class Trabajador extends Cliente {
    int salario;
}
