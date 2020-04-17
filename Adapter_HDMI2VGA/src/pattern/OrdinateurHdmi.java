package pattern;

public class OrdinateurHdmi implements ConnexionHdmi {

	private boolean estConnecte;

	public OrdinateurHdmi() {
		this.estConnecte = false;
	}

	@Override
	public void seConnecterEnHdmi() {
		this.estConnecte = true;
	}

	public void seDeconnecter() {
		this.estConnecte = false;
	}

	public String projeter() {
		if (this.estConnecte)
			return "Mon super écran d'ordinateur HDMI";
		else
			return "Mon ordinateur HDMI n'est pas connecté à un vidéo projecteur";
	}
}
