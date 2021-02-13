
public class Liste <T> {
	public Link anfang, ende;

	public Liste() {
		anfang = ende = null;
	}

	public void einfuegenAnfang(Daten daten) {
		if (anfang == null)
			anfang = ende = new Link(daten, anfang);
		else
			anfang=new Link(daten, anfang);
	}

	public void anfuegenEnde(Daten daten) {
		Link neu = new Link(daten, null);
		if (anfang == null) {
			anfang = ende = neu;
		} else {
			ende = ende.naechster = neu;
		}
	}

	public void entferneAnfang() {
		anfang = anfang.naechster;
	}

	public void leeren() {
		anfang = ende = null;
	}

	public void printAll() {
		int zaehler = 1;
		if (anfang != null) {
			while (anfang != null) {
				System.out.println(anfang.daten.getName() + " " + zaehler);
				anfang = anfang.naechster;
				zaehler++;
			}
		} else
			System.out.println("Die Liste ist leer");

	}
}
