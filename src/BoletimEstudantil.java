public class BoletimEstudantil {
    public static void main(String[] args) {
        System.out.println("Boletim Estudantil");
        String nome = "Gustavo";
        int nota1 = 10;
        int nota2 = 9;

        double media = (nota1 + nota2) / 2;

        //sem identação - tambem funciona, porem nao é uma boa pratica.
        /*if(media > 7) {
        System.out.println("O aluno " + nome + " foi aprovado com média " + media);
        } else if(media == 7) {
        System.out.println("O aluno " + nome + " vai para prova final com média " + media);
        } else {
        System.out.println("O aluno " + nome + " foi reprovado com média " + media);
        }*/

        //com identação - boa pratica.
        if(media > 7) {
            System.out.println("O aluno " + nome + " foi aprovado com média " + media);
        } else if(media == 7) {
            System.out.println("O aluno " + nome + " vai para prova final com média " + media);
        } else {
            System.out.println("O aluno " + nome + " foi reprovado com média " + media);
        }
    }
}
