import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ServiceStation {
    private Map<String, Services> services;
    public ServiceStation() {
        services = new HashMap<>();
        services.put("BS01", new Services("BS01", "Basic Service", 2000, 4000, 5000,6000));
        services.put("EF01", new Services("EF01", "Engine Fixing", 5000, 8000, 10000,12000));
        services.put("CF01", new Services("CF01", "Clutch Fixing", 2000, 4000, 6000,7500));
        services.put("BF01", new Services("BF01", "Break Fixing", 1000, 1500, 2500,3500));
        services.put("GF01", new Services("GF01", "Gear Fixing", 3000, 6000, 8000,1000));
    }

    public Services getService(String code) {
        return services.get(code);
    }

    public void printBill(Car car, List<String> serviceCodes) {
        int cost = 0;
        for (String code : serviceCodes) {
            Services service = getService(code);
            cost += service.getPrice(car);
            System.out.println(service.getName()+" : "+service.getPrice(car));
        }
        System.out.println("Total Bill : " + cost);
        if(cost>10000){
            System.out.print("You avail free cleaning service");
        }
    }
}