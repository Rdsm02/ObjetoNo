package classeNo;

public class Lista {

	private No cabeca_lista;
	private No fim_lista;
	public Lista(){
		cabeca_lista = null;
	}
	
	public void insere_inicio(int conteudo){
		No novo_no = new No(conteudo);
		
		if(cabeca_lista == null){
			cabeca_lista = novo_no;
			
		}else{
			novo_no.prox = cabeca_lista;
			cabeca_lista = novo_no;
			
		}
	}
	
	public String listar(){
		No aux;
		
		aux = cabeca_lista;
		String lista_String = null;
		
		while(aux != null){
			lista_String = lista_String + "_" + aux.info;
			aux = aux.prox;			
		}if(lista_String == null){
			lista_String = "Lista Vazia";
		}
		return lista_String;
		
		}
	
	public void insere_final(int conteudo){		
		No novo_no = new No(conteudo);
		if(cabeca_lista == null){
			cabeca_lista = novo_no;
		}else{
		No aux;
		aux = cabeca_lista;
		
		while(aux.prox != null){
			aux = aux.prox;
		}
		aux.prox = novo_no;
		}
		
	}
}
