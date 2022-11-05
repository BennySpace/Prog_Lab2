/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class IcyWind extends SpecialMove {
    static final Type TYPE = Type.NORMAL;
    static final double POWER = 55.0;
    static final double ACCURACY = 0.95;

    public IcyWind() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect reduceSPD = new Effect().stat(Stat.SPEED, -1);
        oppPokemon.setCondition(reduceSPD);
    }

    @Override
    protected String describe() {
        return "use Icy Wind";
    }
}
