import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;


public class Jogo extends JFrame {
	List <Carta>morto=new ArrayList<Carta>();
	Baralho monte;
	Carta c;
	JButton btFechado, btVazio, btAberto;
	JButton btCriaUm, btCriaQuatro, btEmbaralha, btExibe, btZeraTudo;
	
	
	public Jogo(){
		super("Jogo de Cartas de baralho");
		setLayout(new BorderLayout());
		Icon iconeFechado=new ImageIcon(getClass().getResource("fechado.png"));
		Icon iconeVazio= new ImageIcon(getClass().getResource("fechado2.png"));
		btFechado= new JButton(iconeVazio);
		btAberto= new JButton(iconeVazio);
		monte =new Baralho();
		morto.clear();
	
		JPanel painelcentro=new JPanel(new GridLayout(1,2,5,5));
		painelcentro.add(btFechado);
		painelcentro.add(btAberto);
		add(painelcentro,BorderLayout.CENTER);
		JPanel painelsul= new JPanel(new FlowLayout());
		btCriaUm= new JButton("Criar 1 naipe");
		btCriaQuatro=new JButton("Criar 4 naipes");
		btEmbaralha= new JButton("Embaralhar");
		btZeraTudo=new JButton("Zerar Baralho");
		btExibe= new JButton("Exibe");
		painelsul.add(btCriaUm);
		painelsul.add(btCriaQuatro);
		painelsul.add(btEmbaralha);
		painelsul.add(btZeraTudo);
		painelsul.add(btExibe);
		add(painelsul,BorderLayout.SOUTH);
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[]args){
		Jogo j=new Jogo();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(670,300);
		j.setLocation(400,200);
		j.setVisible(true);
	}
}
