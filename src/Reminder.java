/**
 * Created by WDRed on 29.06.2017.
 */
public class Reminder {

    String firstTask = new String();
    String secondTask = new String();
    String thirdTask = new String();
    public  Reminder(){
        firstTask = "Get the Git";
        secondTask = "Install JDK";
        thirdTask = "Create and push program";
    }
    public void Reminder(String first, String second, String third){
        firstTask = first;
        secondTask = second;
        thirdTask = third;
    }
    public void remind(){
        System.out.println(this.firstTask);
        System.out.println(this.secondTask);
        System.out.println(this.thirdTask);
    }

    public static void main(String[] args) {
        Reminder rem = new Reminder();
        rem.remind();
    }
}
