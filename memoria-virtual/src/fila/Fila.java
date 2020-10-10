package fila;

public class Fila implements FilaTAD {
	
	Node inicio;
	Node fim;
	int n;
	
	public Fila() {
		
	}
	
	public boolean isEmpty()
	{
		return inicio == null && fim == null;
	}
	
	public void Inserir(int e) 
	{
		Node novo = new Node(e);
		if(isEmpty()) {
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		}else {
			novo.prox = inicio;
			fim.prox = novo;
			fim = novo;
		}
	}
	
	public int Remover() 
	{
		int removido = 0;
		if(isEmpty()) {
			removido = -1;
		}else if(inicio == fim) {
			removido = inicio.valor;
			inicio = null;
			fim = null;
		}else {
			removido = inicio.valor;
			fim = inicio;
			inicio = inicio.prox;
			fim.prox = inicio;
		}
		
		return removido;
		
	}
	
	public void Esvaziar() 
	{
		while(!isEmpty()) {
			Remover();
		}	
	}
	
	public String Imprimir() 
	{
		String listados = "";
		if(isEmpty()) {
			return "Fila vazia";
		}else if(inicio == fim) {
			listados = listados + inicio.valor;
		}else {
			Node aux = inicio;
			if(aux == fim.prox) {
				listados = listados + aux.valor + "\n";
				aux = aux.prox;
			}
			while(aux != fim.prox) {
				listados = listados + aux.valor + "\n";
				aux = aux.prox;
			}
		}
		
		return listados;
		
	}
	
}
