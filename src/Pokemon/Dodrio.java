package Pokemon;

import Move.Damage.Special.TriAttack;

public class Dodrio extends Doduo {
    static final double HP = 60.0;
    static final double ATTACK = 110.0;
    static final double DEFENSE = 70.0;
    static final double SPECIAL_ATTACK = 60.0;
    static final double SPECIAL_DEFENSE = 60.0;
    static final double SPEED = 110.0;

    public Dodrio(String name, int level) {
        super(name, level);

        this.addMove(new TriAttack());
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
    }
}
