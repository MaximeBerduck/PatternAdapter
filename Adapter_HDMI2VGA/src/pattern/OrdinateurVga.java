package pattern;

public class OrdinateurVga implements ConnexionVga {
	private boolean estConnecte;

	public OrdinateurVga() {
		this.estConnecte = false;
	}

	@Override
	public void seConnecterEnVga() {
		this.estConnecte = true;
	}

	public void seDeconnecter() {
		this.estConnecte = false;
	}

	public String projeter() {
		if (this.estConnecte)
			return "Mon super écran d'ordinateur VGA";
		else
			return "Mon ordinateur n'est pas connecté à un vidéo projecteur";
	}
}
