package Facebook;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	//attributo
	private String nome;
	private String cognome;
	private int et�;
	private char sesso;
	private String email;
	
	
	private List<Utente> amici=new ArrayList<>();
	
	public Utente () {
		
	}
	//costruttore
public Utente (String nome,String cognome,int et�,char sesso,String email) {
	this.setNome(nome);
	this.setCognome(cognome);
	this.setEt�(et�);
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

public int getEt�() {
	return et�;
}

public void setEt�(int et�) {
	this.et� = et�;
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
	return nome + " "+cognome + " "+et�
			+" "+ sesso +" "+ email ;
}
	//metodo per inserire amico alla lista
	public void InserisciAmici(Utente u){
		amici.add(u);
		
	}
}
