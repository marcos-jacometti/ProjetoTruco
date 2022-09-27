import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Jogadores;
import model.Truco;

public class JogoTruco {
    public List<Jogadores> lista = new ArrayList<>();
    private Truco tr = new Truco();
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        JogoTruco jt = new JogoTruco();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            opc = menu(jt, sc);
        }while(opc!=4);
    }

    private static int menu(JogoTruco jt, Scanner sc){
        int opc;
        System.out.println("*** TRUCO DE MARRECO ***");
        System.out.println("1. Cadastrar os Marrecos");
        System.out.println("2. Jogar truco");
        System.out.println("3. Listar marrecos");
        System.out.println("4. Sair");
        System.out.println("Digite sua opcao: ");
        opc = Integer.parseInt(sc.nextLine());

        switch(opc){
            case 1:
                jt.execCadastrar(sc);
            break;

            case 2:
                jt.execCartas();
            break;

            case 3:
                jt.execJogadores();
            break;

            case 4:
                System.out.println("Fim da trucada");
            break;

            default:
                System.out.println("Opcao nao encontrada");
        }
        return opc;
    }

    public void execCadastrar(Scanner sc){
        Jogadores jogador = new Jogadores();
        System.out.println("Digite o nome do marreco 1: ");
        jogador.setNome(sc.nextLine());

        System.out.println("Digite o id do marreco 1: ");
        jogador.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o nome do marreco 2: ");
        jogador.setNome2(sc.nextLine());

        System.out.println("Digite o id do marreco 2: ");
        jogador.setId2(Integer.parseInt(sc.nextLine()));

        lista.add(jogador);
    }

    public void execCartas(){
        boolean jogador = lista.isEmpty();
        if(jogador == true){
            System.out.println("Nao encontramos nenhum marreco, por favor cadastre-os");
            System.out.println();
        }else{
            System.out.println(Truco.menu(tr, sc));
        }
    }

    public void execJogadores(){
        for(Jogadores i : lista){
            System.out.println(i.toString());
        }
    }
}