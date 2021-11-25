package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class CarroSedan extends Carro {

    CarroSedan(Localizacao localizacao) {
        super(CategoriaDoCarro.SEDAN, localizacao);
        construct();
    }

    
    @Override
    protected void construct() {
        System.out.println("Fabricando Carro do Tipo Sedan");
        System.out.println("Acessorio 1: Preparação para som");
        System.out.println("Acessorio 2: Travas eletricas");
        System.out.println("Acessorio 3: Computador de Bordo");
        // adicionar acessorios
    }
}
