import java.math.BigInteger;


public class Birthday {
// prob of 2 people sharing birthday
// check notebook for other conditions	
Person person = new Person();

//Factorial creation using big integer;
private int n = 20;
private double year = 365;
private double leapyear = 366;
private double count = 1;

//this equation I am copying from the textbook is for the chance that no one
// shares a birthday, so subtracting it from one gives us the chance two share one
public double na(double number) {
	for(int i = 0; i < n; i++) {
		double sum = number - i;
		count = count * sum;
	}
	double answer = count;
	count = 1;
	return answer;
	
}

public String birthdayFinder() {
	double equation = 1 - (na(leapyear) / Math.pow(leapyear, n));
	double equation2 = 1 - (na(year) / Math.pow(year, n));
	return("Your birthday: " + person.getBirthday() + " has percentage value of being shared: " + equation + " including leap years " + "and " + equation2 + " if not including leap years in a group of " + n + " people" );
}
}


