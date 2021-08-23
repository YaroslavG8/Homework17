import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {

        ArrayList<House> myHouseArrayList = new ArrayList<House>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);

        for (House h: myHouseArrayList) {
            System.out.println(h);
        }

        PriceComparator myPriceComparator = new PriceComparator();
        myHouseArrayList.sort(myPriceComparator);

        System.out.println("Sorted: ");
        for (House h: myHouseArrayList) {
            System.out.println(h);
        }
    }
}
