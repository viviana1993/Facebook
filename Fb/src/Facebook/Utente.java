package Facebook;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	//attributo
	private String nome;
	private String cognome;
	private int età;
	private char sesso;
	private String email;
	
	
	private List<Utente> amici=new ArrayList<>();
	
	public Utente () {
		
	}
	//costruttore
public Utente (String nome,String cognome,int età,char sesso,String email) {
	this.setNome(nome);
	this.setCognome(cognome);
	this.setEtà(età);
	this.setSesso(sesso);
	this.setEmail(email);
	
	}
//per poter leggere e scrivere ogni attributo uso get e set
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public int getEtà() {
	return età;
}

public void setEtà(int età) {
	this.età = età;
}

public char getSesso() {
	return sesso;
}

public void setSesso(char sesso) {
	this.sesso = sesso;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
public List<Utente> getAmici() {
	return amici;
}
public void setAmici(List<Utente> amici) {
	this.amici = amici;
}

@Override
public String toString() {
	return nome + " "+cognome + " "+età
			+" "+ sesso +" "+ email ;
}
	//metodo per inserire amico alla lista
	public void InserisciAmici(Utente u){
		amici.add(u);
		
	}
}
