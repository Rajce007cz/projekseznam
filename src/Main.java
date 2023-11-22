import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       List<Integer> seznamCisel = new ArrayList<>();
       for (int i = 0; i<10; i++){
           Random random = new Random();
           Integer nahodneCislo = (int) (Math.random()*99+1);
           seznamCisel.add(nahodneCislo);
       for(Integer cislo : seznamCisel){
            if(cislo > 6){
                System.out.println("Cislo: "+nahodneCislo);;
            }
       }
       System.out.println(seznamCisel);
    }
    }
}