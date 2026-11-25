package ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Tarjeta t = new Tarjeta("Ana Pérez", "1234");
	        BilleteraVirtual b = new BilleteraVirtual("Luis Gómez", "Mercado Pago");

	        t.procesarPago(1500.50);
	        b.procesarPago(800);
	        b.procesarPago(-50); 
	}

}
