import java.util.Scanner;
public class InputControl extends SalesManager {
    int input=0;
    private String name;

    InputControl() {
        Scanner scanner = new Scanner(System.in);

        while (input != 8) {
            System.out.println("please enter \n1.monthly sales     2.total montly sales \n3.quaterly sales    4.yearly sales\n5.sorted sales 1    6.sorted sales 2\n7.Everything   8.quit");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    bestPeformancePerMonth();
                    break;
                case 2:
                    monthlySalesTotal();
                    break;
                case 3:
                    quarterlyRanked();
                    break;
                case 4:
                    yearlyRanked();
                    break;
                case 5:
                    sortObject(object1);
                    break;
                case 6:
                    sortObject(object2);
                    break;
                case 7:
                    bestPeformancePerMonth();
                    System.out.println("\n\n\n");
                    monthlySalesTotal();
                    System.out.println("\n\n\n");
                    quarterlyRanked();
                    System.out.println("\n\n\n");
                    yearlyRanked();
                    System.out.println("\n\n\n");
                    sortObject(object1);
                    System.out.println("\n\n\n");
                    sortObject(object2);
                    break;
                default:
                    System.out.println("you inputed wrong argument");
            }
        }
    }
}


