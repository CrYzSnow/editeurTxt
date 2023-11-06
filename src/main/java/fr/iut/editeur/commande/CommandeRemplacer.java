package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        String texte = parameters[3];
        if (parameters[3] == null) {
            this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), "");
        } else {
            this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), parameters[3]);
        }
        super.executer();
    }
}
