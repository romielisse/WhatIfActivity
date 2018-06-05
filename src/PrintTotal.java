import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class PrintTotal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        String customer_number, name, tax_code;
        double sales_amt, tax_owed, total_amt, sales_tax = 0;

        System.out.println("Enter customer number: ");
        customer_number = sc.nextLine();

        System.out.println("Enter customer name: ");
        name = sc.nextLine();

        System.out.println("Enter sales amount: ");
        sales_amt = sc.nextDouble();

        System.out.println("Enter tax code: ");
        tax_code = sc.next();

        tax_code = tax_code.toUpperCase();

        if(tax_code.equals("NRM")){
            sales_tax = 0.06;
        }
        else if(tax_code.equals("NPF")) {
            sales_tax = 0;
        }
        else if(tax_code.equals("BIZ")){
            sales_tax = 0.045;
        }

        tax_owed = sales_amt * sales_tax;
        total_amt = sales_amt + tax_owed;

        System.out.println("Customer ID: " + customer_number);
        System.out.println("Customer Name: " + name);
        System.out.println("Sales Amount: $" + formatter.format(sales_amt));
        System.out.println("Tax Code: " + tax_code);

        if(tax_owed > 0){
            System.out.println("Tax Owed: $" + formatter.format(tax_owed));
        }

        System.out.println("Total Amount Due: $" + formatter.format(total_amt));

    }
}
