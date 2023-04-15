import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class schnizelJagt extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

    anzahlKorn();
}
void anzahlKorn(){
	int anzahl = 0;
	while (vornFrei() || kornDa()){
		while (kornDa()){
			nimm();
			anzahl++;
			if (!kornDa()){
				dreheMaulLinksUm(anzahl);
		}
		}
		if (vornFrei()){
			vor();
		}
		else {
		break;
		}
	}
}
void dreheMaulLinksUm(int anzahl){

	for (int i = 0;i < anzahl;i++){
		linksUm();
		gib();
	}
	if (vornFrei()){
		vor();
		anzahlKorn();
	}
}}