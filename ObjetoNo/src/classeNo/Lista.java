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
	
	public boolean localizar (int n){
		No aux = cabeca_lista;
		boolean encontrou = false;
		while((aux != null) && (!encontrou)){
			if(aux.info == n){
				encontrou = true;
			}
			aux = aux.prox;
		}
		return encontrou;
	}
	
	public void remover_inicio(){
		
		if(cabeca_lista != null){
			
			cabeca_lista = cabeca_lista.prox;
		}
		
	}
	
	public void remover_final(){
		
		No aux;
		aux = cabeca_lista;
		
		while(aux.prox.prox != null){
			aux = aux.prox;
		}
		aux.prox = null;
		
		}
	
	public int getQtdElementos(){
		
		int qtd = 0;
		No aux = cabeca_lista;
		while(aux != null){
			qtd = qtd + 1;
			aux = aux.prox;
		}
		return qtd;
		
	}
	
//	public String renomear_posicao(int posicao){
//		No aux = cabeca_lista;
//		String msg = " ";
//		qtd_elementos = getQtdElementos();
//		if(cabeca_lista == null){
//			msg = "Lista Vazia";
//					
//		}else if(qtd_elementos < posicao){
//			msg = "Menos elementos do que a posicao requerida";
//		}else if(posicao == 1){
//			remover_inicio();
//			msg = "Removido inicio";
//		}else if(posicao == qtd_elemento){
//			remover_final();
//			msg = "Removido Final";
//		}else{
//			for(int i = 1; i < posicao; i++){
//				aux = aux.prox;
//			}
//			No aux2 = aux.prox;
//			aux.prox = aux2.prox;
//			msg = "Removido meio";
//		}
//	}
	
//	public void remover_fim(){
//		
//		aux1 = cabeca_lista
//	}
		
		
	}
