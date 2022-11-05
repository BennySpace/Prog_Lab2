package Move.Status;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    static final Type TYPE = Type.NORMAL;
    static final double POWER = 0.0;
    static final double ACCURACY = 1.0;

    public SwordsDance() {
        super(TYPE, POWER, ACCURACY);
    }

    @Override
    protected void applySelfEffects(Pokemon selfPokemon) {
        Effect raiseATK = new Effect().stat(Stat.ATTACK, 2);
        selfPokemon.setCondition(raiseATK);
    }

    @Override
    protected String describe() {
        return "use Swords Dance";
    }
}
