public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int account = 656; // начальный аккаунт
        int price = 10_000; // сумма пополнения
        int miles = service.calculate(price); // начисляемые бонусные рубли
        int final_account = account + price + miles; // итоговый счет после пополнения

        String rub = " руб.";
        String acc = "Баланс счета: ";
        String gratification = "Начисленные бонусные рубли: ";
        System.out.println(gratification + miles + rub);
        System.out.println(acc + final_account + rub);
    }
}
