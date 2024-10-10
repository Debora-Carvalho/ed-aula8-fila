package aula8Fila;

public class Fila {
	private int tamanho;
	private No inicio;
	private No fim;
	
	public boolean estaVazia() {    //esse atributo nao precisa receber nada, pois recebe o tamanho da propria classe
		return tamanho == 0;
	}
	
	public Object inicio() {
		if(estaVazia()) {     //sempre verificar se a fila é nula antes de acessar o atributo
			return null;
		} 
		return inicio.info;
	}
	
	public void enfileirar(Object info) {
		No no = new No(info);
		if(estaVazia()) {        
			inicio = no;
		} else {
			fim.prox = no;    //se estiver vazia, o mesmo "no" será o inicio e o fim
		}
		fim = no;                  
		tamanho++;
	}
	
	public Object desenfileirar() {
		if(estaVazia()) {     //verificar se a fila está nula
			return null;
		} 
		Object info = inicio.info;
		fim = inicio.prox;
		tamanho--;
		return info;
	}
	
}
