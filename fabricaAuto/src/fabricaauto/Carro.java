package fabricaauto;

public class Carro extends Automovel {
    private int tetoSolar;
    private int aberto;
    
    public Carro (String cor, String placa, String modelo){
        super(cor, placa, modelo);
        this.tetoSolar = 0;
        this.aberto = 0;
    }
    public void abrirFechar(){
        if (aberto ==0){
            aberto= 1;
            System.out.println("Carro está aberto.");
        }else{
            aberto = 0;
            System.out.println("Carro está fechado");
        }
    }
    public int getTetoSolar(){
        return tetoSolar;
    }
    public void setTetoSolar(int tetoSolar){
        this.tetoSolar = tetoSolar;
    }
    public int getAberto(){
        return aberto;
    }
    public void setAberto(int aberto){
        this.aberto = aberto;
    }
}
