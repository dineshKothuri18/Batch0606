//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Test item = new Test();
        for (int i = 1; i <= 10 ; i++) {
            item.SYSTEM = "Car";
            item.colour = "White";
            item.company = "KIA";
            item.model = "Seltos";
            item.mfg = "24JUL2024";
            System.out.println(i+".");
            System.out.println("Name of the item : " + item.SYSTEM);
            System.out.println("Colour : " + item.colour);
            System.out.println("Item company : " + item.company);
            System.out.println("Item model : " + item.model);
            System.out.println("Manufacture Date-Month-Year : " + item.mfg);
            item.start();
            item.end();
            System.out.println("---------------------------------------------");
        }
    }
}
