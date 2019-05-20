
public class Teste {
    public static void main(String[] args){
        
        Proprietario p= new Proprietario();
        p.setNome("Thais");
        Data d= new Data();
        d.setDia(29);
        d.setMes(03);
        d.setAno(1996);
        p.setDataDeNascimento(d);
        
        Imovel i= new Imovel();
        i.setProprietario(p);
        Data d2= new Data();
        d2.setDia(30);
        d2.setMes(04);
        d2.setAno(2019);
        i.setDataCompra(d2);
        
        i.informarTipo("casa");
        p.mostrar();
        i.mostrar();
        
    }
}
