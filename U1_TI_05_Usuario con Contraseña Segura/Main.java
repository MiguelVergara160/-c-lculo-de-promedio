import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UsuarioSeguro user = new UsuarioSeguro();

        System.out.print("Escribe tu nombre de usuario: ");
        String nombre = sc.nextLine();
        user.setNombreUsuario(nombre);

        System.out.print("Escribe tu contraseña: ");
        String pass = sc.nextLine();
        user.setPassword(pass);

        if (!user.estaListo()) {
            System.out.println("No se pudo crear el usuario correctamente.");
            sc.close();
            return;
        }

        System.out.println("\nProbando contraseñas incorrectas:");

        user.setPassword("123");             
        user.setPassword("abcdefgh");       
        user.setPassword("ABCDEFGH");        
        user.setPassword("Abcdefgh");        

        System.out.println("\nProbando autenticación:");

        System.out.print("Ingresa la contraseña correcta: ");
        String intento1 = sc.nextLine();
        if (user.autenticar(intento1)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        System.out.print("Ingresa una contraseña incorrecta: ");
        String intento2 = sc.nextLine();
        if (user.autenticar(intento2)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        sc.close();
    }
}