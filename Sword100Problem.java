import java.util.ArrayList;
import java.util.List;

public class Sword100Problem {

	
	public static void main(String[] args) {
		List<Gunman> gunmen = new ArrayList<>(100);
		
		// Build the linked list having 100 positions
		for(int i = 1; i <= 100; i++) {
            gunmen.add(new Gunman(i));
        }
		
        while(gunmen.size() > 1) {
            for(int i = 0; i < gunmen.size(); i++) {
                Gunman killer = gunmen.get(i);
                Gunman killed = gunmen.remove((i + 1) % gunmen.size());
                System.out.println(killer.getNumber() + " kills " + killed.getNumber());
            }
        }
        System.out.println("Final  - " + gunmen.get(0).getNumber());
	}	
}


