import java.util.Scanner;

public class ControleUsuario { 
    static String nome, cpf;
    static int opcao;
    static Pilha<Medico> pmedicos = new Pilha<Medico>();
    static Fila<Paciente> fpacientes = new Fila<Paciente>();
    
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("+----------------------------------------+");
    System.out.println("|Bem vindo ao Hospital de Java do coração|");
    System.out.println("+----------------------------------------+");

    System.out.println("O que gostaria de fazer?");
    System.out.println("1 - Cadastrar Paciente");
    System.out.println("2 - Cadastrar Médico");
    System.out.println("3 - Atender Paciente");
    opcao = sc.nextInt();
    System.out.println("Opção escolhida: " + opcao);
        if (opcao == 1){
            System.out.println("Digite o nome do paciente");
            nome = sc.nextLine();
            clearBuffer(sc);
            System.out.println("Digite o CPF do paciente");
            cpf = sc.nextLine();
            fpacientes.enfileirar(new Paciente(nome, cpf));
        }
        else if (opcao == 2){
            System.out.println("Digite o nome do médico");
            nome = sc.nextLine();
            sc.next();
            System.out.println("Digite o CPF do médico");
            cpf = sc.nextLine();
            pmedicos.push(new Medico(nome, cpf));
        }
        else if (opcao == 3){
            Atendender(); 
        
        }
        else{
            System.out.println("Opção inválida");
        }
        System.out.println("Pacientes na fila: " + fpacientes.size());
    }
      public static void Atendender(){
          pmedicos.pop();
          fpacientes.desfileirar();
      }
      public static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

  }
}




  