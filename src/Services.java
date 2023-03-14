import java.util.HashMap;

class Services {
    private String code;
    private String name;
    private HashMap<Car,Integer> prices;

    public Services(String code, String name, Integer priceHatchback, Integer priceSedan, Integer priceSUV,Integer priceBenz) {
        this.code = code;
        this.name = name;
        this.prices = new HashMap<>();
        this.prices.put(Car.HATCHBACK,priceHatchback);
        this.prices.put(Car.SEDAN,priceSedan);
        this.prices.put(Car.SUV,priceSUV);
        this.prices.put(Car.Benz,priceBenz);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice(Car car) {
        return this.prices.get(car);
    }
}