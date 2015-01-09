package fr.charliehebdo;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * Test qui démontre que Charlie Hebdo est immortel.
 */
public class JeSuisCharlieTest {

    /**
     * Teste l'immortalié de Charlie Hebdo.
     */
    @Test
    public void charlieHebdoEstImmortel() {
        CharlieHebdo charlieHebdo = new CharlieHebdo();
        Terroriste terroriste = new Terroriste();
        JeSuisCharlie jeSuisCharlie = terroriste.kill(charlieHebdo);
        CharlieHebdo immortelCharlieHebdo = jeSuisCharlie.reborn();
        Assertions.assertThat(immortelCharlieHebdo).isNotNull();
    }

    /**
     * Vérifie qu'un terroriste est toujours un crétin.
     */
    @Test
    public void unTerroristeEstToujoursUnCretin() {
        Terroriste terroriste = new Terroriste();
        Assertions.assertThat(terroriste.jeSuisUnCretin()).isTrue();
    }

}
