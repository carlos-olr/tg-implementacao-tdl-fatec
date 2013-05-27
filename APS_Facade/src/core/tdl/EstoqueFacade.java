package core.tdl;

import java.util.ArrayList;
import java.util.List;

public class EstoqueFacade {

	public List<Flor> buscarFlores(String tipo, String cor) {
		List<Flor> encontradas = new ArrayList<Flor>();
		if (this.validarArgumentos(tipo, cor)) {
			Esp especificacao = new Esp();
			especificacao.setCor(cor);
			especificacao.setTipo(tipo);
			Estoque estoque = Estoque.getInstancia();
			encontradas = estoque.buscar(especificacao);
		}
		return encontradas;
	}

	public Flor cadastrarFlor(String tipo, String cor, double preco) {
		if (this.validarArgumentos(tipo, cor, preco)) {
			Estoque estoque = Estoque.getInstancia();
			Flor flor = new Flor(String.valueOf(estoque.getListaFlores().size()),preco,new Esp(cor,tipo));
			estoque.cadastrarFlor(flor);
			return flor;
		}
		return null;
	}

	private boolean validarArgumentos(String tipo, String cor, double preco) {
		if (tipo == null || tipo.isEmpty()) {
			return false;
		}
		if (cor == null || cor.isEmpty()) {
			return false;
		}
		if (preco <= 0) {
			return false;
		}
		return true;
	}

	private boolean validarArgumentos(String tipo, String cor) {
		if (tipo == null || tipo.isEmpty()) {
			return false;
		}
		if (cor == null || cor.isEmpty()) {
			return false;
		}
		return true;
	}

}
