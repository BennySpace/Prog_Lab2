/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class MuddyWater extends SpecialMove {
    static final Type TYPE = Type.WATER;
    static final double POWER = 90.0;
    static final double ACCURACY = 0.85;

    public MuddyWater() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect reduceACR = new Effect().chance(0.3).stat(Stat.ACCURACY, 1);
        oppPokemon.setCondition(reduceACR);
    }

    @Override
    protected String describe() {
        return "use Muddy Water";
    }
}
