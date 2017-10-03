public class Wall extends Board{

    public boolean isWall(int x, int y) {

        for (int i = 0; i <board.length ; i++) {
            if (board[i][0] == x && board[i][1] == y) {
                return false;
            }
        }
        return true;
    }
}

