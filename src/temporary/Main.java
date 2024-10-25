package temporary;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List lista = new ArrayList();


        Czlowiek czlowiek = new Czlowiek() {
            @Override
            public void spij(int czas) {
                System.out.println("Ide spać");
            }
        };
    }




}
