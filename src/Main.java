public class Main {

    public static void main(String[] args) {

        ProductoAlimenticio alimento = new ProductoAlimenticio(
                "A001", "Leche", 1000, 10
        );

        Electrodomestico heladera = new Electrodomestico(
                "E001", "Heladera", 500000, 21, 24
        );

        Electrodomestico televisor = new Electrodomestico(
                "E002", "Televisor", 300000, 21, 12
        );

        System.out.println("===== PRODUCTOS DE LA TIENDA =====");

        System.out.println("\n--- PRODUCTO ALIMENTICIO ---");
        alimento.mostrarInformacion();

        System.out.println("\n--- ELECTRODOMÉSTICO ---");
        heladera.mostrarInformacion();

        System.out.println("\n--- ELECTRODOMÉSTICO ---");
        televisor.mostrarInformacion();
    }
}