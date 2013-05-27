package model.core;
import java.util.LinkedList;

import model.exceptions.PilhaException;

	public class Pilha {
		private LinkedList<Long> itens;
		private Long ultimoItemRemovido;
		private static Pilha instance;

		private Pilha() {
			this.itens = new LinkedList<Long>();
		}

		public static Pilha getInstance() {
			if (instance == null) {
				instance = new Pilha();
				return instance;
			}
			return instance;
		}

		public void adicionarItem(Long item) {
			this.itens.addLast(item);	}

		public LinkedList<Long> getItens() {
			return itens;	}

		public void removeItem() throws PilhaException {
			try {
				this.ultimoItemRemovido = this.itens.getLast();
				this.itens.removeLast();
			} catch (Exception e) {
				throw new PilhaException("Pilha está vazia");
			}
		}

		public Long getUltimoItemResumido() {
			return this.ultimoItemRemovido;	}
	}
