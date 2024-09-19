package ClassAndObjects;

import java.util.ArrayList;
import java.util.List;

public class Team{
    String name;
    String city;
    String division;
    List<Player> playersList;

    Team(String name,String city,String division){
        this.name=name;
        this.city=city;
        this.division=division;
        playersList=new ArrayList<Player>();
    }
    void playGame(){
        System.out.println("The team "+name+" is going to play the match");
    }
    void hireCoach(){
        System.out.println("The team "+name+" is going to hire a coach");
    }
    public static void main(String[] args){
        Team wizards=new Team("Wizards","Chennai","First");
        Player  player1=new Player("Aravind",10,"Forward");
        wizards.playersList.add(player1);
        wizards.playGame();
        wizards.playersList.get(0).playGame();
    }
}
class Player {
    String name;
    int jerseyNumber;
    String position;
    Player(String name,int jerseyNumber,String position){
        this.name=name;
        this.jerseyNumber=jerseyNumber;
        this.position=position;
    }
    void playGame(){
        System.out.println("The player "+name+" is going to play the match");
    }
    void train(){
        System.out.println("Player "+name+" is training");
    }

}

