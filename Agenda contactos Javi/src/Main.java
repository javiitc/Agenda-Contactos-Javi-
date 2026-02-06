import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Metodos metodo = new Metodos();
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
                    metodo.mostrarContactos(contactos, numeroContactos);
                    break;

                case 2:
                    metodo.agregarContacto(sc, contactos, posicionContacto, numeroContactos);
                    break;

                case 3:
                    metodo.editarContacto(contactos, numeroContactos, sc);
                    break;

                case 4:
                    metodo.buscarContacto(contactos, numeroContactos, sc);
                    break;
                case 5:
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