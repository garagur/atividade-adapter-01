package Som;

public class Principal {
	public static void main(String[] args) {
		Pagamento_Interface CartaoCredito = new PagamentoCartaoCredito();
		PagamentoPayPal paypal = new PagamentoPayPal();
		Pagamento_Interface adapter = new PagamentoPayPalAdapter(paypal);
		CartaoCredito.pagar(1000);
		adapter.pagar(5000);


	}

}
