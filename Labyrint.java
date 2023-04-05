import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Labyrint extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

int wegFinden = 0;
	
	while (kornDa() == false){
		linksUm();
		linksUm();
		while (wegFinden < 5){
		 	linksUm();
			if (vornFrei()){ 
				wegFinden++;
			}
		/*	if (vornFrei() == false) {
			linksUm();
			}*/
		}
		vor();
		wegFinden = 0;
	} 
}
}