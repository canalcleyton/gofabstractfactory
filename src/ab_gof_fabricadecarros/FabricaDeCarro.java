package ab_gof_fabricadecarros;

/**
  * @aprimorado por Prof Cleyton P. Santos
  * Fonte: https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
 */
public abstract class FabricaDeCarro {

    private FabricaDeCarro() {
        //Prevenção de Instanciação
    }
    
    //FabricaDeCarro.fabricarCarro(CategoriaDoCarro.COMPACTO, "ASIA"); (COMPACTO, SEDAN, LUXO)
    public static Carro fabricarCarro(CategoriaDoCarro type) {
        Carro carro = null;
        Localizacao localizacao = Localizacao.ASIA; //localizacao pode ser personalizada de outro local
        switch (localizacao) {
            case BRASIL:
                carro = FabricaDeCarroBrasil.fabricarCarro(type);
                break;
            case ASIA:
                carro = FabricaDeCarroASIA.fabricarCarro(type);
                break;
            default:
                carro = FabricaDeCarroPadrao.fabricarCarro(type);
        }
        return carro;
    }
}
