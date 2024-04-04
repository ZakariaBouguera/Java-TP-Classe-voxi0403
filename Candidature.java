package fr.voxi.admin;
import java.time.LocalDate ;
public class Candidature {
	private int numero;
	private LocalDate dateDepot;
	private LocalDate dateReponse;
	private int etat = EN_ATTENTE;
	
	public static final int EN_ATTENTE = 1 ;
	public static final int ETUDIEE = 2 ;
	public static final int ANNULEE = 3;
	public static final int ACCEPTEE = 4 ;
	public static final int REJETEE = 5;
	
	public Candidature ( int numero,LocalDate dateDepot, LocalDate dateReponse, int etat) {
		this.numero = numero;
		this.dateDepot =  dateDepot ;
		this.dateReponse = dateReponse;
		this.etat = etat ; 
	}
	
	public Candidature ( int numero,LocalDate dateDepot) {
		this.numero = numero;
		this.dateDepot =  dateDepot ;
		this.etat = EN_ATTENTE ; 
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getDateDepot() {
		return dateDepot;
	}
	public void setDateDepot(LocalDate dateDepot) {
		this.dateDepot = dateDepot;
	}
	public LocalDate getDateReponse() {
		return dateReponse;
	}
	public void setDateReponse(LocalDate dateReponse) {
		this.dateReponse = dateReponse;
	}
	public int getetat() {
		return etat;
	}
	public void setetat(int etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Candidature [numero=" + numero + ", dateDepot=" + dateDepot + ", dateReponse=" + dateReponse + ",etat = "+ etat + " ]";
	}
	
	public void etudier() {
		if (this.etat== EN_ATTENTE) {
			this.etat = ETUDIEE;
		}
	}
	public void enAtt() {
		this.etat = EN_ATTENTE;
	}
	public void annuler() {
		this.etat = ANNULEE ; 
	}
	public void acceptee() {
		this.etat = ACCEPTEE ; 
	}
	public void rejetee() {
		this.etat = REJETEE ; 
	}
}
