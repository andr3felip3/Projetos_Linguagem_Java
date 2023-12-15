import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
	public class Baralho {
		private List<Carta>baralho=new ArrayList<Carta>();
		
		public Baralho(){
			baralho=new ArrayList<Carta>();
		}
		public Baralho(int qtNaipe,char naipe){
			String nome;
			int numcarta=0;
			Carta c;
			if (qtNaipe==1){
				for (numcarta=1;numcarta<14;numcarta++){
					 nome=String.format("%d",numcarta)+"-"+naipe+".png";
					 c= new Carta(nome,naipe,numcarta,false);
					 baralho.add(c);
				}
			}
			if (qtNaipe==4){
				for(int i=1;i<5;i++){
					switch(i){
					case 1: naipe='o';break;
					case 2: naipe='c';break;
					case 3: naipe='e';break;
					case 4: naipe='p';break;
					}
					for (int nc=1; nc<14;nc++){
						nome=String.format("%d",numcarta)+"-"+naipe+".png";
						c= new Carta(nome,naipe,numcarta,false);
						baralho.add(c);
					}
				}
				
					
			}
		}
		public void zeraBaralho(){
			baralho.clear();
		}
		
		public int qtdade(){
			return baralho.size();
		}
		
		public void embaralha(){
			Collections.shuffle(baralho);
		}
		
		public Carta getCarta(int posicao){
			Carta c= baralho.get(posicao);
			baralho.remove(posicao);
			return c;
		}
		public String toString(){
			String saida="------Baralho-----\n";
			for(Carta c:baralho)
				saida+=c.toString()+"\n";
			return saida;
		}
}