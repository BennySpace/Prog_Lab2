/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import Pokemon.Cryogonal;
import Pokemon.Doduo;
import Pokemon.Dodrio;
import Pokemon.Azurill;
import Pokemon.Marill;
import Pokemon.Azumarill;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Cryogonal("Konata Izumi", 1);
        Pokemon p2 = new Doduo("Miyuki Takara", 1);
        Pokemon p3 = new Dodrio("Kagami Hiiragi", 1);
        Pokemon p4 = new Azurill("Tsukasa Hiiragi", 1);
        Pokemon p5 = new Marill("Akira Kogami", 1);
        Pokemon p6 = new Azumarill("Minoru Shiraishi", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
