/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    static final Type TYPE = Type.ICE;
    static final double POWER = 110.0;
    static final double ACCURACY = 0.7;

    public Blizzard() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect freeze = new Effect().chance(0.1).condition(Status.FREEZE);
        oppPokemon.setCondition(freeze);
    }

    @Override
    protected String describe() {
        return "use Blizzard";
    }
}
