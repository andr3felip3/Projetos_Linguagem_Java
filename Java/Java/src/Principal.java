import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
	List<Pessoa>vetpessoa=new ArrayList<Pessoa>();
	
	public void buscaPessoa(String nome){
		String saida="";
		for(Pessoa p:vetpessoa){
			if(p.getNome().equals(nome));
				saida+=String.format("\n Achou %s",p.getNome());
		}
		if(saida=="")saida+=String.format("\n Nao achou!");
		JOptionPane.showMessageDialog(null, saida);
	}
	
	public void buscaRg(String rg){
		String saida="";
		for(Pessoa p:vetpessoa){
			if(p.getRg().equals(rg));
				saida+=String.format("\n Achou %s",p.getRg());
		}
		if(saida=="")saida+=String.format("\n Nao achou!");
		JOptionPane.showMessageDialog(null, saida);
	}
	
	public Pessoa Insere(){
		String nome,rg,frase;
		int mes=0, ano=0;
		boolean erro=true;
		nome=JOptionPane.showInputDialog(null,"Entre com nome: ");
		rg=JOptionPane.showInputDialog(null, "Entre com o rg: ");
		do{
			try{
				frase=JOptionPane.showInputDialog(null,"Entre com o mes: ");
				mes=Integer.parseInt(frase);
				frase=JOptionPane.showInputDialog(null,"Entre com o ano: ");
				ano=Integer.parseInt(frase);
				erro=false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Entre somento com numeros");
			}		
		}while(erro);
		Pessoa p=new Pessoa(nome,rg,mes,ano);
		return p;
	}
	
	public void exibe(){
		String saida="\nArrayList de Pessoas\n";
		for(Pessoa p:vetpessoa){
			saida+=p.toString();
		}
		JOptionPane.showMessageDialog(null,saida);
	}
	
	public static void main(String args[]){
		Principal p=new Principal();
		char opt='0';
		String nome, rg;
		while(opt!='5'){
			String opcao=JOptionPane.showInputDialog(null,"\n 1-Inserir nova pessoa"+
														  "\n 2-Exibe todas as pessoas"+
														  "\n 3-Busca um nome"+
														  "\n 4-Busca um rg"+
														  "\n 5-Sair!");
			opt=opcao.charAt(0);
			switch(opt){
			case '1':Pessoa x=p.Insere();
					  p.vetpessoa.add(x);
					  break;
			case '2':p.exibe();
					 break;
			case '3':nome=JOptionPane.showInputDialog(null,"Entre com o nome a procurar");
					 p.buscaPessoa(nome);
					 break;
			case '4':rg=JOptionPane.showInputDialog(null,"Entre com o rg a procurar");
					 p.buscaRg(rg);
					 break;
			}
		}
	}
}
