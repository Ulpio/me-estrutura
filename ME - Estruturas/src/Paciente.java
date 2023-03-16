class Paciente {
    public String nome;
    public String cpf;
    public String procedimento;
    
    public Paciente(String nome, String cpf, String procedimento) {
      this.nome = nome;
      this.cpf = cpf;
      this.procedimento = procedimento;
    }
    
    public String getNome() {
      return nome;
    }
    
    public String getCpf() {
      return cpf;
    }
    
    public String getProcedimento() {
      return procedimento;
    }
  }
  