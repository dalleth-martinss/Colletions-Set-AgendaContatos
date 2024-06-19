import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));

    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){ // quando fizer a pesquisa vai me retornar uma set do tipo contato
        Set<Contato> contatoPorNome = new HashSet<>(); // cria um Set vazio..
        for(Contato c : contatoSet ){ // vai iterar a lista de contatos, se o nome que procuramos for igual ao nome que passamos no parametro,o metodo startsWith vai jogar dentro do Set vazio e retornar no final.
            if(c.getNome().startsWith(nome)){ // todo contato que começar com o nome que nós formos procurar ele, vai retornor varios contatos com o mesmo nome inicial com
                contatoPorNome.add(c); // adiciona o contato procurado na variavel c.
            }
        }
        return  contatoPorNome; // retorna o contato procurado.
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null; // depois que atualizar o contato é que vai ser referenciado para essa variavel que criamos
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
              c.setNumero(novoNumero);
              contatoAtualizado = c;
              break;
            }
        }
        return contatoAtualizado;
    }


}
















