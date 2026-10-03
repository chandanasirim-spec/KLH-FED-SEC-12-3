import java.util.Scanner;
class Energy{
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Energy generated in KWH");
       Double EnergyGenerated = sc.nextDouble();
        if(EnergyGenerated >=10){
            System.out.println("Good Energy Generation");
        }else{
            System.out.println("Low Energy Generation");
        }
   sc.close();
    }
}