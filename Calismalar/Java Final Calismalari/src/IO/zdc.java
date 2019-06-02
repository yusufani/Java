package IO;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class zdc {
    public static void main(String[] args) {
        HashMap<String , String > x =  new HashMap<>();
        LinkedList <String > y = new LinkedList<>();
        x.put("Targit ", "Carli ");
        x.put("Targit2 ", "Carli ");
        x.put("Targit3 ", "Carli ");
        x.put("Targit4 ", "Carli ");

        System.out.println(x.keySet());
        for ( String yz : x.keySet() ) {
            System.out.println(yz + x.get(yz)  );
        }
        for(Map.Entry<String, String> entry : x.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // do what you have to do here
            // In your case, another loop.
        }
    }
}
