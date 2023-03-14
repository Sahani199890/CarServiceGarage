
public class Main {
    public static void main(String[] args){
        Inputs inputs=new Inputs();
        inputs.selectCar();
        inputs.noOfServices();
        inputs.services();
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.printBill(inputs.vehicle,inputs.list);
    }
}
