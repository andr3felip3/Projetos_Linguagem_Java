import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Jogo extends JFrame {
	List <Carta>morto=new ArrayList<Carta>();
	Baralho baralho;
	Carta c;
	JButton btFechado, btVazio, btAberto;
	Icon iconeFechado, iconeVazio, iconeAberto;
	JButton btCriaUm, btCriaQuatro, btEmbaralha, btExibe, btZeraTudo;
	
	
	public Jogo(){
		super("Jogo de Cartas de baralho");
		setLayout(new BorderLayout());
		iconeFechado=new ImageIcon(getClass().getResource("fechado.png"));
		iconeVazio= new ImageIcon(getClass().getResource("vazio.png"));
		btFechado= new JButton(iconeVazio);
		btAberto= new JButton(iconeVazio);
		baralho =new Baralho();
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
		btCriaUm.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					baralho.zeraBaralho();
					baralho=new Baralho (1,'c');
					btFechado.setIcon(iconeFechado);
					btAberto.setIcon(iconeVazio);
				}
			}
		);
		btEmbaralha.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					baralho.embaralha();
				}
			}
		);
		
		btCriaQuatro.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					baralho.zeraBaralho();
					baralho=new Baralho(4,'c');
					btFechado.setIcon(iconeFechado);
					btAberto.setIcon(iconeVazio);
				}
			}
		);
		
		btZeraTudo.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					baralho.zeraBaralho();
					morto.clear();
					btFechado.setIcon(iconeFechado);
					btAberto.setIcon(iconeVazio);
				}
			}
		);
		
		btExibe.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						String saida=baralho.toString();
						JOptionPane.showMessageDialog(null,saida);
					}
				}
		);
		
		btFechado.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(baralho.qtdade()>0){
							c=baralho.getCarta(0);
							if(baralho.qtdade()==0)
									btFechado.setIcon(iconeVazio);
							String figura=c.getImagem();
						    iconeAberto=new ImageIcon(getClass().getResource(figura));
							btAberto.setIcon(iconeAberto);
							
						}
					}
				}
		);
	}
	
	public static void main(String[]args){
		Jogo j=new Jogo();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X no topo da  janela
		j.setSize(670,300);// tamanho da JAnela
		j.setLocation(400,200);//Centraliza a janela
		j.setVisible(true);// Deixa a janela visivel
	}
}
