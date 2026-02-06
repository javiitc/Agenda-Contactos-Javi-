public class Metodos {

    public void mostrarContactos (String contactos[]) {
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

    
}
