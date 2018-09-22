package classeNo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		
//		l.insere_inicio(25);
//		l.insere_inicio(82);
//		l.insere_inicio(93);
		l.insere_final(25);
		l.insere_final(30);
		l.insere_final(20);
		String lota_S = l.listar();
		JOptionPane.showMessageDialog(null, l.listar());
//		System.out.println();

	}

}
