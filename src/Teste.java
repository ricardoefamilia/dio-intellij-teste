import model.PessoaFisica;
import model.PessoaJuridica;
import model.Livro;

/*
@author Ricardo Lima Amaral
 */
public class Teste {
    public static void main(String[] args) {
        System.out.println("Mais um teste.");

        PessoaFisica pf = new PessoaFisica();
        pf.setId(1L);
        pf.setNome("Ricardo Amaral");
        pf.setCpf("111.222.333-44");
        pf.setIdade(51);
        pf.setTelefone("61-5555-0099");

        System.out.println(pf.toString());


        System.out.println();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(2L);
        pj.setNome("X-Tudo");
        pj.setTelefone("61-77777-8888");
        pj.setCnpj("12.1234.333/0001-55");
        pj.setRepresentante("Feliciano Gomes");

        System.out.println(pj.toString());

        Livro livro = new Livro("Se meu fusca falasse", 350);
        System.out.println(livro);

    }

}
