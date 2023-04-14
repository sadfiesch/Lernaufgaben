import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class strukturProgramm3 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	int zehler = 0;
	while (vornFrei() || !kornDa()){
		if (kornDa()){
			nimm();
			zehler++;
		}
		if (vornFrei()){
			vor();
		}
		else {
			linksUm();
			linksUm();
			while (vornFrei()){
				vor();
			}
			linksUm();
			vor();
			linksUm();
		}
	}
	linksUm();
	if (zehler == 4){
		vor();	
	}
	if (zehler == 2 || zehler == 3){
		for (int i = 0;i < 2;i++){
			vor();
		}
	}
	if (zehler == 1){
		for (int i = 0;i < 3;i++){
			vor();
		}
	}
	if (zehler > 4){
		for (int i = 0;i < 4;i++){
			vor();
		}
	}
}
}