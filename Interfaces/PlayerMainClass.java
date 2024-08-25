package Interfaces;


import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}
class MP3Player implements Playable{

    @Override
    public void play() {
        System.out.println("MP3Player is playing");
    }

    @Override
    public void pause() {
        System.out.println("MP3Player is paused");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player is playing");
    }
}
class CDPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("CDPlayer is playing");
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer is paused");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer is stopped");
    }
}
class StreamingPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("StreamingPlayer is playing");
    }

    @Override
    public void pause() {
        System.out.println("StreamingPlayer is paused");
    }

    @Override
    public void stop() {
        System.out.println("StreamingPlayer is stopped");
    }
}
public class PlayerMainClass{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Playable player =null;
        System.out.println("Enter the type of player :");
        System.out.println("1---->  CDPlayer");
        System.out.println("2---->  MP3Player");
        System.out.println("3---->  Streaming Player");
        int type=scanner.nextInt();
        player=type==1? new CDPlayer():(type==2?new MP3Player():new StreamingPlayer());
        boolean flag=true;
        while (flag){
            System.out.println("Select any option :");
            System.out.println("1---->  Play");
            System.out.println("2---->  Pause");
            System.out.println("3---->  Stop");
            int option=scanner.nextInt();
            switch (option){
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    flag=false;
                    break;
                default:
                    System.out.println("Please select valid option");
                    break;
            }
        }
        scanner.close();
    }
}