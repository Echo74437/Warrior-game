public class Betlog {
    private List<Bet> bets;

    public Betlog() {
        bets = new ArrayList<>();
    }

    public void addBet(Bet bet) {
        bets.add(bet);
    }

    public List<Bet> getBets() {
        return bets;
    }
}