package easy;

public class UniqueMorseCodeWords {
    /*
     * LC - 804. Unique Morse Code Words
     */
    public int uniqueMorseRepresentations(String[] words) {
        final Set<String> morse = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                switch (ch) {
                    case 'a' :
                        sb.append(".-");
                        break;
                    case 'b' :
                        sb.append("-...");
                        break;
                    case 'c' :
                        sb.append("-.-.");
                        break;
                    case 'd' :
                        sb.append("-..");
                        break;
                    case 'e' :
                        sb.append(".");
                        break;
                    case 'f' :
                        sb.append("..-.");
                        break;
                    case 'g' :
                        sb.append("--.");
                        break;
                    case 'h' :
                        sb.append("....");
                        break;
                    case 'i' :
                        sb.append("..");
                        break;
                    case 'j' :
                        sb.append(".---");
                        break;
                    case 'k' :
                        sb.append("-.-");
                        break;
                    case 'l' :
                        sb.append(".-..");
                        break;
                    case 'm' :
                        sb.append("--");
                        break;
                    case 'n' :
                        sb.append("-.");
                        break;
                    case 'o' :
                        sb.append("---");
                        break;
                    case 'p' :
                        sb.append(".--.");
                        break;
                    case 'q' :
                        sb.append("--.-");
                        break;
                    case 'r' :
                        sb.append(".-.");
                        break;
                    case 's' :
                        sb.append("...");
                        break;
                    case 't' :
                        sb.append("-");
                        break;
                    case 'u' :
                        sb.append("..-");
                        break;
                    case 'v' :
                        sb.append("...-");
                        break;
                    case 'w' :
                        sb.append(".--");
                        break;
                    case 'x' :
                        sb.append("-..-");
                        break;
                    case 'y' :
                        sb.append("-.--");
                        break;
                    case 'z' :
                        sb.append("--..");
                        break;
                }
            }
            morse.add(sb.toString());
        }
        return morse.size();
    }
}
