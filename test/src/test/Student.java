package test;

import java.util.List;

public class Student {

	private String nume; // +prenume
	private List<Curs> cursuri;
	private Integer nrInregistrare;
	
	private String returnare; // just for ForEach which needs a constant
	
	public Student (String _nume, List<Curs> _cursuri) {
		this.nume = _nume;
		this.cursuri = _cursuri;
	}
	
	public Boolean hasCurs(String numeCurs) {
		for (Curs curs : cursuri) {
			if (curs.getNume() == numeCurs) {
				return true;
			}
		}
		
		return false;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public List<Curs> getCursuri() {
		return cursuri;
	}

	public void setCursuri(List<Curs> cursuri) {
		this.cursuri = cursuri;
	}
	
	@Override
	public String toString() {
		returnare = "Studentul " + this.nume + " are " + cursuri.size() + " cursuri si anume: \n";
		
		// nu pentru calcule, doar pentru afisare
		this.cursuri.forEach(curs -> {
			returnare = returnare + curs.getNume() + "\n";
		});
		
		return returnare;
	}

	public Integer getNrInregistrare() {
		return nrInregistrare;
	}

	public void setNrInregistrare(Integer nrInregistrare) {
		this.nrInregistrare = nrInregistrare;
	}
}
