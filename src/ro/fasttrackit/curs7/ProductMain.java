package ro.fasttrackit.curs7;

public class ProductMain {
    public static void main(String[] args){
        Product product1 = new Product("Perie", 20.50, 5, "Ingrijire personala");
        System.out.println(product1.getName()+ " " + product1.getPrice()+ " " + product1.getQuantity()+ " " + product1.getCategory());
        Product product2 = new Product("Paste", 10.75, 3, "Alimente");
        System.out.println(product2.getName()+ " " + product2.getPrice()+ " " + product2.getQuantity()+ " " + product2.getCategory());
        Product product3 = new Product("Stergatoare", 245.15, 1, "Auto");
        System.out.println(product3.getName()+ " " + product3.getPrice()+ " " + product3.getQuantity()+ " " + product3.getCategory());
    }
}
