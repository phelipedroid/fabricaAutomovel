package fabricaauto;

public class Automovel {
    private String cor;
    private String placa;
    private String modelo;
    private boolean ligado;
    private boolean movimento;
    
    public Automovel (String cor, String placa, String modelo){
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = false;
        this.movimento = false;               
                
    }
    public void ligar(){
        if(ligado == true){
            System.out.println("O Automovel foi ligado.");
        }else{
            System.out.println("O automóvel já está ligado.");
        }
    }
    public void mover(){
        if (ligado && !movimento){
            movimento = true;
            System.out.println("O automóvel está em movimento.");
        }else if (ligado){
            System.out.println("Não é possível movimentar o automóivel, ele está delisgado.");
        }else{
                System.out.println("O atutomóvel já está em movimento");
        }
    }
    public void parar(){
        if (movimento){
            movimento = false;
            System.out.println("O automóvel foi parado.");
        }else{
            System.out.println("O automóvel já está parado.");
        }
    }
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean isMovimento() {
        return movimento;
    }
     public boolean isligado() {
        return ligado;
    }
}