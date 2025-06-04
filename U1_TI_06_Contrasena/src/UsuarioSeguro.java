public class UsuarioSeguro{
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        for (int i = 0; i< nombreUsuario.lenght(); i++){
        }
        if (i<1){
            System.out.println("Nombre de usuario no valido. Ingrese mas caracteres");
        }
    }
    public void setPassword(String password) {
        this.password = password;
        for (int i = 0; i< password.lenght(); i++){
        }
        if (i<8){
            System.out.println("Contraseña corta. Ingrese minimo 8 caracteres.");
        }
    }
    public boolean autenticar(String usuario, String contrasena){
    }
}
