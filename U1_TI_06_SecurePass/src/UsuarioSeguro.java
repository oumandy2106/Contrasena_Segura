public class UsuarioSeguro{
    private String nombreUsuario;
    private String password;

    //metodo
    public UsuarioSeguro(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    //get nombreusuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    //set nombreusuario
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        if (password.length() < 8) {
            System.out.println("Ingrese un nombre de usuario valido");
        } else {
            this.password = password;
        }
    }
    //get password
    public String getPassword() {
        return password;
    }
    //setter password
    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Contraseña corta. Ingrese mínimo 8 caracteres.");
        } else {
            this.password = password;
        }

    }
}

public {

}


