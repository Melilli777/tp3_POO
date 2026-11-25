package ejercicio3;

public class Audiolibro extends MaterialDigital {

    public Audiolibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("titulo: " + getTitulo() + "  se puede escuchar");
    }
}