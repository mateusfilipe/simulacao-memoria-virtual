package fila;

public class Fila implements FilaTAD {

	Node inicio;
	Node fim;
	int n;

	public Fila() {

	}

	public boolean isEmpty() {
		return inicio == null && fim == null;
	}
	
	public void Inserir(int e) {
		Node novo = new Node(e);
		if (isEmpty()) {
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		} else {
			novo.prox = inicio;
			fim.prox = novo;
			fim = novo;
		}
	}

	public int Remover() {
		int aux = inicio.valor;
		inicio = inicio.prox;
		if(isEmpty()) fim = null;
		return aux;
	}

	public void Esvaziar() {
		while (!isEmpty()) {
			Remover();
		}
	}

	public String Imprimir() {
		String listados = "";
		if (isEmpty()) {
			return "Fila vazia";
		} else if (inicio == fim) {
			listados = listados + inicio.valor;
		} else {
			Node aux = inicio;
			if (aux == fim.prox) {
				listados = listados + aux.valor + "\n";
				aux = aux.prox;
			}
			while (aux != fim.prox) {
				listados = listados + aux.valor + "\n";
				aux = aux.prox;
			}
		}

		return listados;

	}

	public boolean HasElement(int e) {
		boolean tem = false;
		Node aux = inicio;
		while (aux != fim.prox) {
			if (aux.valor == e) {
				tem = true;
			}
			aux = aux.prox;
		}
		return tem;
	}

}
