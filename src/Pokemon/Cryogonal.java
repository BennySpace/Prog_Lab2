package Pokemon;

import Move.Damage.Special.AncientPower;
import Move.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Move.Status.Sharpen;
import Move.Damage.Special.IcyWind;

public class Cryogonal extends Pokemon {
    static final Type TYPE_1 = Type.ICE;
    static final double HP = 80.0;
    static final double ATTACK = 50.0;
    static final double DEFENSE = 50.0;
    static final double SPECIAL_ATTACK = 95.0;
    static final double SPECIAL_DEFENSE = 135.0;
    static final double SPEED = 105.0;

    public Cryogonal(String name, int level) {
        super(name, level);

        this.setType(TYPE_1);
        this.setMove(new Sharpen(), new DoubleTeam(), new IcyWind(), new AncientPower());
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
    }
}
