package model;

public class UsuarioSeguro{
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario){
        if (nombreUsuario != null && !nombreUsuario.trim().isEmpty()){
            this.nombreUsuario = nombreUsuario;
        } else {
            System.out.println("El nombre del usuario no puede estar vacio ni ser nulo.");
        }
    }
    public void setPassword(String password) {
        if (password.length() < 8){
            System.out.println("La contraseña debe tener mas de 8 caracteres.");
            return;
        }
        boolean Mayuscula = false;
        boolean Minuscula = false;
        boolean Digito = false;

        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)) Mayuscula = true;
            if (Character.isLowerCase(c)) Minuscula = true;
            if (Character.isDigit(c)) Digito = true;
        }

        if (!Mayuscula){
            System.out.println("La contraseña debe tener mas de una letra mayuscula.");
            return;
        }
        if (!Minuscula){
            System.out.println("La contraseña debe tener mas de una letra minuscula.");
            return;
        }
        if (!Digito){
            System.out.println("La contraseña debe tener mas de un digito");
            return;
        }

        this.password = password;
    }
    public boolean autenticar(String intentPassword) {
        return password != null && password.equals(intentPassword);
    }
    public boolean estaInicializando() {
        return nombreUsuario != null && password != null;
    }
}