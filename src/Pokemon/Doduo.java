package Pokemon;

import Move.Damage.Physical.AerialAce;
import Move.Damage.Physical.DrillPeck;
import Move.Status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Doduo extends Pokemon {
    static final Type TYPE_1 = Type.NORMAL;
    static final Type TYPE_2 = Type.FLYING;

    static final double HP = 35.0;
    static final double ATTACK = 85.0;
    static final double DEFENSE = 45.0;
    static final double SPECIAL_ATTACK = 35.0;
    static final double SPECIAL_DEFENSE = 35.0;
    static final double SPEED = 75.0;

    public Doduo(String name, int level) {
        super(name, level);

        this.setType(TYPE_1, TYPE_2);
        this.setMove(new DrillPeck(), new SwordsDance(), new AerialAce());
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
    }
}
