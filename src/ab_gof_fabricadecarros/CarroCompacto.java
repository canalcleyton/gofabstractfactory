package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class CarroCompacto extends Carro {

    CarroCompacto() {
        super(CategoriaDoCarro.COMPACTO);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Fabricando Carro Compacto");
        // add accessories
    }
}
