
public class DatenTest {
	public static void main(String[] args){
		Daten<String> daten1 = new Daten<String>("Daten1");
		Daten<String> daten2 = new Daten<String>("Daten2");
		Daten<String> daten3 = new Daten<String>("Daten3");
		Daten<String> daten4 = new Daten<String>(""+54);

		
		Liste liste1 = new Liste();
		liste1.einfuegenAnfang(daten1);
		liste1.einfuegenAnfang(daten2);
		liste1.anfuegenEnde(daten3);
		liste1.einfuegenAnfang(daten4);
		//liste1.leeren();


		//Iterator it = liste1.iterator();
	}
}
