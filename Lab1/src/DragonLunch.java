import java.util.Vector;

public class DragonLunch {
    private static Vector<Person> hostages = new Vector<Person>();
    public static void kidnap(Person p){
        hostages.add(p);
    }
    public static String willDragonEatOrNot(){
        int t= -1;
        for(int i=0; i<hostages.size(); i++){
            if(t >= 0 && hostages.get(t).getGender() == Gender.BOY && hostages.get(i).getGender() == Gender.GIRL){
                t -= 1;
            }
            else{
                t += 1;
                hostages.set(t, hostages.get(i));
            }


        }
        while(hostages.size() > t+1){
            hostages.remove(hostages.size()-1);
        }
        if (hostages.size() == 0){
            return "No people left";
        }
        else{
            String res = "";
            for(int i=0; i<hostages.size(); i++){
                res += hostages.get(i).toString() + "\n";

            }
            return res;
        }
    }
}
