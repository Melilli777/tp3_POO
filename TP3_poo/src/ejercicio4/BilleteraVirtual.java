package ejercicio4;

public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Billetera Virtual Titular: " + getTitular()
                    + " aplicacion: " + nombreAplicacion
                    + " monto:" + monto);
            System.out.println("Pago procesado.");
        } else {
            System.out.println("No puede ser negativo");
        }
    }
}
