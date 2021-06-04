# GoF Abstract Factory
Padrão de Projeto Abstract Factory em Java - Fabrica de Carros

**Padrão Abstract Factory**

**Objetivo do Padrão Abstract Factory**

Prover uma interface para criar uma família de objetos relacionados ou
dependentes sem especificar suas classes concretas.

**Premissas e Características de Uso**

-   Isolar a criação e o uso de um objeto;

-   Criar famílias de objetos sem que isso represente uma dependência destes com suas classes concretas;

-   Permitir que em tempo de execução haja a troca de objetos concretos, sem que seja necessário alterar o código que estes usam;

-   No Factory Method um método de criação de objeto é invocado na classe principal, sabendo qual classe deve ser instanciada, porém no Abstract Factory é regra que a classe principal não saiba onde serão criados os objetos;

-   Este padrão possui um objeto (uma Abstract Factory) e usa este objeto para chamar os métodos de criação;

-   Dependendo do tipo de referência para ser enviado para a instanciação de um objeto, o objeto resultante poderá ser totalmente diferente;

**Detalhamento**

O uso deste padrão implica em isolar a criação de objetos de seu uso e
criar famílias de objetos relacionados sem ter que depender de suas
classes concretas. Isto permite que novos tipos derivados sejam
introduzidos sem qualquer alteração no código que usa a classe base. Ao
empregar este padrão é possível trocar implementações concretas sem
alterar o código que estas usam, mesmo em tempo de execução. No entanto,
o emprego deste padrão, como acontece com outros padrões semelhantes,
pode resultar em uma complexidade desnecessária e trabalho extra no
início do código. Além disso, os níveis mais elevados de abstração podem
resultar em sistemas que são mais difíceis de manter. A essência do
padrão Abstract Factory é fornecer uma interface para criar famílias de
objetos relacionados ou dependentes sem especificar suas classes
concretas.

Uma fábrica abstrata declara métodos de criação de objetos do tipo
ProdutoAbstrato, que são implementados por uma classe do tipo
FabricaConcreta, que estende ou implementa a FabricaAbstrata.

Apesar de um produto abstrato poder ser implementado em uma classe
abstrata ou declarado em uma interface para ser implementado em uma
classe concreta, a classe abstrata é utilizada com maior frequência.

Assim, um produto abstrato declara os métodos que são implementados por
classes do tipo ProdutoConcreto. FabricaConcreta cria internamente um
objeto do tipo ProdutoConcreto, mas esse objeto é retornado como um
ProdutoAbstrato.O Abstract Factory não sabe qual ProdutoConcreto está
sendo criado, mas sabe quais métodos do produto ele pode utilizar.

Uma fabrica concreta pode estender ou implementar a FabricaAbstrata. O
objetivo dessa classe é implementar os métodos declarados em
FabricaAbstrata, criando um objeto do tipo ProdutoConcreto e
retornando-o como um ProdutoAbstrato. Isso é polimorfismo. É comum
existir mais de uma classe do tipo ProdutoConcreto assim como ocorre com
FabricaConcreta. A quantidade de classes do tipo FabricaConcreta está
diretamente ligada com a quantidade de classes do tipo ProdutoConcreto.

Um produto concreto pode estender ou implementar a classe
ProdutoAbstrato. Nessa classe são implementados os métodos declarados em
ProdutoAbstrato. Essa é a classe que faz uma instância concreta ser
criada. Para cada FabricaConcreta, há pelo menos um ProdutoConcreto.

**Fontes:**

Look-and-feel de GUIs/4Nixs

[<u>http://www.dsc.ufcg.edu.br/\~jacques/cursos/map/html/pat/abstractfactory.htm</u>](http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/abstractfactory.htm)

Padrões de Projeto e e-Book(comprado)

[<u>https://refactoring.guru/pt-br/design-patterns</u>](https://refactoring.guru/pt-br/design-patterns)
