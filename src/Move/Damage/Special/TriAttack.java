/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class TriAttack extends SpecialMove {
    static final Type TYPE = Type.NORMAL;
    static final double POWER = 80.0;
    static final double ACCURACY = 1.0;

    public TriAttack() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        int statusNum = pickStatus();

        if (statusNum == 0) {
            Effect paralyzation = new Effect().chance(20).condition(Status.PARALYZE);
            oppPokemon.setCondition(paralyzation);
        } else if (statusNum == 1) {
            Effect burning = new Effect().chance(20).condition(Status.BURN);
            oppPokemon.setCondition(burning);
        } else {
            Effect freezing = new Effect().chance(20).condition(Status.FREEZE);
            oppPokemon.setCondition(freezing);
        }
    }

    @Override
    protected String describe() {
        return "use Tri Attack";
    }

    protected int pickStatus() {
        Random randSeed = new Random();
        int statusQuantity = 3;

        return randSeed.nextInt(statusQuantity);
    }
}
