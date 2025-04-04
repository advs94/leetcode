package easy;

public class DestinationCity {
    /*
     * LC - 1436. Destination City
     */
    public String destCity(List<List<String>> paths) {
        final Set<String> origin = new HashSet<>();
        for (List<String> directPaths : paths) origin.add(directPaths.get(0));
        for (List<String> directPaths : paths) {
            if (!origin.contains(directPaths.get(1))) {
                return directPaths.get(1);
            }
        }
        return null;
    }
}
