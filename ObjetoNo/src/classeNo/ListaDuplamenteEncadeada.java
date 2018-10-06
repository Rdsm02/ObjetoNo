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
	
	public String Listar(){
		
		No2 aux;
		aux = cabeca_lista;
		String lista = "";
		while(aux != null){
			lista += ""+aux.info+"";
			aux	= aux.prox;
		}
		return lista;
	}
	
	public void insere_ordenado(int n){
		
		No2 aux = cabeca_lista;
		No2 novo_no = new No2(n);
		if(aux == null){ // lista vazia
			cabeca_lista = novo_no;
		}else{
			while(aux.conteudo < n && aux.prox != null){
				aux = aux.prox;								
			}if(aux.conteudo < n){
				aux.prox = novo_no;
				novo_no.ant = aux;
			}if(aux.conteudo>n){
				if(aux.ant == null){
					aux.ant = novo_no;
					novo_no.prox = aux;
					cabeca_lista = novo_no;
				}else{
					novo_no.prox = aux;
					novo_no.ant = aux.ant;
					aux.ant.prox = novo_no;
					aux.ant = novo_no;
				}
			}
		}
	}
}