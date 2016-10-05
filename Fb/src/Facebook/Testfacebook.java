package Facebook;

public class Testfacebook {

	public static void main(String[] args) {
        
		
		Facebook f=new Facebook();
		
		
		Utente u1 = new Utente("aaaa","aaaa",18,'M',"aaaa@alfa.com");
		
		Utente u2 = new Utente("bbbb","bbbb",18,'M',"bbbb@alfa.com");
		
		Utente u3= new Utente("cccc","cccc",28,'f',"cccc@alfa.com");
		
		Utente u4=new Utente("dddd","dddd",28,'F',"dddd@alfa.com");
		
		Utente u5=new Utente("eeeee","eeee",28,'F',"eeeee@alfa.com");
		
		
		
		
		f.registraUtente(u1.getNome(),u1.getCognome(),u1.getEtà(),u1.getSesso(),u1.getEmail());//u1 è come scrivere u1.getNome()+' '+u1.getCognome()+...
		f.registraUtente(u2.getNome(),u2.getCognome(),u2.getEtà(),u2.getSesso(),u2.getEmail());
		f.registraUtente(u3.getNome(),u3.getCognome(),u3.getEtà(),u3.getSesso(),u3.getEmail());
		f.registraUtente(u4.getNome(),u4.getCognome(),u4.getEtà(),u4.getSesso(),u4.getEmail());
		f.registraUtente(u5.getNome(),u5.getCognome(),u5.getEtà(),u5.getSesso(),u5.getEmail());
		/*
		for(Utente u:f.getListaUtenti())
			System.out.println(u.toString());*/
		
		f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u2.getNome()+" "+u2.getCognome());
		f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u3.getNome()+" "+u3.getCognome());
		f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u4.getNome()+" "+u4.getCognome());
		f.aggiungiAmici(u1.getNome()+" "+u1.getCognome(),u5.getNome()+" "+u5.getCognome());
		f.aggiungiAmici(u2.getNome()+" "+u2.getCognome(),u3.getNome()+" "+u3.getCognome());
		
		/*for(Utente u:f.getListaUtenti())
		{
			System.out.println("Utente= "+u.toString()+" Amici ");
			for(Utente ux:u.getAmici()){
				System.out.println(ux.toString());
			}
		}
			*/
		
		
		//f.getAmiciDiUnUtente(u1.getNome(),u1.getCognome());
		//f.getAmiciDiUnUtente(u2.getNome(),u2.getCognome());
		/*f.getAmiciDiUnUtente(u3.getNome(),u3.getCognome());
		f.getAmiciDiUnUtente(u4.getNome(),u4.getCognome());
		f.getAmiciDiUnUtente(u5.getNome(),u5.getCognome());*/
		
		f.getAmiciDiAmici(u1.getNome(),u1.getCognome());
		

	
	}

}
