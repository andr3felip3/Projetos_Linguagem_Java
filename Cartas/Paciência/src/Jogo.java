import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jogo extends JFrame {

	List <Carta> morto = new ArrayList <Carta>();
	Baralho monte;
	Carta c;
	JButton btFechado, btVazio, btAberto;
	JButton btCriaUm, btCriaQuatro, btEmbaralha, btExibe, btLimpa;
	
	public Jogo() {
		
		super ("Jogo de Cartas de Baralho.");
		setLayout(new BorderLayout());
		Icon iconFechado = new ImageIcon(getClass().getResource("fechado.png"));
		Icon iconVazio = new ImageIcon(getClass().getResource("vazio.png"));
		
		btFechado = new JButton ("iconeVazio");
		btAberto = new JButton ("iconeVazio");//
		
		monte = new Baralho();
		morto.clear();
		
		//adicionando botões
		JPanel painelcentro = new JPanel(new GridLayout(1,2,5,5));
		painelcentro.add(btFechado);
		painelcentro.add(btAberto);
		add(painelcentro, BorderLayout.CENTER);
		
		
		JPanel painelsul = new JPanel(new FlowLayout());
		btCriaUm = new JButton ("Criar um naipe");
		btCriaQuatro = new JButton ("Criar 4 naipes");
		btEmbaralha = new JButton("Embaralhar");
		btLimpa = new JButton("Limpar baralho");
		btExibe = new JButton("Exibe");
		painelsul.add(btCriaUm);
		painelsul.add(btCriaQuatro);
		painelsul.add(btEmbaralha);
		painelsul.add(btLimpa);
		painelsul.add(btExibe);
		
		add(painelsul, BorderLayout.SOUTH);
	
	
	}
	
	public static void main(String[] args) {
		
		Jogo j = new Jogo();
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(670,300);
		j.setLocation(400,200);
		j.setVisible(true);

	}

}
