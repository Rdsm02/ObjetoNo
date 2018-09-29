package classeNo;

public class ListaDuplamenteEncadeada {

	private No2 cabeca_lista;
	
	public ListaDuplamenteEncadeada(){
		cabeca_lista = null;
	}
	
	public void insere_inicio(int n){
		
		No2 novo_no = new No2(n);
		
		if(cabeca_lista == null){
			
			novo_no.prox = cabeca_lista;
			cabeca_lista = novo_no;			
			
		}else{	
			
			novo_no.prox = cabeca_lista;
			cabeca_lista.ant = novo_no;
			cabeca_lista = novo_no;			
		}		
		
	}
	
	public void insere_final(int n){
		
		No2 aux;
		No2 novo_no = new No2(n);
		if(cabeca_lista == null){
			cabeca_lista = novo_no;
		}else{
			aux = cabeca
		}
		
	}
}