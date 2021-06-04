package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class CarroSedan extends Carro {

    CarroSedan() {
        super(CategoriaDoCarro.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Fabricando Carro do Tipo Sedan");
        // adicionar acessorios
    }
}
