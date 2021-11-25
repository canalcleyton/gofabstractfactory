package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class FabricaDeCarroPadrao {

    public static Carro fabricarCarro(CategoriaDoCarro model) {
        Carro carro = null;
        switch (model) {
            case COMPACTO:
                carro = new CarroCompacto(Localizacao.PADRAO);
                break;

            case SEDAN:
                carro = new CarroSedan(Localizacao.PADRAO);
                break;

            case LUXO:
                carro = new CarroDeLuxo(Localizacao.PADRAO);
                break;

            default:
                //lançar alguma exceção Localizacao.PADRAO
                break;
        }
        return carro;
    }
}
