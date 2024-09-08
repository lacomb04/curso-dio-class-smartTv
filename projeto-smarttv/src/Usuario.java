public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumetarCanal();

        System.out.println("Está ligada: " + tv.ligada);
        System.out.println("Canal Atual: " + tv.getCanal());
        System.out.println("Volume Atual: " + tv.getVolume());

        tv.diminuirVolume();
        tv.escolherCanal(34);

        
        System.out.println("Canal Atual: " + tv.getCanal());
        System.out.println("Volume Atual: " + tv.getVolume());

    }
}
