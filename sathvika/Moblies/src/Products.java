public class Products {
        private String productname;
        private String brandname;
        private String colour;
        private String version;
        private String simslots;
        private String battery;

        public Products(String productname, String brandname,String colour, String version,String simslots,String battery) {
            this.productname = productname;
            this.brandname = brandname;
            this.colour=colour;
            this.version=version;
            this.simslots=simslots;
            this.battery=battery;

        }

        public void displayProductDetails() {
            System.out.println("Productname: " + productname);
            System.out.println("brandname: " + brandname);
            System.out.println("colour:"+colour);
            System.out.println("version: " + version);
            System.out.println("simslots:"+simslots);
            System.out.println("battery:"+battery);

        }
    }
