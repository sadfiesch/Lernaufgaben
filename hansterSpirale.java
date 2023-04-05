import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hansterSpirale extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	int spirale = 1;
	while (spirale < 10){
		int linien = spirale;
		while (linien < 10){
			gib();
			vor();
			linien++;
		}
		linksUm();
		spirale++;
	}    
}}