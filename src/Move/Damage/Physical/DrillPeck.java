/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DrillPeck extends PhysicalMove {
    static final Type TYPE = Type.FLYING;
    static final double POWER = 80.0;
    static final double ACCURACY = 1.0;

    public DrillPeck() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return "use Drill Peck";
    }
}
