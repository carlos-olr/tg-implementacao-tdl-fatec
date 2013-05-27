package core.tdl;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Flor> listaFlores = new ArrayList<Flor>();

	private static Estoque instancia;

	private Estoque() {
	}

	public static Estoque getInstancia(){
		if (instancia == null) {
			instancia = new Estoque();
		}
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
