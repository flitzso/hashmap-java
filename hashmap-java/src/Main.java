import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> carros = new HashMap<Integer,String>();

        carros.put(1, "Polo");
        carros.put(2, "HRV");
        carros.put(3, "Golf");
        carros.put(4, "Camaro");
        carros.put(5, "Mustang");
        carros.put(6, "Cruze");

        System.out.println(carros);

        carros.clear();
        //carros.remove(5);
        //A baixo obtem uma chave especifica
        //System.out.println(carros.get(1));
        //A baixo usando for
        //for(int i=1;i< carros.size()+1;i++){
        //    System.out.println(carros.get(i));
        //}
        //A baixo usando o for it
        for(String c: carros.values()){
            System.out.println(c);
        }
    }
}