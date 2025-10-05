package Som;

//adaptee
public class PagamentoPayPal{
	public void realizarPagamento(double quantia) {
		System.out.println("realizando o pagamento via paypal no valor:" +quantia);
	}
}
