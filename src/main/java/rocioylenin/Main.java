package rocioylenin;

import rocioylenin.Auth.AuthService;
import rocioylenin.User.User;

import java.util.Scanner;

public class Main  extends AuthService {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("        AUTHSECURE - CONTROL DE ACCESOS        ");
        System.out.println("==================================================");
        System.out.println("1. Registrar nuevo usuario");
        System.out.println("2. Iniciar sesion (Autenticación)");
        System.out.println("3. Eliminar cuenta de usuario");
        System.out.println("4. Verificar disponibilidad de Username");
        System.out.println("5. Salir");


        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione una opción del 1 al 5");
        int seleccion = scan.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Registrar un nuevo usuario");

                User user = new User();

                System.out.println("Ingresa tu nombre completo");
                String nombreCompleto = scan.nextLine();

                System.out.println("Ingresa tu nombre de usuario");
                String username = scan.nextLine();

                System.out.println("Ingresa tu correo electronico");
                String correoElectronic = scan.nextLine();

                System.out.println("Ingresa tu contraseña");
                String password = scan.nextLine();

                AuthService auth = new AuthService();

                break;
            case 2:
                System.out.println("Iniciar sesión");
                break;
            case 3:
                System.out.println("Eliminar cuenta");
                break;
            case 4:
                System.out.println("Verificar disponibilidad de username");
                break;
            case 5:
                System.out.println("Hasta pronto!");
        }




    }

}
