public class Products {
    public String product_Name;
    public String processor;
    public int Price;
    public float weight;
    public String dimensions;
    public int simslots;
    public int battery;

    Products(String product_Name, String processor,int Price, float weight, String dimensions, int simslots, int battery){
        this.product_Name = product_Name;
        this.processor = processor;
        this.Price = Price;
        this.weight = weight;
        this.dimensions = dimensions;
        this.simslots = simslots;
        this.battery = battery;
    }
}
