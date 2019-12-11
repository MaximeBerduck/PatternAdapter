package pattern;

public class Main {
	public static void main(String[] args) {
		RetroProjecteurVGA retroProjecteur = new RetroProjecteurVGA();
		OrdinateurHdmi ordinateurHDMI = new OrdinateurHdmi();
		AdapterOrdiHdmiToVga ordiHdmiAdapte = new AdapterOrdiHdmiToVga(ordinateurHDMI);

		OrdinateurVga ordinateurVGA = new OrdinateurVga();

		retroProjecteur.connecterUnOrdi(ordiHdmiAdapte);
		retroProjecteur.projeter();

		retroProjecteur.connecterUnOrdi(ordinateurVGA);
		retroProjecteur.projeter();
	}
}
