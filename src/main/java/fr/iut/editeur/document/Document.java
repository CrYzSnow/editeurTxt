package fr.iut.editeur.document;

/**
 * Classe définissant un Document composé d'un texte
 */
public class Document {

    /**
     * Correspond au texte du Document
     */
    private String texte;

    /**
     * Construit un Document avec un texte vide
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Récupère le texte
     * @return le texte en String
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Edite du texte
     * @param texte correspond au texte à éditer
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte
     * @param texte correspond au texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace du texte
     * @param start correspond à la balise du début pour remplacer le texte
     * @param end correspond à la balise de fin pour remplacer le texte
     * @param remplacement correspond au texte à remplacer
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Remplace du texte minuscule en majuscule
     * @param start correspond à la balise du début pour remplacer le texte
     * @param end correspond à la balise de fin pour remplacer le texte
     */
    public void majuscules(int start, int end) {
        String part = texte.substring(start, end);
        part = part.toUpperCase();
        remplacer(start,end,part);
    }

    /**
     * Efface du texte
     * @param start correspond à la balise du début pour effacer le texte
     * @param end correspond à la balise de fin pour effacer le texte
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * Efface completement du texte
     */
    public void clear() {
        effacer(0, texte.length());
        ajouter("z");
    }

    /**
     * Affiche le texte
     * @return texte
     */
    @Override
    public String toString() {
        return this.texte;
    }
}