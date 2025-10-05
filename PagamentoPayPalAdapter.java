package Som;


//adaptador adapter
public class PagamentoPayPalAdapter implements Pagamento_Interface {
	private PagamentoPayPal incompativel;
	
	
	public PagamentoPayPalAdapter(PagamentoPayPal pagamentoincopativel) {
		super();
		this.incompativel = pagamentoincopativel;
	}



	@Override
	//aqui onde ocorre a adaptacao!
	public void pagar(double valor) {
		incompativel.realizarPagamento(valor);
		
	}

}
