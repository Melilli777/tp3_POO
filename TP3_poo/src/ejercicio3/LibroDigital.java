package ejercicio3;

public class LibroDigital extends MaterialDigital {

    public LibroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("titulo: " + getTitulo() + "  Se puede leer en pantalla");
    }
}
