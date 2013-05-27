package core.tdl;

import java.util.ArrayList;
import java.util.List;

public final class Estoque {

	private List<Flor> listaFlores = new ArrayList<Flor>();

	private static final Estoque instancia = new Estoque();

	private Estoque() {
	}

	public static synchronized Estoque getInstancia(){
		return instancia;
	}
	
	public List<Flor> getListaFlores() {
		return listaFlores;
	}

	public void setListaFlores(List<Flor> listaFlores) {
		this.listaFlores = listaFlores;
	}

	public void cadastrarFlor(Flor flor) {
		this.getListaFlores().add(flor);
	}

	public List<Flor> buscar(Esp espProcurada) {
		List<Flor> flores = new ArrayList<Flor>();
		for (Flor florElement : this.getListaFlores()) {
			if (florElement.getEspecificacao().comparar(espProcurada)) {
				flores.add(florElement);
			}
		}
		return flores;
	}
}
