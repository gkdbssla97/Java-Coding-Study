package generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);

        ThreeDPrinter<Plastic> printerP= new ThreeDPrinter<Plastic>();
        printerP.setMaterial(new Plastic());
        Plastic plastic = printerP.getMaterial();
        System.out.println(printerP);

        printerP.printing();
    }
}
