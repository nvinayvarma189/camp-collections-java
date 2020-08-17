package remover;

import java.util.*;
import java.util.stream.Collectors;

class RemoveOggy {
    public static void removeOggy(ArrayList<String> names) {
        
        Iterator itr = names.iterator(); //initialise an iterator object
        while (itr.hasNext()) 
        { 
            String nameToBeRemoved = (String)itr.next();
            if (nameToBeRemoved.indexOf("oggy") !=-1 ) 
                itr.remove(); 
        }
        return;
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}
