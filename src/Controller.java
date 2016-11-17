/**
 * Created by anush on 11/17/2016.
 */

import java.util.HashMap;p
    import java.util.*;
    public class Controller{

        HashMap hm = new HashMap<Integer,Command>();
        int mode=0;

        Controller(){
        }

        public void setCommand(int buttonNo, Command command){
            hm.put(buttonNo,command);
        }

        public void execute(int buttonNo){
            Command command1=(Command)hm.get(buttonNo);
            command1.execute();
        }

        public void setMode(int mode){
            this.mode=mode;
            System.out.println("VERBOSE: ");
        }
    }
}
