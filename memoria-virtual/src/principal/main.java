package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import fila.Fila;
import pilha.Pilha;

public class main {
	public static void main(String[] args) throws IOException {
		try {
			FileReader arq = new FileReader("teste.txt");
    		BufferedReader lerArq = new BufferedReader(arq);
    		String linha = "";
			  
			String[] primeiraLinha = (lerArq.readLine()).split(" "); // Salvando a primeira linha em uma string sem espaco
			int m = 0; //o tamanho em bytes da memória virtual
			int n = 0; //o tamanho em bytes da memória física 
			int p = 0; // o tamanho em bytes da página/moldura
			int nLinhas = 0; //quantidade de acessos que serão feitos à memória
			//Armazenando os valores de m, n e p da primeira linha do arquivo
			m = Integer.parseInt(primeiraLinha[0]);
			n = Integer.parseInt(primeiraLinha[1]);
			p = Integer.parseInt(primeiraLinha[2]);
			
			System.out.println("m: "+m);
			System.out.println("n: "+n);
			System.out.println("p: "+p);
			
			//TODO
			//Decidir entre Pilha ou Fila		
			Fila conteudoF = new Fila();

	        nLinhas = Integer.parseInt(lerArq.readLine());//Salvando a quantidade de acessos
	        System.out.println("Linhas: "+nLinhas);
	        linha = lerArq.readLine(); //Pulando a primeira linha nula do arquivo devido ao .split
			while(linha != null) {
				int aux = 0;
				aux = Integer.parseInt(linha);
				conteudoF.Inserir(aux);
				linha = lerArq.readLine();
			}
			System.out.println("Endereços de Memória:");
			System.out.println(conteudoF.Imprimir());
		}catch(IOException e) {
			System.err.printf("Não foi possível abrir o arquivo.\n"+e.getMessage());
		}
      
    }
}
