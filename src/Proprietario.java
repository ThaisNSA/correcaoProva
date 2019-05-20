
public class Proprietario {
    private String nome;
    private Data dataDeNascimento;
    
    public String getNome(){
        return this.nome;
    }
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setDataDeNascimento(Data dataDeNascimento){
        this.dataDeNascimento=dataDeNascimento;
    }
    public void mostrar(){
        System.out.println(nome);
        dataDeNascimento.mostrar();
    }
}
