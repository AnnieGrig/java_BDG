package customer;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer);

        customer.setDiscount(8);
        System.out.println(customer);
        System.out.println("id is: " + customer.getId());
        System.out.println("name is: " + customer.getName());
        System.out.println("discount is: " + customer.getDiscount());

        Invoice invoice = new Invoice(101, customer, 888.8);
        System.out.println(invoice);

        invoice.setAmount(999.9);
        Customer invoiceCustomer = invoice.getCustomer();

        System.out.println(invoice);
        System.out.println("id is: " + invoice.getId());
        System.out.println("invoiceCustomer is: " + invoiceCustomer);
        System.out.println("amount is: " + invoice.getAmount());
        System.out.println("invoiceCustomer's id is: " + invoiceCustomer.getId());
        System.out.println("invoiceCustomer's name is: " + invoiceCustomer.getName());
        System.out.println("invoiceCustomer's discount is: " + invoiceCustomer.getDiscount());
        System.out.printf("amount after discount is: %.2f%n", invoice.getAmountAfterDiscount());
    }
}
