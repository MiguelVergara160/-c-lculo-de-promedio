public class estudiante extends persona {
    private double promedio;

    public estudiante(String nombre, String email, double promedio) {
        super(nombre, email);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }
}