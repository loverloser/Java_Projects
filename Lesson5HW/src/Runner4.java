import by.itclass.Auto;
import by.itclass.BusinessAuto;

public class Runner4 {
    public static void main(String[] args) {
        Auto auto = new Auto("Tesla", 140);
        Auto auto1 = new BusinessAuto("Audi", 170);
        auto.show();
        auto1.show();

        auto.updateAuto();
        auto1.updateAuto();
        auto.show();
        auto1.show();
    }
}
