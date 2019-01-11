public enum ResultType {

    PLAYER_ONE_WIN("Player 1 wins!"),
    PLAYER_TWO_WIN("Player 2 wins"),
    DRAW("It was a draw!");


    private final String value;

    ResultType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
