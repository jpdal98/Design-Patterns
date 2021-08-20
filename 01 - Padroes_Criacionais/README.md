# Padrões_Criacionais
Os padrões criacionais servem para fornecer mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização do código existente.

## Quando devemos usar o Factory Method? 
Quando queremos desacoplar o código das classes concretas e receber uma instância sem a necessidade de instanciar o objeto concreto.

## Quando devemos usar o Abstract Factory?
Quando voce precisar produzir "familias" de objetos relacionados sem ter que especificar suas classes concretas.

## Quando devemos usar o Singleton?
Uma classe for utilizada com frequência por várias partes distintas do sistema, e essa classe não gerencia nenhum estado da aplicação.

## Quando devemos usar o Monostate?
Quando você deseja que a natureza singular da classe seja transparente para os usuários ou quando deseja empregar derivados polimórficos do objeto único.

## Quando devemos usar o Builder?
Quando o processo de construção de um objeto é considerado complexo e também quando se trata da construção de representações múltiplas de uma mesma classe

## Quando devemos usar o Prototype?
Quando precisamos criar instâncias de uma classe e essa tarefa acaba sendo demorada/custosa e complexa de algum modo. Então, no lugar de criar várias instâncias, criamos cópias da  instância original e usamos de acordo com as necessidades.
