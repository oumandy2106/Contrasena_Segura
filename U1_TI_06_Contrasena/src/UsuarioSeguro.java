public class UsuarioSeguro{
    private String nombreUsuario;
    private String password;
    private boolean letraMayuscula = false;
    private boolean letraMinuscula =false;
    private boolean numero = false;
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
    public void pruebAscii(){
        for (int i = 0; i < password.length(); i++) {
        char ascii = password.charAt(i);
        if (ascii >= 65 && ascii <= 90) {
            letraMayuscula = true;
        } else if (ascii >= 97 && ascii <= 122) {
            letraMinuscula = true;
        } else if (ascii >= 48 && ascii <= 57) {
            numero = true;
        }
        }
        if (letraMayuscula && letraMinuscula && numero) {
            System.out.println("Password segura. Login completo ");
        } else{
            System.out.println("Password insegura. Login completo ");
        }
    }


    }


