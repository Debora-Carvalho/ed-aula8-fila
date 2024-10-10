package aula8Fila;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");  //operador ternário
		fila.enfileirar("1");
		fila.enfileirar("2");
		fila.enfileirar("3");
		System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");  //operador ternário
		System.out.println("Início: " + fila.inicio());   //o inicio nao desenfileira, apenas exibe a informacao
		
		Object info = fila.desenfileirar();
		while (info != null) {
			System.out.println(info);
			info = fila.desenfileirar();
		}
		
		System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
		System.out.println("Início: " + fila.inicio());
		
		//enfileirando novamente
		System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");  //operador ternário
		fila.enfileirar("4");
		fila.enfileirar("5");
		fila.enfileirar("6");
		System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");  //operador ternário
		System.out.println("Início: " + fila.inicio());   //o inicio nao desenfileira, apenas exibe a informacao
		
		info = fila.desenfileirar();
		while (info != null) {
			System.out.println(info);
			info = fila.desenfileirar();
		}
		
		System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
		System.out.println("Início: " + fila.inicio());
		
	}
	
	//como implementar uma fila de prioridade? O no deverá ter o atributo prioridade
	//o metodo enfileirar será diferente

}
