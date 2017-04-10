
public class BancoProxy implements Banco {
	
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			BancoUsuarios bancoUsuarios = new BancoUsuarios();
			return bancoUsuarios.getNumeroDeUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			BancoUsuarios bancoUsuarios = new BancoUsuarios();
			return bancoUsuarios.getUsuariosConectados();
		}
		return null;
	}
	
	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha =="admin";
	}

}
