# Paralelismo em Java
Threads na Linguagem Java
O conceito de thread está presente em Java através da classe java.lang.Thread, que é um tipo predefinido da linguagem
Java também oferece :
Mecanismos para sincronização e controle de concorrência entre threads
Classes para gerenciamento de grupos (pools) de threads
Classes da API que podem ser acessadas concorrentemente (thread-safe)

Classe Thread e interface Runnable
public class Thread extends Object implements Runnable {
  ... // Métodos da classe thread
}
public interface Runnable {
  public void run(); // Código executado por uma thread
}


Principais métodos de java.lang.Thread
Construtores: Thread(), Thread (Runnable), Thread(String), Thread(Runnable, String), ...
Método run(): contém o código executado pela Thread; herdado da interface Runnable;
implementado pela Thread ou por um objeto passado como parâmetro para seu construtor
Método start(): inicia a Thread em paralelo com a Thread que a criou, executando o código contido no método run()
