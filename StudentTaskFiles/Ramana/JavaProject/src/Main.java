//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("            ===Above r the lst of ct's: === ");
        City city1 = new City();
        city1.name = "Bezawada";
        city1.famous = "Durga Temple";
        city1.hospitals = 1500;
        city1.income = 300000000;
        city1.population = 5000000;
        city1.policestations = 700;
        System.out.println(city1.name + ",famous for --> " + city1.famous + ",city has hospitals of count -->" + city1.hospitals + ", city has income of -->" + city1.income+ "lakh crores -->" + ",has population -->" + city1.population + ",to control them we have -->" + city1.policestations + "policestations");

        City city2 = new City();
        city2.name = "Hyderabad";
        city2.famous = "Charminar";
        city2.hospitals = 1200;
        city2.income = 300000;
        city2.population = 50000;
        city2.policestations = 600;
        System.out.println(city2.name + ",famous for --> " + city2.famous + ",city has hospitals of count -->" + city2.hospitals + ", city has income of -->" + city2.income+ "lakh crores -->" + ",has population -->" + city2.population + ",to control them we have -->" + city2.policestations + "policestations");

        City city3 = new City();
        city3.name = "Kota";
        city3.famous = " Suicide";
        city3.hospitals = 100;
        city3.income = 300000;
        city3.population = 700000;
        city3.policestations = 000;
        System.out.println(city3.name + ",famous for --> " + city3.famous + ",city has hospitals of count -->" + city3.hospitals + ", city has income of -->" + city3.income+ "lakh crores -->" + ",has population -->" + city3.population + ",to control them we have -->" + city3.policestations + "policestations");

        City city4 = new City();
        city4.name = "Patna";
        city4.famous = " Decoits ";
        city4.hospitals = 500;
        city4.income = 200000;
        city4.population = 250000;
        city4.policestations = 100;
        System.out.println(city4.name + ",famous for --> " + city4.famous + ",city has hospitals of count -->" + city4.hospitals + ", city has income of -->" + city4.income+ "lakh crores -->" + ",has population -->" + city4.population + ",to control them we have -->" + city4.policestations + "policestations");

        City city5 = new City();
        city5.name = "Kadapa";
        city5.famous = "Faction";
        city5.hospitals = 500;
        city5.income = 300000;
        city5.population = 500000;
        city5.policestations = 150;
        System.out.println(city5.name + ",famous for --> " + city5.famous + ",city has hospitals of count -->" + city5.hospitals + ", city has income of -->" + city5.income+ "lakh crores -->" + ",has population -->" + city5.population + ",to control them we have -->" + city5.policestations + "policestations");
        System.out.println("            ***End of the ct's list***");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("            ===Above r the lst of villages: ===");
        Village v1 = new Village();
        v1.name = "ABC";
        v1.population = 1200;
        v1.area = 50.5;
        v1.location = "East";
        v1.primaryOccupation = "Farming";
        v1.numberOfSchools = 3;
        v1.numberOfHospitals = 1;
        v1.hasMarket = true;
        v1.numberOfParks = 1;
        System.out.println("village name is -->" + v1.name + ",has population --> " + v1.population + ",consists of acers -->"+ v1.area + ",located towards -->"+v1.location+", occupation -->"+v1.primaryOccupation +",consists of schools count -->"+v1.numberOfSchools+", has "+v1.numberOfHospitals +" hospitals"+",shops of count -->"+v1.hasMarket+",has parks with count -->"+v1.numberOfParks);

        Village v2 = new Village();
        v2.name = "MNO";
        v2.population = 2000;
        v2.area = 45.5;
        v2.location = "West";
        v2.primaryOccupation = "Farming";
        v2.numberOfSchools = 5;
        v2.numberOfHospitals = 3;
        v2.hasMarket = true;
        v2.numberOfParks = 3;
        System.out.println("village name is -->" + v2.name + ",has population --> " + v2.population + ",consists of acers -->"+ v2.area + ",located towards -->"+v2.location+", occupation -->"+v2.primaryOccupation +",consists of schools count -->"+v2.numberOfSchools+", has "+v2.numberOfHospitals +" hospitals"+",shops of count -->"+v2.hasMarket+",has parks with count -->"+v2.numberOfParks);

        Village v3 = new Village();
        v3.name = "XYZ";
        v3.population = 700;
        v3.area = 40.5;
        v3.location = "South";
        v3.primaryOccupation = "Farming";
        v3.numberOfSchools = 2;
        v3.numberOfHospitals = 1;
        v3.hasMarket = true;
        v3.numberOfParks = 1;
        System.out.println("village name is -->" + v3.name + ",has population --> " + v3.population + ",consists of acers -->"+ v3.area + ",located towards -->"+v3.location+", occupation -->"+v3.primaryOccupation +",consists of schools count -->"+v3.numberOfSchools+", has "+v3.numberOfHospitals +" hospitals"+",shops of count -->"+v3.hasMarket+",has parks with count -->"+v3.numberOfParks);
        System.out.println("            ***End of villages***");
    }
}