package fabricaauto;
public class FabricaAuto {    
    public static void main(String[] args) {        
Automovel automovel = new Automovel("Vermelho", "ABC123", "Sedan");

        automovel.ligar();
        automovel.mover();
        automovel.parar();

        System.out.println("Cor: " + automovel.getCor());
        System.out.println("Placa: " + automovel.getPlaca());
        System.out.println("Modelo: " + automovel.getModelo());
        System.out.println("Ligado: " + automovel.isligado());
        System.out.println("Em Movimento: " + automovel.isMovimento());

        Carro carro = new Carro("Preto", "HJV-6623", "Fastback");

        carro.abrirFechar();

        System.out.println("Teto Solar: " + carro.getTetoSolar());
        System.out.println("Carro Aberto: " + (carro.getAberto() == 1 ? "Sim" : "Não"));

        Moto moto = new Moto("Preto", "DEF456", "Esportiva");

        moto.alarme();

        System.out.println("Freio ABS: " + moto.getabs());
        System.out.println("Tem Baú: " + (moto.getbau() == 1 ? "Sim" : "Não"));
    }
}