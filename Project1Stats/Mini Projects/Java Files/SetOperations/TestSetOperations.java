import java.util.ArrayList;
public class TestSetOperations{
    public static void main(String[] args){
        SetOperations tester = new SetOperations();
        ArrayList<String> days1 = new ArrayList<String>();
        days1.add("Monday"); days1.add("Tuesday"); days1.add("Wednsday");
        ArrayList<String> days2 = new ArrayList<String>();
        days2.add("Thursday"); days2.add("Friday"); days2.add("Saturday"); days2.add("Sunday");
        ArrayList<String> favdays = new ArrayList<String>();
        favdays.add("Saturday"); favdays.add("Sunday");
        ArrayList<String> colors1 = new ArrayList<String>();
        colors1.add("Blue"); colors1.add("Red"); colors1.add("Yellow");
        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("Cyan"); colors2.add("Magenta"); colors2.add("Red");
        
        
        
        System.out.println(tester.getUnion(days1,days2));
        System.out.println(tester.getIntersection(colors1,colors2));
        System.out.println(tester.getComplement(days1));
        System.out.println(tester.getComplementOfSubset(days2, favdays));
        
        
       
    }
}
