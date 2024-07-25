public class Mains {


            public static void main(String[] args) {


                System.out.println("Randi amma randi !");

                Simple s1 = new Simple();

                s1.Name = "fan";
                s1.Cost = 5000;
                s1.Discount  = "15%";
                s1.Color = "brown";
                s1.Barcode = "345678987654";
                System.out.println(s1.Name );
                System.out.println(s1.Cost );
                System.out.println(s1.Discount);
                System.out.println(s1.Color);
                System.out.println(s1.Barcode);



                Simple s2 = new Simple();
                s2.Name = "shampoo";
                s2.Cost = 500;
                s2.Discount  = "5%";
                s2.Color = "Blue";
                s2.Barcode = "876545678";
                System.out.println(s2.Name );
                System.out.println(s2.Cost );
                System.out.println(s2.Discount);
                System.out.println(s2.Color);
                System.out.println(s2.Barcode);

                Simple s3 = new Simple();
                s3.Name = "Laptop";
                s3.Cost = 50000;
                s3.Discount  = "50";
                s3.Color = "Black";
                s3.Barcode = "5678765678";
                System.out.println(s3.Name );
                System.out.println(s3.Cost );
                System.out.println(s3.Discount);
            System.out.println(s3.Color);
            System.out.println(s3.Barcode);

            Simple s4 = new Simple();
            s4.Name = "Phone";
            s4.Cost = 49999;
            s4.Discount  = "35%";
            s4.Color = "Sky blue";
            s4.Barcode = "8765456789";
            System.out.println(s4.Name );
            System.out.println(s4.Cost );
            System.out.println(s4.Discount);
            System.out.println(s4.Color);
            System.out.println(s4.Barcode);

            Simple s5 = new Simple();
            s5.Name = "charger";
            s5.Cost = 2000;
            s5.Discount  = "22%";
            s5.Color = "White";
            s5.Barcode = "76543235678";
           System.out.println(s5.Name );
           System.out.println(s5.Cost );
           System.out.println(s5.Discount);
           System.out.println(s5.Color);
           System.out.println(s5.Barcode);

            s1.Start();
            s1.end();

        }
    }


