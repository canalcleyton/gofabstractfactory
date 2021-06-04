package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class AppCarroAbstractFactoryGoF {

    public static void main(String[] args) {
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.COMPACTO, "BRASIL"));
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.SEDAN, "ASIA"));
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.LUXO, "PADRAO"));
    }
    
}
