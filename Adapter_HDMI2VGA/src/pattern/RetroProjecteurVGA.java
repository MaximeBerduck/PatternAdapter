package pattern;

public class RetroProjecteurVGA {
	OrdinateurVga ordiConnecte;

	public RetroProjecteurVGA() {
		this.ordiConnecte = null;
	}

	public void connecterUnOrdi(OrdinateurVga ordiAConnecter) {
		if (null != this.ordiConnecte) {
			this.ordiConnecte.seDeconnecter();
		}
		this.ordiConnecte = ordiAConnecter;
		this.ordiConnecte.seConnecterEnVga();
	}

	public void projeter() {
		System.out.println(this.ordiConnecte.projeter());
	}
}
