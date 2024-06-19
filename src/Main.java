public class Main {
    public static void main(String[] args) {

      AgendaContato agendaContato = new AgendaContato();

        System.out.println("***********************  TESTANDO PROJETO  *********************\n");

      agendaContato.adicionarContato("Dalleth", 123456);
      agendaContato.adicionarContato("Dalleth", 12);
      agendaContato.adicionarContato("Dalleth Martins", 1230001);
      agendaContato.adicionarContato("Dalleth Sousa", 123002);
      agendaContato.adicionarContato("Dalleth DEV JAVA e C# ", 125600);
      agendaContato.adicionarContato("Nathan DEV C#", 1230001);

      agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Dalleth"));

      System.out.println("Contato atualizado:  " + agendaContato.atualizarNumeroContato("Dalleth Sousa", 100200300));



    }
}