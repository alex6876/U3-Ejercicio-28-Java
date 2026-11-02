public class ProductoAlimenticio extends Producto {

    private double porcentajeImpuestoInterno;

    public ProductoAlimenticio(String codigo, String descripcion,
                               double costoBase, double porcentajeImpuestoInterno) {

        super(codigo, descripcion, costoBase);
        this.porcentajeImpuestoInterno = porcentajeImpuestoInterno;
    }

    @Override
    public double calcularPrecioFinal() {

        double impuesto = costoBase * porcentajeImpuestoInterno / 100;

        return costoBase + impuesto;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Impuesto interno: " + porcentajeImpuestoInterno + "%");
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}