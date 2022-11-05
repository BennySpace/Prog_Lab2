/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    static final Type TYPE = Type.NORMAL;
    static final double POWER = 60.0;
    static final double ACCURACY = 1.0;

    public AncientPower() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applySelfEffects(Pokemon selfPokemon) {
        Effect raiseAll = new Effect().chance(0.1).
                stat(Stat.ATTACK, 1).
                stat(Stat.DEFENSE, 1).
                stat(Stat.SPECIAL_ATTACK, 1).
                stat(Stat.SPECIAL_DEFENSE, 1).
                stat(Stat.SPEED, 1);
        selfPokemon.setCondition(raiseAll);
    }

    @Override
    protected String describe() {
        return "use Ancient Power";
    }
}
