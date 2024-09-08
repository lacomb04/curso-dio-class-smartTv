public class SmartTv {
    public boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public int getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }

    public void aumetarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }


}
