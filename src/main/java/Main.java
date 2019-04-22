public class Main {

    public static void main (String [] args){

        System.out.println("*********************************");
        System.out.println("");
        System.out.println("---------------------------------");

        Vendible fiatUno = new FiatUno();
        System.out.println("Normal:");
        imprimirVendible(fiatUno);

        fiatUno = new CdPlayer(fiatUno);
        System.out.println("Con componentes:");
        imprimirVendible(fiatUno);

        System.out.println("---------------------------------");
        System.out.println("Normal:");
        Vendible fordFiesta = new FordFiesta();
        imprimirVendible(fordFiesta);

        fordFiesta = new AireAcondicionado(fordFiesta);
        fordFiesta = new CdPlayer(fordFiesta);
        fordFiesta = new MP3Player(fordFiesta);

        System.out.println("Con componentes:");
        imprimirVendible(fordFiesta);

        System.out.println("");
        System.out.println("*********************************");

    }

    public static void imprimirVendible(Vendible vendible) {
        System.out.println(vendible.getDescripcion());
        System.out.println(vendible.getPrecio());
        System.out.println("---------------------------------");
    }

}
