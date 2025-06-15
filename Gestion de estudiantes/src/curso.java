public class curso {
    private String codigo;
    private String nombre;
    private estudiante[] inscritos;

    public curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new estudiante[capacidad];
    }

    public boolean inscribir(estudiante e) {
        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] == null) {
                inscritos[i] = e;
                return true;
            }
        }
        return false;
    }

    public double calcularPromedioGrupo() {
        double suma = 0;
        int cantidad = 0;

        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] != null) {
                suma += inscritos[i].getPromedio();
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }
        return suma / cantidad;
    }
}