package pilha;

public class Bloco {
    int valor;
    Bloco prox;
    
    public Bloco(int valorInicial){
        this.valor = valorInicial;
        this.prox = null;
    }
}