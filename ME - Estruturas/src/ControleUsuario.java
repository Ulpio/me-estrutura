import java.util.Scanner;

public class ControleUsuario { 
    static String nome, cpf;
    static int opcao = 0;
    static Pilha<Medico> pmedicos = new Pilha<Medico>();
    static Fila<Paciente> fpacientes = new Fila<Paciente>();
    
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    while (opcao != 9){
    System.out.println("+------------------------------------------------------------------------------------------+");
    System.out.println("+----------------------------------------+");
    System.out.println("|Bem vindo ao Hospital de Java do coração|");
    System.out.println("+----------------------------------------+");
    System.out.println("O que gostaria de fazer?");
    System.out.println("1 - Cadastrar Paciente");
    System.out.println("2 - Cadastrar Médico");
    System.out.println("3 - Atender Paciente");
    System.out.println("4 - Listar Medicos");
    System.out.println("5 - Listar Pacientes");
    System.out.println("9 - Encerrar atendimento");

    opcao = sc.nextInt();
    System.out.println("Opção escolhida: " + opcao);
        if (opcao == 1){
            System.out.println("Digite o nome do paciente");
            nome = sc.nextLine();
            clearBuffer(sc);
            System.out.println("Digite o CPF do paciente");
            cpf = sc.nextLine();
            fpacientes.enfileirar(new Paciente(nome, cpf));
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("+----------------------------------------+");
            System.out.println("¦    Paciente cadastrado com sucesso!    ¦");
            System.out.println("+----------------------------------------+");System.out.println();
            System.out.println();
            System.out.println();
           


        }
        else if (opcao == 2){
            System.out.println("Digite o nome do médico");
            nome = sc.nextLine();
            clearBuffer(sc);
            System.out.println("Digite o CPF do médico");
            cpf = sc.nextLine();
            pmedicos.push(new Medico(nome, cpf));
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("+----------------------------------------+");
            System.out.println("¦     Médico cadastrado com sucesso!     ¦");
            System.out.println("+----------------------------------------+");System.out.println();
            System.out.println();
            System.out.println();
        }
        else if (opcao == 3){
            Atendender(); 
        
        }
        else if (opcao == 4){
            ListarMedicos();
        
        }
        else if (opcao == 5){
            ListarPacientes();
        
        }
        else if (opcao == 9){
            System.out.println("Atendimento encerrado");    
        
        }
        else{
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("+----------------------------------------+");
            System.out.println("¦              Opçao Invalida!           ¦");
            System.out.println("+----------------------------------------+");System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.println("+-----------------------------+");
        System.out.println("¦Pacientes na fila: " + fpacientes.size()+"         ¦");
        System.out.println("|Médicos na Disponíveis: " + pmedicos.size()+"    ¦");
        System.out.println("+-----------------------------+");
    }
    }
    public static void Atendender(){
        if (fpacientes.size>0 && pmedicos.size > 0){
          pmedicos.pop();
          fpacientes.desfileirar();
          
          System.out.println("+-----------------------------------------+");
          System.out.println("|      Paciente Atendido com Sucesso      ¦");
          System.out.println("+-----------------------------------------+");
        }
        else{
            System.out.println("+----------------------------------------+");
            System.out.println("| Nao há pacientes ou médicos disponíveis |");
            System.out.println("+----------------------------------------+");
        }
      }
    public static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
    public static void ListarMedicos(){
        System.out.println("Médicos cadastrados: ");
        System.out.println(pmedicos);
    }
    public static void ListarPacientes(){
        System.out.println("Pacientes cadastrados: ");
        System.out.println(fpacientes);
    }


}




  