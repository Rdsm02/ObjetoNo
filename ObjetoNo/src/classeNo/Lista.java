package classeNo;

public class Lista {

	private No cabeca_lista;
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
}
