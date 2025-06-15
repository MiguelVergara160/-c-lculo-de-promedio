public class Main {
    public static void main(String[] args) {
        Empleado empleTiempoCompleto = new EmpleadoTiempoCompleto("8967U", "Juana", 6000, "Seguro Medico");
        Empleado emplePorHoras = new EmpleadoPorHoras("9967U", "Juan", 24, 120);

        System.out.println("Salario Empleado Tiempo Completo: $" + empleTiempoCompleto.calcularSalario());
        System.out.println("Salario Empleado Por Horas: $" + emplePorHoras.calcularSalario());
    }
}