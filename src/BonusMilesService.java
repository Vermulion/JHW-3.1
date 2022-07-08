public class BonusMilesService {
    public int calculate(int price) {
    int bonus; // начисляемые бонусные рубли
        if (price > 1000) {
        bonus = (int) (0.01 * price);
    } else {
        bonus = 0;
    }
        return bonus;
}
    }
