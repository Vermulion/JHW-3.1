public class BonusMilesService {
    public int calculate(int cost) {
    int bonus; // начисляемые бонусные рубли
        if (cost > 1000) {
        bonus = (int) (0.01 * cost);
    } else {
        bonus = 0;
    }
        return bonus;
}
    }
