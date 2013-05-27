package model.core.others;

import java.util.LinkedList;
import java.util.List;

import model.exceptions.PilhaException;

	public class Pilha {
		private List<Long> itens;
		private Long ultimoItemRemovido;
		private Pilha instance;

		public Pilha() {
			this.itens = new LinkedList<Long>();
		}

		public Pilha getInstance() {
			if (this.instance == null) {
				this.instance = new Pilha();
				return this.instance;
			}
			return this.instance;
		}

		public void adicionarItem(Long item) {
			this.itens.add(item); }

		public List<Long> getItens() {
			return itens; }

		public void removeItem() throws PilhaException {
			try {
				this.ultimoItemRemovido = this.itens.get(this.itens.size()-1);
				this.itens.remove(this.ultimoItemRemovido);
			} catch (Exception e) {
				throw new PilhaException("Pilha está vazia");
			}
		}

		public Long getUltimoItemResumido() {
			return this.ultimoItemRemovido; }
	}
