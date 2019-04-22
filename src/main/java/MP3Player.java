public class MP3Player extends AutoDecorator {

    public MP3Player(Vendible vendible) {
        super(vendible);
    }

    public String getDescripcion() {
        return getVendible().getDescripcion() + " + MP3 Player";
    }

    public int getPrecio() {
        return getVendible().getPrecio()+250;
    }
}
