package Pokemon;

import Move.Damage.Special.HydroPump;

public class Azumarill extends Marill {
    static final double HP = 100.0;
    static final double ATTACK = 50.0;
    static final double DEFENSE = 80.0;
    static final double SPECIAL_ATTACK = 60.0;
    static final double SPECIAL_DEFENSE = 80.0;
    static final double SPEED = 50.0;

    public Azumarill(String name, int level) {
        super(name, level);

        this.addMove(new HydroPump());
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
    }
}
