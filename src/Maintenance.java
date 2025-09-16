//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Maintenance {
    public static void main(String[] args) {
        System.out.println( "Task 2 Annual Maintenance Cost");
        double summerCost = 64;
        double springCost = 79;
        double autumnCost = 46;
        double winterCost = 35;
        double totalCost = 0; //placeholder input for year

        totalCost = springCost + summerCost + autumnCost + winterCost;
        System.out.println( "The total annual maintenance cost is $" + totalCost);

    }
}