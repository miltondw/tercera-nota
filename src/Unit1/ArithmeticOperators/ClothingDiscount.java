package Unit1.ArithmeticOperators;

/*
 * 
 Una tienda de ropa está ofreciendo una promoción en la que se aplica un descuento del 15% sobre el precio original de cada prenda. Si una camiseta cuesta $25 y un pantalón cuesta $30, ¿Cuál será el precio total de ambas prendas después de aplicar el descuento? Además, si se compra una segunda camiseta, se aplica un descuento adicional del 5% sobre el precio ya descuento de la primera camiseta.
 * 
 */
public class ClothingDiscount {
    public static void main(String[] args) {
        double shirtPrice = 25;
        double pantsPrice = 30;
        double discount = 0.15;
        double extraDiscount = 0.05;

        double shirtDiscounted = shirtPrice * (1 - discount);
        double pantsDiscounted = pantsPrice * (1 - discount);
        double total = shirtDiscounted + pantsDiscounted;

        System.out.println("Precio camiseta con 15% descuento: $" + shirtDiscounted);
        System.out.println("Precio pantalón con 15% descuento: $" + pantsDiscounted);
        System.out.println("Total por una camiseta y un pantalón: $" + total);

        double secondShirtDiscounted = shirtDiscounted * (1 - extraDiscount);
        double totalWithSecondShirt = pantsDiscounted + shirtDiscounted + secondShirtDiscounted;

        System.out.println("Precio segunda camiseta con 15% más 5% descuento: $" + secondShirtDiscounted);
        System.out.println("Total con dos camisetas y un pantalón: $" + totalWithSecondShirt);
    }
}
