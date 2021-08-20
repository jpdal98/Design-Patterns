# Padrões_Comportamentais
Servem para designar responsabilidades entre os objetos do algoritmo.

## Quando devemos usar o Chain of Responsability? 
Quando queremos evitar a dependência entre um objeto receptor e um objeto solicitante.

## Quando devemos usar o Memento?
Qunado você deseja salvar e restaurar o estado anterior de um objeto sem revelar os detalhes de sua implementação.
 
## Quando devemos usar o Command?
Quando você quer parametrizar objetos com operações, quando você quer colocar operações em fila, agendar sua execução, ou executá-las remotamente, ou, quando você quer implementar operações reversíveis. 

## Quando devemos usar o Iterator?
Quando você deseja reduzir a duplicação de código de travessia em sua aplicação, ou, quando sua coleção tiver uma estrutura de dados complexa por debaixo dos panos, mas você quer esconder a complexidade dela de seus clientes

## Quando devemos usar o Observer?
Quando precisar que alguns objetos em sua aplicação observem outros, mas apenas por um tempo limitado ou em casos específicos, ou, quando mudanças no estado de um objeto acarretarem na possível mudança de outros objetos, e o atual conjunto de objetos é desconhecido de antemão ou muda dinamicamente.

## Quando devemos usar o State?
Quando você tem um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o número de estados é enorme, e quando o código estado específico muda com frequência.

## Quando devemos usar o Strategy?
Quando você quer usar diferentes variantes de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução, ou, quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.

## Quando devemos usar o Template Method?
Quando você deseja que apenas etapas particulares do algoritmo seja entendivel, mas não todo o algoritmo e sua estrutura.
