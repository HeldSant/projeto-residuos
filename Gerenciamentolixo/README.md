## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

relatório
o programa adiciona os objetos(residuos) criados como garrafapet em uma lixeira e mostra uma lista dos residuos nesta lixeira mostrando nome tipo e peso de cada objeto. Os objetos estanciados por residuoreciclavel na lixeira serão reciclados os que não forem reciclaveis dentro da lixeira mostrarão uma mensagem de residuo invalido.


classes e objetos: as classes residuo, residuoorganico, residuoreciclavel e lixeira instanciam e criam objetos que são os residuos tratados como o obejto banana.

emcapsulamento: uso de private e public nas classes para proteger metodos e metodos getter nas classes residuo, residuoorganico e residuoreciclavel para acessar atributos.

herança: o residuoorganico e residuo reciclavel herdam de resido para utilizar seus metodos.

polimorfismo: residuo recilcavel implementa a interface reciclavel para terem um compotamento expecifico. uso da classe abstrata residuo quem tem metodo abstrato getter implementado nas subclasses.

sobrecarga: pode adicionar residuos com o mesmo nome mas com peso diferente, parametros diferentes.
sobreescrita: o gettipo() nas classes residuoorganico e residuoreciclavel.

classe abstrata: residuo é uma classe abstrata e compartilha metodos e parametros.
interface: reciclvel é um interface que é implementada por residuoreciclavel

coleções: usado List na classe lixeira para listar residuos.

exeções: tiporesiduoinvalidoexception é uma exceção personalizada usado no metodo adicionarresiduoinvalido.

