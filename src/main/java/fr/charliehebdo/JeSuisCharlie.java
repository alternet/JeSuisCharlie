package fr.charliehebdo;

/**
 * Hommage aux 12 membres de Charlie Hebdo assassinés le 7/1/2015
 */
public class JeSuisCharlie {

    public JeSuisCharlie() {
        // cela ne devrait pas arriver, c'est pourquoi
        // "JE SUIS CHARLIE" est écrit sur la sortie
        // d'erreur standard
        System.err.println("JE SUIS\nCHARLIE");
    }

    /**
     * On ne peut détruire la liberté
     *
     * @return CharlieHebdo est immortel.
     */
    public CharlieHebdo reborn() {
        return new CharlieHebdo();
    }

    public void pleurer() {}

}
