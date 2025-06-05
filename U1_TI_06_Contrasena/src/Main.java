import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Nombre de usuario ");
        String nombreUsuario = sc.nextLine();
        System.out.println("Ingrese su contraseña. Debe tener minimo 8 caracteres, incluyendo caracteres especiales");
        String password = sc.nextLine();
        //instancia
        UsuarioSeguro usuario = new UsuarioSeguro(nombreUsuario, password);
        String devolver = usuario.pruebAscii();
        System.out.println(devolver);
    }
}

