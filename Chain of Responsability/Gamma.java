
public class Gamma extends FilterOp {
	
	public Gamma(Double gamma) {
		super();
	}
	
	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("Gamma");
	}

}
