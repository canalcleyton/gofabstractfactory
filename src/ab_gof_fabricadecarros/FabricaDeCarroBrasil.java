package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class FabricaDeCarroBrasil {

    public static Carro fabricarCarro(CategoriaDoCarro model) {
        Carro carro = null;
        switch (model) {
            case COMPACTO:
                carro = new CarroCompacto();
                carro.setLocation(Localizacao.BRASIL);
                break;

            case SEDAN:
                carro = new CarroSedan();
                carro.setLocation(Localizacao.BRASIL);
                break;

            case LUXO:
                carro = new CarroDeLuxo();
                carro.setLocation(Localizacao.BRASIL);
                break;

            default:
                //lançar alguma exceção Localizacao
                break;
        }
        return carro;
    }
}
