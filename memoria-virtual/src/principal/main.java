package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import fila.Fila;

/**
 * 
 * Simulação Memória Virtual - Trabalho 2
 * 
 * @author Bruno Victor && Mateus Filipe
 *
 */

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
			int tam = 0; // o tamanho total da fila de respostas
			int nLinhas = 0; // quantidade de acessos que serão feitos à memória
			int copias = 0; // quantidade de copias feitas da memória virtual para memoria real
			//Armazenando os valores de m, n e p da primeira linha do arquivo
			m = Integer.parseInt(primeiraLinha[0]);
			n = Integer.parseInt(primeiraLinha[1]);
			p = Integer.parseInt(primeiraLinha[2]);
			tam = n/p;
			
			//Fila para armazenar os valores;	
			Fila fila = new Fila();
	        nLinhas = Integer.parseInt(lerArq.readLine());//Salvando a quantidade de acessos
			int []vetProcessos = new int[nLinhas]; //Vetor com todos os processos;
	        
			linha = lerArq.readLine(); //Pulando a primeira linha nula do arquivo devido ao .split
			
	        for(int i = 0; i < nLinhas; i++) {
                int aux = 0;
                aux = Integer.parseInt(linha);
                vetProcessos[i] = (aux/p);
                if(i<tam)
                    fila.Inserir(aux/p);
                linha = lerArq.readLine();

            }
	        arq.close();
			lerArq.close();

	        for(int i = tam; i < nLinhas; i++) {
	        	if(!fila.HasElement(vetProcessos[i])) { // Verificando se tem o valor para executar ou não a troca
	        		fila.Inserir(vetProcessos[i]); // Inserido valor mais novo na fila;
	        		fila.Remover(); // Removendo o valor mais antigo da fila
	        		copias++; // Contabilizando trocas feitas 
	        	}
	        }
	        		
			int []vetOrdenado = new int [tam];
			for(int i = 0; i < tam ; i++) {
				vetOrdenado[i] = fila.Remover();
			}
			
			Arrays.sort(vetOrdenado);//Ordenando o vetor com os processos
			
			FileWriter fw = new FileWriter( "saida.txt" );
			BufferedWriter bw = new BufferedWriter( fw );
			bw.write(copias+"");
			bw.newLine();
			for(int i = 0 ; i < tam ; i++) {
				bw.write(vetOrdenado[i]+" ");
			}
			bw.close();
			fw.close();

			
		}
		catch(IOException e) {
			System.err.printf("Não foi possível abrir o arquivo.\n"+e.getMessage());
		}
      
    }
}
