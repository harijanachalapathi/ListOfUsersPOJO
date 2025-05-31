package pack1;

import java.util.ArrayList;
import java.util.List;

public class AddUsers {

	public static void main(String[] args) {
		    
         List<userPojo> userlist = new ArrayList<>();
         userPojo u1 = new userPojo("a", 9887);
          System.out.println(u1.contact + " "+u1.name);
	}

}
