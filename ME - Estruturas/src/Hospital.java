public class Hospital { 
  public static void main(String[] args)
  {
    Pilha<Medico> medicos = new Pilha<Medico>();
    Fila<Paciente> pacientes = new Fila<Paciente>();

    medicos.push(new Medico("João", "123.456.789-00"));
    medicos.push(new Medico("Maria", "987.654.321-00"));
    pacientes.enfileirar(new Paciente("Maria", "987.654.321-00"));
    pacientes.enfileirar(new Paciente("José", "123.456.789-00"));


    System.out.println("Médico: " + medicos.peek().getNome());
    System.out.println("Paciente: " + pacientes.getTopo().getNome());
    medicos.pop();
    pacientes.desfileirar();





    
  }
}