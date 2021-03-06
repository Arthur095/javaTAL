package traitementTextes.bibliotheque;
import java.time.LocalDate;

/**
 * Classe fille de la classe Livre
 * <ul>
 * <li>Localdate dateRendu : Correspond à un mois après la date de la création de l'objet.</li>
 * <li>Etiquette etiquette : Etiquette du livre.</li>
 * <li>Récupère les attributs Auteur auteur et String titre du Livre passé dans le constructeur lors de l'instanciation de l'objet.</li>
 * </ul>
 */
public class livrePrete extends Livre {
	
	private static final long serialVersionUID = 1L;
	private LocalDate dateRendu = java.time.LocalDate.now().plusMonths(1);
	private Etiquette etiquette;
	
	public livrePrete(Livre ancienLivre, Etiquette etiquette){
		super(ancienLivre.getAuteur(), ancienLivre.getTitre());
		this.etiquette = etiquette;
	}
	
	public LocalDate getDateRendu() {
		return dateRendu;
	}

	public Etiquette getEtiquette() {
		return etiquette;
	}

}
