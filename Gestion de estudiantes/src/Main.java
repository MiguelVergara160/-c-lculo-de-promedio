public class Main {
    public static void main(String[] args) {
        curso cursoJava = new curso("JSD083", "Introducción a Java", 3);


        estudiante est1 = new estudiante("Juana", "juana@mail.com", 8.3);
        estudiante est2 = new estudiante("Luis", "luis@mail.com", 9.6);
        estudiante est3 = new estudiante("Sofia", "sofia@mail.com", 7.8);


        cursoJava.inscribir(est1);
        cursoJava.inscribir(est2);
        cursoJava.inscribir(est3);


        double promedioGrupo = cursoJava.calcularPromedioGrupo();
        System.out.println("Promedio del grupo: " + promedioGrupo);
    }
}