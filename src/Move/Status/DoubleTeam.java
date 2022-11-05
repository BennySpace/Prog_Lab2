/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    static final Type TYPE = Type.NORMAL;
    static final double POWER = 0.0;
    static final double ACCURACY = 1.0;

    public DoubleTeam() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applySelfEffects(Pokemon selfPokemon) {
        Effect raiseEVS = new Effect().stat(Stat.EVASION, 1);
        selfPokemon.setCondition(raiseEVS);
    }

    @Override
    protected String describe() {
        return "use Double Team";
    }
}