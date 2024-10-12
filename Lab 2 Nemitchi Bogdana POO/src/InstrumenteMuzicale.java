public class InstrumenteMuzicale {
    private String tipInstrument;
    private String material;
    private String tipSunet;
    private int anFabricatie;
    private double pret; //milioane dolari, mii dolari

    public InstrumenteMuzicale(String tipInstrument,String material, String tipSunet, int anFabricatie, double pret) {
        this.tipInstrument = tipInstrument;
        this.material = material;
        this.tipSunet = tipSunet;
        this.anFabricatie = anFabricatie;
        this.pret = pret;
    }
   //
    public void setTipInstrument(String tipInstrument) {
        this.tipInstrument = tipInstrument;
    }
    public String getTipInstrument() {
        return tipInstrument;
    }
    //
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    //
    public void setTipSunet(String tipSunet) {
        this.tipSunet = tipSunet;
    }
    public String getTipSunet() {
        return tipSunet;
    }
    //
    public int getAnFabricatie() {
        return anFabricatie;
    }
    //
    public void setPret(double pret) {
        this.pret = pret;
    }
    public double getPret() {
        return pret;
    }

    public String toString() {
        return "InstrumenteMuzicale [tipInstrument=" + tipInstrument +
                ", material=" + material + "," +
                " tipSunet=" + tipSunet +
                ", anFabricatie=" + anFabricatie +
                ", pret=" + pret +
                "]";

    }
}
