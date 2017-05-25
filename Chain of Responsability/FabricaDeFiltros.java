
public class FabricaDeFiltros {
	public FilterOp gotham(){
		FilterOp f = new Modulate(120,10,100);
		f.nextOp(new Fill("#222b6d"))
			.nextOp(new Colorize(20))
			.nextOp(new Gamma(0.5))
			.nextOp(new Contrast());
		return f;	
	}
}
