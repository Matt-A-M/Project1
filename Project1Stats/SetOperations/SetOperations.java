import java.util.ArrayList;

public class SetOperations{
    public String getUnion(ArrayList<String> days1, ArrayList<String> days2){
        ArrayList<String> union = new ArrayList<String>();
        union.addAll(days1);
        union.addAll(days2);
        return union.toString();
    }
    
    public String getIntersection(ArrayList<String> colors1, ArrayList<String> colors2){
        for(int i = 0; i <= colors1.size(); i++){
           if(colors2.contains(colors1.get(i))){
               ArrayList<String> intersect = new ArrayList<String>();
               intersect.add(colors1.get(i));
               return intersect.toString();
           }
        }
        return "";
    }
    public String getComplement(ArrayList<String> days1){
        String complment = days1.get(1);
        days1.remove(complment);
        return days1.toString();
    }
    
    public String getComplementOfSubset(ArrayList<String> days2, ArrayList<String> favdays){
       for(int i = 0; i <= 1; i++){
           if (days2.contains(favdays.get(i))){
               days2.remove(favdays.get(i));

           }
           }
           return days2.toString();
}
}