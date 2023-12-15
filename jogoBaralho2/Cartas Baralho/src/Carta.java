
	public class Carta {
		private String image;
		private char naipe;
		private int numero;
		private boolean aberta;
	
	public Carta(){
		this.image="";
		this.naipe=' ';
		this.numero=0;
		this.aberta=false;
	}
	
	public Carta(String i,char n,int num,boolean a){
		this.image=i;
		this.naipe=n;
		this.numero=num;
		this.aberta=a;
	}
	
	public String toString(){
		String saida="\n";
		switch(this.naipe){
		case'o':saida+="Ouro";break;
		case'e':saida+="Espadas";break;
		case'p':saida+="Paus";break;
		case'c':saida+="Copas";break;
		
		}
		switch(this.numero){
		case 1:saida+="As";break;
		case 11:saida+="J";break;
		case 12:saida+="Q";break;
		case 13:saida+="K";break;
		//default: saida+="Nao:"+String.format("%d",this.numero);break;
		}
		saida+=this.numero;
		return saida;
	}
	
	public String getImagem(){
		return this.image;
	}
	
	public void setImagem(String i){
		this.image=i;
	}
	
	public char getNaipe(){
		return this.naipe;
	}
	
	public void setNaipe(char n){
		this.naipe=n;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int num){
		this.numero=num;
	}
	
	public boolean getAberta(){
		return this.aberta;
	}
	
	public void setAberta(boolean a){
		this.aberta=a;
	}
}
