

public class Chipotle {

    public static void main(String[] args) {
        // write your code here
        String [] rice = {" ", "white", "brown", "No rice"};
        String [] meat = {" ", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String [] beans = {" ", "pinto", "black", "No beans"};
        String [] salsa = {" ", "mild", "medium", "hot", "No salsa", "all"};
        String [] veggies = {" ", "lettuce", "fajita veggies", "No veggies", "all"};
        String [] guac = {" ", "Yes", "No"};
        String [] cheese = {" ", "Yes", "No"};
        String [] queso = {" ", "Yes", "No"};
        String [] sourCream = {" ", "Yes", "No"};
        
        for (int i = 0; i < 25; i++) {
            int one = (int) (Math.random() * 3 + 1);
            int two = (int) (Math.random() * 6 + 1);
            int three = (int) (Math.random() * 3 + 1);
            int four = (int) (Math.random() * 5 + 1);
            int five = (int) (Math.random() * 4 + 1);
            int six = (int) (Math.random() * 2 + 1);
            int seven = (int) (Math.random() * 2 + 1);
            int eight = (int) (Math.random() * 2 + 1);
            int nine = (int) (Math.random() * 2 + 1);
            double maxPrice = 6.00;
            if (one == 3) {
                maxPrice = maxPrice - 0.50;
            }
            if (three == 3) {
                maxPrice = maxPrice - 0.50;
            }
            if (four == 4) {
                maxPrice = maxPrice - 1.50;
            } else if (four == 1 || four == 2 || four == 3) {
                maxPrice = maxPrice - 0.50;
            }
            if (five == 3) {
                maxPrice = maxPrice - 1.50;
            } else if (five == 1 || five == 2) {
                maxPrice = maxPrice - 0.50;
            }
            if (six == 2) {
                maxPrice = maxPrice - 0.50;
            }
            if (seven == 2) {
                maxPrice = maxPrice - 0.50;
            }
            if (eight == 2) {
                maxPrice = maxPrice - 0.50;
            }
            if (nine == 2) {
                maxPrice = maxPrice - 0.50;
            }
            System.out.println("Burrito " + (i + 1) + ": " + rice[one] + ", " + meat[two] + ", " + beans[three] + ", " + salsa[four] + ", " + veggies[five] + ", Cheese: " + cheese[six] + ", Guac: " + guac[seven] + ", Queso: " + queso[eight] + ", Sour Cream: " + sourCream[nine] + ". Final Price: " + maxPrice);
        }
    }
}
