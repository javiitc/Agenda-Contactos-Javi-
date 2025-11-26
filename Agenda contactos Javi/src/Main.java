import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String [] contactos = new String[100];
        int [] numeroContactos = new int[100];
        int posicionContacto = 0;
        int seleccionContacto;
        int modificar;
        boolean salir = true;
        int seleccion;
        int seleccion2;

        while (salir) {
            System.out.println("Elija la opción que desea realizar");
            System.out.println("1. Lista de contactos");
            System.out.println("2. Nuevo contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Salir del menú");

            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:

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
                    break;

                case 2:

                    System.out.println("Añade nombre y numero de telefono");
                    System.out.println("-----------------------------------");
                    contactos[posicionContacto] = sc.next();
                    numeroContactos[posicionContacto] = sc.nextInt();
                    System.out.println("Nuevo contacto guardado");
                    System.out.println(contactos[posicionContacto]);
                    System.out.println("Numero: " + numeroContactos[posicionContacto]);
                    posicionContacto++;
                    break;

                case 3:
                    System.out.println("Selecciona el contacto que quieres editar");
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < contactos.length; i++) {
                        if (contactos[0] == null) {
                            System.out.println("No tienes contactos guardados, añade minimo uno para mostrar los contactos");
                            break;
                        } else if (contactos[i] == null) {
                            break;
                        } else {
                            System.out.println((i + 1) + "." + contactos[i] + ": " + numeroContactos [i]);
                        }

                    }

                    seleccionContacto = sc.nextInt();

                    System.out.println("Que deseas modificar de " + contactos[seleccionContacto - 1] + "?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Numero de Telefono");
                    modificar = sc.nextInt();
                    switch (modificar) {
                        case 1:

                            System.out.println("Introduce el nuevo nombre para guardar el contacto: ");
                            contactos [seleccionContacto - 1] = sc.next();
                            break;
                        case 2:

                            System.out.println("Introduce el nuevo numero de telefono: ");
                            numeroContactos [seleccionContacto -1 ] = sc.nextInt();
                            break;
                }
                    break;

                case 4:
                    System.exit(0);
                    break;
            }

            System.out.println("Realizar otra operacion ?");
            System.out.println("1. SI 2. NO");
            seleccion2 = sc.nextInt();
            if (seleccion2 == 2) {
                salir = false;
                System.out.println("Hasta otra!");
            }
        }
    }
}