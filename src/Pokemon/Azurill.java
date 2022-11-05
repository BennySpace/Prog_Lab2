package Pokemon;

import Move.Damage.Special.Blizzard;
import Move.Damage.Special.Bubble;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azurill extends Pokemon {
    static final Type TYPE_1 = Type.NORMAL;
    static final Type TYPE_2 = Type.FAIRY;
    static final double HP = 50.0;
    static final double ATTACK = 20.0;
    static final double DEFENSE = 40.0;
    static final double SPECIAL_ATTACK = 20.0;
    static final double SPECIAL_DEFENSE = 40.0;
    static final double SPEED = 20.0;

    public Azurill(String name, int level) {
        super(name, level);

        this.setType(TYPE_1, TYPE_2);
        this.setMove(new Bubble(), new Blizzard());
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
    }
}
