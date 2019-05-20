
public class Imovel {
    private Proprietario proprietario;
    private Data dataCompra;
    private String tipo;
    
    public Proprietario getProprietario(){
        return this.proprietario;
    }
    public Data getDataCompra(){
        return this.dataCompra;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setProprietario(Proprietario proprietario){
        this.proprietario=proprietario;
    }
    public void setDataCompra(Data dataCompra){
        this.dataCompra=dataCompra;
    } 
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void mostrar(){
        this.proprietario.mostrar();
        dataCompra.mostrar();
        System.out.println(tipo);
    }
    public boolean informarTipo(String tipo){
        this.setTipo(tipo);
        if(("casa".equals(tipo))||("apartamento".equals(tipo))||("sitio".equals(tipo)))
            return true;
        else 
            return false;
    }
}
