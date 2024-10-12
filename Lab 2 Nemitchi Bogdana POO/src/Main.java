public class Main {
    public static void main(String[] args) {

        InstrumenteMuzicale vioara= new InstrumenteMuzicale("vioara", "lemn", "acut", 1721, 15.9);
        InstrumenteMuzicale saxofon= new InstrumenteMuzicale("saxofon", "alama", "mediu spre acut", 1954, 5000);
        InstrumenteMuzicale tobe= new InstrumenteMuzicale("tobe", "fag", "grav", 1960, 1500);



        System.out.println(vioara);
        System.out.println(saxofon);
        System.out.println(tobe);

    }

}