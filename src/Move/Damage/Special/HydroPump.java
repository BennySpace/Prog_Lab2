/*
 * ~~~ Developed with blood, sweat and love by Akira Ayanami ~~~
 *
 * 2022, Saint-Petersburg, ITMO Corp., Software Engineering
 */

package Move.Damage.Special;

import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
    static final Type TYPE = Type.WATER;
    static final double POWER = 110.0;
    static final double ACCURACY = 0.8;

    public HydroPump() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected String describe() {
        return "use Hydro Pump";
    }
}
