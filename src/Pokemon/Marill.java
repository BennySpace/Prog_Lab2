package Pokemon;

import Move.Damage.Special.MuddyWater;
import ru.ifmo.se.pokemon.Type;

public class Marill extends Azurill {
    static final Type TYPE_1 = Type.WATER;
    static final Type TYPE_2 = Type.FAIRY;
    static final double HP = 70.0;
    static final double ATTACK = 20.0;
    static final double DEFENSE = 50.0;
    static final double SPECIAL_ATTACK = 20.0;
    static final double SPECIAL_DEFENSE = 50.0;
    static final double SPEED = 40.0;

    public Marill(String name, int level) {
        super(name, level);

        this.setType(TYPE_1, TYPE_2);
        this.addMove(new MuddyWater());
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
    }
}
