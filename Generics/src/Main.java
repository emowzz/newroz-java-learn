import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer emon = new FootballPlayer("Emon");
        BaseballPlayer Ahad = new BaseballPlayer("Ahad");
        SoccerPlayer Nabil = new SoccerPlayer("Nabil");


        // this is the generics part where I can assign different types to a same class
        Team<FootballPlayer> footballPlayerTeam = new Team<>("Football Team");
        footballPlayerTeam.addPlayer(emon);

        System.out.println("Number of players for team "+footballPlayerTeam.getName()+" is "+footballPlayerTeam.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Baseboll Team");

        baseballPlayerTeam.addPlayer(Ahad);

        System.out.println("Number of players for team "+footballPlayerTeam.getName()+" is "+footballPlayerTeam.numPlayers());

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer Team");

        soccerPlayerTeam.addPlayer(Nabil);


        System.out.println("Number of players for team "+soccerPlayerTeam.getName()+" is "+soccerPlayerTeam.numPlayers());

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer footballPlayer = new FootballPlayer("Gordon");


        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(footballPlayerTeam, 3, 0);

        footballPlayerTeam.matchResult(fremantle, 2, 1);
        footballPlayerTeam.matchResult(fremantle, 1, 1);


        System.out.println("Rankings");
        System.out.println(footballPlayerTeam.getName()+": "+footballPlayerTeam.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(fremantle.getName()+": "+fremantle.ranking());
        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());

        System.out.println(footballPlayerTeam.compareTo(melbourne));
        System.out.println(footballPlayerTeam.compareTo(hawthorn));


    }
}