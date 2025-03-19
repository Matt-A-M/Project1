public class TestStatsLibrary{
    public static void main(String[] args){
    StatsLibrary tester = new StatsLibrary();
    int[] someNumbers = {1,2,3,4,5};
    System.out.println("Our mean: " + tester.getMean(someNumbers));
    System.out.println("Our median: " + tester.getMedian(someNumbers));
    System.out.println("Our mode: " + tester.getMode(someNumbers));
    System.out.println("Our standard deviation: " + tester.getStandardDeviation(someNumbers));
    System.out.println("Binomial Distrubution Result: " + tester.binomialDistrubtion());
    System.out.println("Geometric Result: " + tester.geoFormula());
    System.out.println("HyperGeometric Result: " + tester.hyperFormula());
    System.out.println("Negative Bionomial Distrubution Result: " + tester.negativeFormula());


}
}