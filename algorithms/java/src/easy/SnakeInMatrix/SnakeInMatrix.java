package easy;

public class SnakeInMatrix {
    /*
     * LC - 3248. Snake in Matrix
     */
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for (String command : commands) {
            switch (command.charAt(0)) {
                case 'U' :
                    pos -= n;
                    break;
                case 'D' :
                    pos += n;
                    break;
                case 'L' :
                    pos--;
                    break;
                case 'R' :
                    pos++;
            }
        }
        return pos;
    }
}
