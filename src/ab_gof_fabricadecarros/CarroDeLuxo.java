package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class CarroDeLuxo extends Carro {

    CarroDeLuxo(Localizacao localizacao) {
        super(CategoriaDoCarro.LUXO, localizacao);
        construct();
    }
   
    @Override
    protected void construct() {
        System.out.println("Fabricando Carro de Luxo");
        // add accessories
    }
}
