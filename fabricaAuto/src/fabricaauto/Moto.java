package fabricaauto;

public class Moto extends Automovel {
private int abs;
private int bau;

public Moto(String cor, String placa, String modelo){
    super(cor, placa, modelo);
    this.abs = 0;
    this.bau = 0;
}
public void alarme(){
        System.out.println("O alarme está ativado.");
    }
public int getabs(){
    return abs;
}
public int setabs(int abs){
    this.abs = abs;
    return 0;
}
public int getbau(){
    return bau;
}
public void setbau(int bau){
    this.bau = bau;
}
}
