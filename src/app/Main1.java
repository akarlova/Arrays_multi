package app;

public class Main1 {
    public static void main(String[] args) {

        String[][] products = {
                { "orange", "rice", "mango" },
                { "milk", "bread", "apple" },
                { "kiwi", "tomato", "cheese" }
        };

        // Перебір за допомогою циклу for-each
        for (String[] prods1 : products) {
            for (String prod : prods1) {
                System.out.print(prod + "\t");
            }
            // Перехід на новий рядок
            System.out.println();
        }

    }
}
