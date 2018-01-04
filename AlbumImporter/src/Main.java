
public class Main{

    public enum LogType{
        INFO,
        WARNING,
        ERROR,
    }

    public static void main(String args[]){

        GUI gui = new GUI();
        for (int i = 0; i < 10; i++){
            gui.UpdateLog(Integer.toString(i));
        }
    }

}