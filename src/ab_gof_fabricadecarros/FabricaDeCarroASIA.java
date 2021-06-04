package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public class FabricaDeCarroASIA {

    public static Carro fabricarCarro(CategoriaDoCarro model) {
        Carro car = null;
        switch (model) {
            case COMPACTO:
                car = new CarroCompacto(Localizacao.ASIA);
                break;

            case SEDAN:
                car = new CarroSedan(Localizacao.ASIA);
                break;

            case LUXO:
                car = new CarroDeLuxo(Localizacao.ASIA);
                break;

            default:
                //lançar alguma exceção Localizacao
                break;
        }
        return car;
    }
}
