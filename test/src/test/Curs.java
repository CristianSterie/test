package test;

public class Curs {

	private String nume;
	private String descriere;
	
	public Curs(String _nume, String _descriere) {
		this.nume = _nume;
		this.descriere = _descriere;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
}
