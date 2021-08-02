import models.PingPong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
public static void main(String[] args){
//    BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
//      System.out.println("Iam a ping-pong application");
//    System.out.println("Enter a number");
//    try {
//        String stringUserNumber= bufferedReader.readLine();
//        int intUserNumber = Integer.parseInt(stringUserNumber);
//        PingPong pingPong= new PingPong();
//        ArrayList<Object> pingPongResult= pingPong.runPingPong(intUserNumber);
//        System.out.println(pingPongResult);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }

        String name="duncan Kipkogei";
        ArrayList<Character> chara= new ArrayList<>();

        for(int i=0;i<name.length();i++){
            chara.add(name.charAt(i));
        }
        for (int i=0; i<chara.size();i++){
            System.out.print(chara.get(i));
        }


}
}

