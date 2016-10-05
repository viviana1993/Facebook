package Facebook;

import java.util.ArrayList;
import java.util.List;

public class Facebook {

		
	
		private List<Utente> ListaUtenti=new ArrayList<>();
		
		
		public List<Utente> getListaUtenti() {
			return ListaUtenti;
		}


		public void setListaUtenti(List<Utente> listaUtenti) {
			ListaUtenti = listaUtenti;
		}


		public Facebook(){
			//mettere sempre un costruttore di default
		                 }//fine costruttore di default
		
	
//metodo 1
	public void registraUtente(String nome,String cognome,int età,char sesso,String email) {
		
		
			if(email.contains("@")&& !ListaUtenti.contains(email)){ //inizio if
				Utente u=new Utente(nome,cognome,età,sesso,email);
				ListaUtenti.add(u);
			                            }//fine if
			else{
				System.out.println("Errore:email errata o già registrata!");
			}
		                           
		
	}//fine metodo registraUtente

	
	
	//metodo2
	public void aggiungiAmici(String NomeCognome1, String NomeCognome2) {
		//es u1 diventa nomecognome 1 e u2 diventra nomecognome2
		Utente a=null;
		Utente b=null;
		
		for(Utente u:ListaUtenti){
		
			String Temp=u.getNome()+" "+u.getCognome();
			if(NomeCognome1.equals(Temp)){
				a = u;}
			if(NomeCognome2.equals(Temp)){
				b = u;}
				}//chiudo for
		if(a!=null && b!=null){
			
			a.InserisciAmici(b);
			b.InserisciAmici(a);
		}//fine metodo2
		
		
		}
	
	
		//metodo3
		public List<Utente> getAmiciDiUnUtente(String Nome, String Cognome) {
			
			Utente Utemp=null;
			String outTemp="";
			
			for(Utente u1:ListaUtenti){
				if(u1.getNome().equals(Nome)&&u1.getCognome().equals(Cognome))Utemp=u1;
						
			}
			
			if(Utemp!=null){
				for(Utente u:Utemp.getAmici()){
					//+= serve a concatenare
					outTemp=u.getNome()+" "+u.getCognome()+" \n";
					System.out.println(outTemp);
				}
				
			}
			
			return Utemp.getAmici();
			
		}
		
	
		
		
		//metodo4
		public List<Utente> getAmiciDiAmici(String Nome, String Cognome){
			
			Utente uTemp=null;//creo un oggetto
			for(Utente u:ListaUtenti){
				if(u.getNome().equals(Nome)&&u.getCognome().equals(Cognome)){
					
					uTemp=u;//valorizzo uTemp
					
				}
			}
			List<Utente> ListaAmici=uTemp.getAmici();
			
			List<Utente> ListaTemp=new ArrayList<Utente>();
				for(Utente u1:ListaAmici){	
			
					ListaTemp.add(u1);//inserisce utente u alla lista
			        List<Utente> AmiciAmici=u1.getAmici();
			        
			        for(Utente ux:AmiciAmici){
			        	if(ux.getNome().equals(Nome)==false && ux.getCognome().equals(Cognome)==false && ListaAmici.contains(ux)==false){
			        		ListaTemp.add(ux);
			        	}
			        }
				}
				
				for(Utente u:ListaTemp){
					System.out.println("Amici di "+u.getNome()+" "+u.getCognome());
				for (Utente ux:u.getAmici()){
					System.out.println(ux.getNome()+" "+ux.getCognome());
				}
			
	
		
		
		}
				return ListaTemp;	
		
		}
	


}

	



