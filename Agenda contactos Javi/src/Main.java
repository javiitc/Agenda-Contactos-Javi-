import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String [] contactos = new String[100];
        int [] numeroContactos = new int[100];
        int posicionContacto = 0;
        boolean salir = true;
        int seleccion;
        int seleccion2;

        while (salir) {
            System.out.println("Elija la opción que desea realizar");
            System.out.println("1. Contactos");
            System.out.println("2. Nuevo contacto");
            System.out.println("3. Lista de contactos");
            System.out.println("4. Modificar contacto");
            System.out.println("3. Salir del menú");

            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Seleccione contacto");
                    System.out.println("Mamá");
                    System.out.println("Papá");
                    System.out.println("Jordi");
                    System.out.println("Meddy");
                    break;

                case 2:
                    System.out.println("Añade nombre y numero de telefono");
                    contactos[posicionContacto] = sc.next();
                    numeroContactos[posicionContacto] = sc.nextInt();
                    System.out.println("Nuevo contacto guardado");
                    System.out.println(contactos[posicionContacto]);
                    System.out.println("Numero: " + numeroContactos[posicionContacto]);
                    posicionContacto++;
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    break;

                case 5:
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