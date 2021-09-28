import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CafeUtil {
    public int getStreakGoal(int weeks) {
        // int sum = 0;
        // for(int i = 0 ; i <=weeks; i++){
        //     sum =i+ sum;
        // }
        return weeks * (weeks + 1)/2;
	}
    public void printPriceChart(String productName, double price, int maxNumber) {
        System.out.println(productName);
        // this will print 1 -$15.00
        for(int i = 0; i < maxNumber; i++){
            System.out.println(i + " -  $" + i * price);
        }
        return;
    }
    public double getOrderTotal(double[]lineItems) {
        double sum = 0.00;
        for ( double item : lineItems) {
            sum = sum +item;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String>menu, ArrayList<Double>prices){
        for(int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i) + " --$" + prices.get(i));
            
        }
        return;
    }
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("What's your name?");
        String userName = System.console().readLine();
        
        System.out.println("hello,"+ userName + "!");
        System.out.println("number of people" + customerList.size());
        customerList.add(userName);
        return;
    }

}
