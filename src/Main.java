public class Main {
    public static void main(String[] args) {
        int ticketPrice = 4999; // цена билета, руб.
        int milePrice = 20; // цена бонусной мили, руб.
        int milesQuantity = ticketPrice / milePrice;
        System.out.println("Количество бонусных миль:");
        System.out.println((milesQuantity) + " шт");
    }
}
