package Som;


//Client
public class PagamentoCartaoCredito implements Pagamento_Interface {
	public void pagarComCartao(double valor) {
		
		
	}

	@Override
	public void pagar(double valor) {
		System.out.println("realizando o pagamento do cartao de credito no valor de " +valor);
		
	}
}
