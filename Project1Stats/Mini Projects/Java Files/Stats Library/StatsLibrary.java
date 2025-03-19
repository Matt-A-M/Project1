import java.math.BigInteger;
import java.util.Scanner;

public class StatsLibrary{
    //mean, adds up all numbers and divides by how many numbers were input
    public double getMean(int[] userInputNumbers){
        int total = 0;
        for(int singleNumber: userInputNumbers){
            total = total + singleNumber;
        }
        double result = (double) total / userInputNumbers.length; 
        return result;
    }
    
    //sorts array of numbers from smallest to largest and finds the middle value
    public double getMedian(int[] userInputNumbers){
        float median = 0;;
        int medianCalc;
        float evenMedian;
        int guide;
        int length = userInputNumbers.length;
        for(int i = 1; i < length; i++){
            guide = userInputNumbers[i];
            int j = i - 1;
            while(j >= 0 && userInputNumbers[j] < guide){
                userInputNumbers[j+1] = userInputNumbers[j];
                j = j - 1;
            }
            userInputNumbers[j+1] = guide;
        }
        
        //if statement related to even arrays i.e. if an array was to have an even number of inputs
         if (length % 2 != 0){
        medianCalc = length / 2;
        median = userInputNumbers[medianCalc];
        } else{
            medianCalc = length / 2;
            evenMedian = userInputNumbers[medianCalc] + userInputNumbers[medianCalc + 1] / 2;
            median = evenMedian;
        }
        
        return median;
    }
    
    //compares every individual number with each other to find the most common input
    public double getMode(int[] userInputNumbers){
        int mode = 0;;
        int count;
        int maxCount = 0;
        int length = userInputNumbers.length;
        for(int i = 0; userInputNumbers[i] < length; i++){
            count = 0;
            for(int j = 0; j < length; j++){
                if(userInputNumbers[i] == userInputNumbers[j]){
                    count++;
                }
                }
            
            if(count > maxCount){
                mode = userInputNumbers[i];
                maxCount = count;
            }
        }
        return mode;
    }
    //Takes each input subtracted by the mean, squares the result, adds it to a new total, divides it by number of inputs - 1, then square roots it
    public double getStandardDeviation(int[] userInputNumbers){
         int total = 0;
         int replaceTotal = 0;
        for(int singleNumber: userInputNumbers){
            total = total + singleNumber;
        }
        double result = (double) total / userInputNumbers.length; //careful int division
        for(int singleNumber: userInputNumbers){
            double replaceSingleNumber = singleNumber - result;
            replaceTotal += replaceSingleNumber * replaceSingleNumber;
        }
        double variance = (double) replaceTotal / (userInputNumbers.length - 1);
        double stanDev = Math.sqrt(variance);
        return stanDev;
    }
    public BigInteger fact(double number) {
    	BigInteger result = BigInteger.ONE;
    	for(int i = 2; i <= number; i++) {
    		result = result.multiply(BigInteger.valueOf(i));
    	}
    	return result;
    }
    //unordered n choose r
    public double combinationsCalc(double value1, double value2) {
    	BigInteger equationAnswer = fact(value1).divide(fact(value2).multiply(fact(value1 - value2)));
    	return equationAnswer.doubleValue();
    }

    //ordered n choose r
    public double permutationsCalc(double value1, double value2) {
    	BigInteger equationAnswer = fact(value1).divide(fact(value1 - value2));
    	return equationAnswer.doubleValue();
    	
    }
  //code was tested on example 1 we did in class
  //p = .80, q = .20, n = 10, y = 7
  //returned .201326... which is answer given in class
  	public double binomialDistrubtion( ) {
  		double p = .80;
  		double q = 1 - p;
  		double y = 7;
  		double n = 10;
  		double py = combinationsCalc(n,y) * Math.pow(p, y) * Math.pow(q,n - y);
  		return py;
  		}
  	// 3.67 pg 119, should be ~.07203
  	public double geoFormula() {
  		double p = 0.3;
  		double q = 1 - p;
  		int y = 5;
  		double equation = Math.pow(q, y - 1) * p;
  		return equation;
  			}
  	public double negativeFormula() {
  		//book example 3.14
  		//should be ~.0307
  	    double p = .2;
  	    double q = 1 - p;
  	    double r = 3;
  	    double y = 5;
  	    double equation = combinationsCalc(y-1, r-1) * Math.pow(p, r) * Math.pow(q, y-r);
  	    	
  	    return equation;
  	    }
  	public double hyperFormula() {
		//female voter problem page 101
  		//should be 0.130
  		double r = 101;
		double y = 7;
		double N = 196;
		double n = 10;
		
		double equation = (combinationsCalc(r, y) * combinationsCalc(N - r, n - y))/(combinationsCalc(N,n));
		return equation;
	}
  	
  	//Axioms
  	private double A;
  	private double B;
  	private double AB;
  	
    public double dependent() {
	
		double intersection = A * AB;
		return intersection;
	}
	public double independent() {
		double intersection = A * B;
		return intersection;
	}
	public boolean isDependent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there replacement? 1. Yes, 2. No");
		int axiomR = scan.nextInt();
		if(axiomR == 1) {
			scan.close();
			return false;
		}else {
			scan.close();
			return true;
		}
		
	}
	public double generalAdd() {
		if(isDependent()) {
			double equation = A + B - dependent();
			return equation;
		}else {
			double equation = A + B - independent();
			return equation;
		}
		
		
	}
	public double exclusiveAdd() {
		double union = A + B;
		return union;
	}
  	}









