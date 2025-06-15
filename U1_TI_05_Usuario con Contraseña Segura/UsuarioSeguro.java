public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombre) {
        if (nombre != null && !nombre.equals("")) {
            nombreUsuario = nombre;
        }
    }

    public void setPassword(String pass) {
        if (pass == null) {
            System.out.println("La contraseña no puede ser nula.");
            return;
        }
        if (pass.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }
        boolean tieneMayus = false;
        boolean tieneMinus = false;
        boolean tieneDigito = false;
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (c >= 'A' && c <= 'Z') tieneMayus = true;
            else if (c >= 'a' && c <= 'z') tieneMinus = true;
            else if (c >= '0' && c <= '9') tieneDigito = true;
        }
        if (!tieneMayus) {
            System.out.println("La contraseña debe tener al menos una letra mayuscula.");
            return;
        }
        if (!tieneMinus) {
            System.out.println("La contraseña debe tener al menos una letra minuscula.");
            return;
        }
        if (!tieneDigito) {
            System.out.println("La contraseña debe tener por lo menos un digito.");
            return;
        }
         password = pass;
    }

    public boolean autenticar(String intento) {
        if (password == null) return false;
        return password.equals(intento);
    }
     public boolean estaListo() {
        return nombreUsuario != null && password != null;
    } 
}
    