public class Main {
    public static void main(String[] args) {
        //Books bb = new Books();
//       bb.Bookcolor="green";
//       bb.Bookcost=50;
//       bb.Bookindexes="5";
//       bb.BookName="classmate";
//       bb.Bookpages=100;
//        bb.getBookcost();
//        bb.getBookpages();
//
//        Laptop lp = new Laptop();
//        lp.cost=50000;
//        lp.generation="i5";
//        lp.manufacture="dell";
//        lp.processor="i5";
//        lp.Laptopgeneration();
//        lp.Laptopcost();
//
//      Mobiles mb = new Mobiles();
//        mb.length = 35;
//        mb.color="blue";
//        mb.company="poco";
//        mb.price=30000;
//        mb.getname();
//        mb.getname();
        State s1 = new State();
        s1.name = "A";
        s1.lakes = 30;
        s1.hospitals = 26;
        s1.towns = 22;
        s1.population = 70.45;
        s1.oneVillage = new Village();
        s1.oneVillage.name = "pothur";
        s1.oneVillage.percentge = 70.33;
        s1.oneVillage.schools = "Chaintya";
        s1.oneVillage.hospitals = 40;
        s1.oneVillage.checkdams = 20;
        s1.oneVillage.lakes = 3;
        s1.oneVillage.getvillage1name();
        s1.oneVillage.getvillage1percenatage();
        s1.oneCitie = new Citi();
        s1.oneCitie.name = "rampally";
        s1.oneCitie.population = 56;
        s1.oneCitie.pubs = 2;
        s1.oneCitie.clubs = 3;
        s1.oneCitie.bars = 1000;
        s1.oneCitie.getCitiename();
        s1.oneCitie.getbars();
    }
}
