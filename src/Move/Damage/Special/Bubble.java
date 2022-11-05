/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    static final Type TYPE = Type.WATER;
    static final double POWER = 40.0;
    static final double ACCURACY = 1.0;

    public Bubble() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect reduceSPD = new Effect().chance(0.1).stat(Stat.SPEED, 1);
        oppPokemon.setCondition(reduceSPD);
    }

    @Override
    protected String describe() {
        return "use Bubble";
    }
}
