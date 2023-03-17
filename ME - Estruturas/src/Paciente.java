class Paciente {
    public String nome;
    public String cpf;
    
    public Paciente(String nome, String cpf) {
      this.nome = nome;
      this.cpf = cpf;
    }
    
    public String getNome() {
      return nome;
    }
    public String setNome(String nomes){
        return this.nome = nomes;
    }
    public String getCpf() {
      return cpf;
    }
    public String setCpf(String cpfs){
        return this.cpf = cpfs;
    }

}
  