public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; //Водим цену билета
        int miles = service.calculate(price); // начисляемые бонусные мили


        String name = " Бонусных миль";
        System.out.println("На вашем счете:");
        System.out.println(miles + name);
    }
}
