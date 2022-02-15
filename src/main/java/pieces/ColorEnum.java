package pieces;

public enum ColorEnum {

    BLACK(pieces.Pawn.ANSI_WHITE_BACKGROUND + pieces.Pawn.ANSI_BLACK +"X"+ pieces.Pawn.ANSI_BLACK_BACKGROUND+ pieces.Pawn.ANSI_RESET), WHITE("O");

    private String pawnChar;

    ColorEnum(String pChar) {
        this.pawnChar = pChar;
    }

    public String getPawnChar() {
        return pawnChar;
    }

    public void setPawnChar(String pawnChar) {
        this.pawnChar = pawnChar;
    }
}
