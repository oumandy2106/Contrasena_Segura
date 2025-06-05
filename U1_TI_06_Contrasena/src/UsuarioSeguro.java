public class UsuarioSeguro{
    private String nombreUsuario;
    private String password;
    private boolean letraMayuscula;
    private char ascii;

    public boolean isLetraMayuscula() {
        return letraMayuscula;
    }

    public void setLetraMayuscula(boolean letraMayuscula) {
        this.letraMayuscula = letraMayuscula;
    }


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
    public boolean pruebAscii(){
        for (int i = 0; i < password.length(); i++) {
        char ascii = password.charAt(i);
        if (ascii >= 65 && ascii <= 90) {

        }

        }
        return (int) ascii;
    }


    }


