import java.util.*;

import static java.lang.System.exit;

public class Inputs {
    int numberOfServices;
    ArrayList<String> list=new ArrayList<>();
    Car vehicle;
    Scanner sc=new Scanner(System.in);
    public void selectCar(){
        System.out.print("Please select the your car from [Benz, HATCHBACK, SUV, Sedan] :");

        String car1=sc.next();
        String car=car1.toLowerCase();
        if(car.equals("benz")){
            vehicle= Car.Benz;
        }
        else if(car.equals("hatchback")){
            vehicle= Car.HATCHBACK;
        }
        else if(car.equals("suv")){
            vehicle= Car.SUV;
        }
        else if(car.equals("sedan")){
            vehicle= Car.SEDAN;
        }
        else{
            System.out.println("Invalid selection");
            exit(0);
        }
    }
    public void noOfServices(){
        System.out.print("Please select no.of services needed :");
        numberOfServices = sc.nextInt();
        if(numberOfServices>5){
            System.out.println("max services are only 5");
            System.out.print("Please select no.of services needed :");
            numberOfServices = sc.nextInt();
        }
    }
    public void services() {
        System.out.print("Please select service numbers \n1-->BS01 \n2-->EF01\n3-->CF01\n4-->BF01\n5-->GF01\n");
        for(int i=0;i<numberOfServices;i++){
            switch (sc.nextInt()){
                case 1:list.add("BS01");
                break;
                case 2:list.add("EF01");
                break;
                case 3:list.add("CF01");
                break;
                case 4:list.add("BF01");
                break;
                case 5:list.add("GF01");
                break;
                default:System.out.println("you cannot choose above 5 services ,choose again");
                i--;
            }
        }
    }
}
