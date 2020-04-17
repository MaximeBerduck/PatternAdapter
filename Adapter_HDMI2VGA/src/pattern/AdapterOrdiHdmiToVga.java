package pattern;

public class AdapterOrdiHdmiToVga extends OrdinateurVga {
	OrdinateurHdmi ordiAdapte;

	public AdapterOrdiHdmiToVga(OrdinateurHdmi ordinateurAAdapter) {
		this.ordiAdapte = ordinateurAAdapter;
	}

	@Override
	public void seConnecterEnVga() {
		this.ordiAdapte.seConnecterEnHdmi();
	}

	@Override
	public String projeter() {
		return this.ordiAdapte.projeter();
	}

	@Override
	public void seDeconnecter() {
		this.ordiAdapte.seDeconnecter();
	}
}
