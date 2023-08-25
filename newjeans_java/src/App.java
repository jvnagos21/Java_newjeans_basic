import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        String groupName = "Newjeans";
        int yearFoundation = 2022;

        ArrayList<String> newJeans = new ArrayList<String>();

        newJeans.add("Hanni");
        newJeans.add("Danielle");
        newJeans.add("Hyein");
        newJeans.add("Minji");
        newJeans.add("Haerin");

        System.out.println(groupName);
        System.out.println(yearFoundation);
       if (newJeans.size()==0){
            System.out.println("nenhuma membro encontrada");
        } else {
            System.out.println(newJeans);
        }
    }
}