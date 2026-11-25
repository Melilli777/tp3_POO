package ejercicio4;

public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Tarjeta, Titular: " + getTitular()
                    + " terminada en: " + ultimosCuatroDigitos
                    + " monto: " + monto);
            System.out.println("pago procesado.");
        } else {
            System.out.println("el monto no puede ser negativo");
        }
    }
}