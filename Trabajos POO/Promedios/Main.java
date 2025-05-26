public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre("Estudiante " + (i + 1));
            estudiantes[i].setMatricula("MAT" + (1000 + i));

            estudiantes[i].setNota(0, 60 + i * 2);
            estudiantes[i].setNota(1, 65 + i * 3);
            estudiantes[i].setNota(2, 70 + i * 4);
            estudiantes[i].setNota(3, 75 + i * 1);
            estudiantes[i].setNota(4, 80 + i * 2);
        }

        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Promedio: " + estudiante.calcularPromedio());
            System.out.println("Aprobado: " + (estudiante.aprobado() ? "Sí" : "No"));
            System.out.println();
        }
    }
}