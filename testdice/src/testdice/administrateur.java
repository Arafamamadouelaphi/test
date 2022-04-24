package testdice;

public class administrateur {
	public int idadmin;
	public int getIdadmin() {
		return idadmin;
	}
	public void setIdadmin(int idadmin) {
		this.idadmin = idadmin;
	}
	public String getPass() {
		return pass;
	}
	public administrateur(int idadmin, String pass, String nom) {
		super();
		this.idadmin = idadmin;
		this.pass = pass;
		this.nom = nom;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String pass;
	public String nom;
	public administrateur() {
		
		
		
		
			}
	public String ajoutdesalle(salle s)
	{
	return "la salle numero "+s.numsalle+" ajout reussi "	;
	

}public String suppressiondesalle(salle s) {
	
	return "la salle numero "+s.numsalle+" suppression reussi "	;
}
	
}
