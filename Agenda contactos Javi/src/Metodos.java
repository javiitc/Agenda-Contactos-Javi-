import java.util.Scanner;

public class Metodos {

    public void mostrarContactos (String contactos[], int numeroContactos []) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[0] == null) {
                System.out.println("No tienes contactos guardados, añade minimo uno para mostrar los contactos");
                break;
            } else if (contactos[i] == null) {
                break;
            } else {
                System.out.println((i + 1) + "." + contactos[i] + ": " + numeroContactos[i]);
            }
        }
    }

    public void agregarContacto (Scanner sc, String contactos [], int posicionContacto, int numeroContactos []) {
        System.out.println("Añade nombre y numero de telefono");
        System.out.println("-----------------------------------");
        contactos[posicionContacto] = sc.next();
        numeroContactos[posicionContacto] = sc.nextInt();
        System.out.println("Nuevo contacto guardado");
        System.out.println(contactos[posicionContacto]);
        System.out.println("Numero: " + numeroContactos[posicionContacto]);
        posicionContacto++;
    }

    public void editarContacto () {

    }
}
