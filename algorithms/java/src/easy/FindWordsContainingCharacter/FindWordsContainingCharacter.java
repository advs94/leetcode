package easy;

public class FindWordsContainingCharacter {
    /*
     * LC - 2942. Find Words Containing Character
     */
    public List<Integer> findWordsContaining(String[] words, char x) {
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) if (words[i].indexOf(x) != -1) list.add(i);
        return list;
    }
}
