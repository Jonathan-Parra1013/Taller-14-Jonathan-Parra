public class Main {
    public static void main(String[] args) {
        // Paso 5: las combinaciones se arman al crear el objeto, como capas de cebolla
        Arepa[] pedido = {
            new ArepaBase(),
            new Queso(new ArepaBase()),
            new Huevo(new Queso(new ArepaBase())),
            new Chorizo(new Huevo(new Queso(new ArepaBase()))),
            new Aguacate(new Queso(new Queso(new ArepaBase())))   // doble queso
        };
        for (Arepa a : pedido) {
            System.out.printf("%-42s $%.0f%n", a.descripcion(), a.precio());
        }
    }
}
