package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class AppCarroAbstractFactoryGoF {

    public static void main(String[] args) {
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.COMPACTO));
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.SEDAN));
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.LUXO));
    }
    
}
