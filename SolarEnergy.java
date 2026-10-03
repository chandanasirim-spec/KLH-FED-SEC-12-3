import java.util.Scanner;
 class SolarEnergy {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy: ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy: ");
        double evening = sc.nextDouble();

        double total = calculateTotalEnergy(morning, evening);

        System.out.println("Total energy: " + total);

        sc.close();
    }
}
    
