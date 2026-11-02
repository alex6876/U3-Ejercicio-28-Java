public class Electrodomestico extends Producto {

    private double porcentajeImpuesto;
    private int garantiaMeses;

    public Electrodomestico(String codigo, String descripcion,
                            double costoBase, double porcentajeImpuesto,
                            int garantiaMeses) {

        super(codigo, descripcion, costoBase);
        this.porcentajeImpuesto = porcentajeImpuesto;
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecioFinal() {

        double impuesto = costoBase * porcentajeImpuesto / 100;

        double recargoGarantia = costoBase * 0.02 * garantiaMeses / 12;

        return costoBase + impuesto + recargoGarantia;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Impuesto: " + porcentajeImpuesto + "%");
        System.out.println("Garantía: " + garantiaMeses + " meses");
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}