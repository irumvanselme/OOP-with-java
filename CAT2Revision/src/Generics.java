import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) throws Exception{

        try{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(4);
            list.add(43);
            list.add(234);
            list.add(4);
            list.remove(2);

            if(list.size() > 10){
                throw new FileNotFoundException();
            };

            System.out.println(list.size());
        } catch (FileNotFoundException ignored){

        }
    }
}
