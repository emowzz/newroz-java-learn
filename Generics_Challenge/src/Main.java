public class Main {
    public static void main(String[] args) {
        League<Team <FootballPlayer>> footballLeague = new League<>("AFL");
        BaseballPlayer Ahad = new BaseballPlayer("Ahad");
        SoccerPlayer Nabil = new SoccerPlayer("Nabil");
        Team<FootballPlayer> footballPlayerTeam = new Team<>("Football Team");

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer footballPlayer = new FootballPlayer("Gordon");


        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(footballPlayerTeam, 3, 8);

        footballPlayerTeam.matchResult(fremantle, 2, 1);
        footballPlayerTeam.matchResult(fremantle, 1, 1);

        footballLeague.add(footballPlayerTeam);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(Nabil);
        rawTeam.addPlayer(Ahad);

        footballLeague.add(rawTeam);

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(footballPlayerTeam);
        rawLeague.add(baseballPlayerTeam);
        rawLeague.add(rawTeam);

        League reallyRaw = new League("Really raw");
        reallyRaw.add(footballPlayerTeam);
        reallyRaw.add(baseballPlayerTeam);
        reallyRaw.add(rawTeam);

    }
}
