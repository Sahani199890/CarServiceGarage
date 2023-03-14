import java.util.*;

import static java.lang.System.exit;

public class Inputs {
    int numberOfServices;
    ArrayList<String> list=new ArrayList<>();
    Car vehicle;
    Scanner sc=new Scanner(System.in);
    public void selectCar(){
        System.out.println("Please select the your car from [Benz, HATCHBACK, SUV, Sedan] :");
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
        System.out.println("Please select no.of services needed :");
        numberOfServices=sc.nextInt();
    }
    public void services() {
        System.out.println("Please select service codes [BS01,EF01,CF01,BF01,GF01] :");
        for(int i=0;i<numberOfServices;i++){
            list.add(sc.next());
        }
    }
}
