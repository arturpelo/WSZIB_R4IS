package dekorator;

interface Kawa {
    String pobierzOpis();
    double koszt();
}

class KawaPodstawowa implements Kawa{

    @Override
    public String pobierzOpis() {
        return "Kawa";
    }

    @Override
    public double koszt() {
        return 5.0;
    }
}

abstract class DodatkiDekorator implements Kawa{
    protected Kawa kawa;

    public DodatkiDekorator (Kawa kawa){
        this.kawa = kawa;
    }
    @Override
    public String pobierzOpis(){
        return kawa.pobierzOpis();
    }

    @Override
    public double koszt(){
        return kawa.koszt();
    }
}

class Mleko extends DodatkiDekorator{

    public Mleko (Kawa kawa){
        super(kawa);
    }

    @Override
    public String pobierzOpis(){
        return kawa.pobierzOpis()+", mleko";
    }

    @Override
    public double koszt(){
        return kawa.koszt() + 1.50;
    }
}

class Cukier extends DodatkiDekorator {

    public Cukier (Kawa kawa){
        super(kawa);
    }

    @Override
    public String pobierzOpis(){
        return kawa.pobierzOpis()+", cukier";
    }

    @Override
    public double koszt(){
        return kawa.koszt() + 2.0;
    }
}

class Ciastko extends DodatkiDekorator {

    public Ciastko (Kawa kawa){
        super(kawa);
    }

    @Override
    public String pobierzOpis(){
        return kawa.pobierzOpis()+", ciastko";
    }

    @Override
    public double koszt(){
        return kawa.koszt() + 12.30;
    }
}

public class Main {
    public static void main(String[] args) {
        Kawa kawa = new KawaPodstawowa();
        System.out.println(kawa.pobierzOpis() + " cena: " + kawa.koszt() +" zł.");

        kawa = new Cukier(kawa);
        System.out.println(kawa.pobierzOpis() + " cena: " + kawa.koszt() +" zł.");

        kawa = new Mleko(kawa);
        System.out.println(kawa.pobierzOpis() + " cena: " + kawa.koszt() +" zł.");

        kawa = new Ciastko(kawa);
        System.out.println(kawa.pobierzOpis() + " cena: " + kawa.koszt() +" zł.");


    }
}
