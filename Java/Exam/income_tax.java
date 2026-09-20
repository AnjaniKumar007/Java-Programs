public class income_tax {
    public static void main(String[] args) {
        double income = 600000;
        double tax = 0;
        if(income <= 250000){
            System.out.println("No tax");
        }
        else if (income > 250000){
            tax = 250000 * 0.05;
        }
        else if (income > 500000){
            tax = 12500 + (income-500000)*0.20;
        }
        else if (income > 1000000){
            tax = 112500 + (income - 1000000)*0.30;
        }

    System.out.println(tax);
    }
}
