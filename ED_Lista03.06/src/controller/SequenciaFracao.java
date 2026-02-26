package controller;

public class SequenciaFracao {

	public SequenciaFracao() {
		super();
	}
	
	public double sequencia(int limite) {
		
		// A condição de para é definida quando a recursiva decrementar o número recebido
		// "limite" e chegar em 1, que é o final da sequência, assim retornado 1 para a soma
		if(limite==1) return 1;
		
		// Esta função recursiva chama uma segunda denominada "fatorial"
		return sequencia(limite-1)+1.0/fatorial(limite);
	}
	
	public int fatorial(int limiteFat) {
		
		// A condição de parada de um fatorial é quando o limite(limiteFat) decrementado
		// chegue em 1, assim retornando 1 para a sequência de produto.
		if(limiteFat==1) return 1;
		
		return limiteFat*fatorial(limiteFat-1);
	}

}
