package Composite;

public class Client {

	public static void main(String[] args) {
		Element mainRepertoire = new Répertoire("main Répertoire");
		Element sousRépertoire1 = new Répertoire("sousRépertoire1");
		Element fichier = new Fichier("FichierRep1");
		sousRépertoire1.add(fichier);
		Element sousRépertoire2 = new Répertoire("sousRépertoire2");
		Element raccourci = new Raccourci("raccourciRep2");
		sousRépertoire2.add(raccourci);
		mainRepertoire.add(sousRépertoire2);
		mainRepertoire.add(sousRépertoire1);
		
		mainRepertoire.description();
	

	}

}
