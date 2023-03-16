public class Medico {
    public String nome;
    public String cpf;
    public String especialidade;

    public Medico(String nome,String cpf,String especialidade){
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
    }
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return cpf;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    
}
