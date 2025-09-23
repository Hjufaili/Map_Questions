import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Scoreboard {
    /**
     * TO-DO: Find the name of the player with the highest score.
     * If the map is empty, return null.
     \*
     * @param scores A map of player names to their scores.
     * @return The name of the player with the highest score.
     */
    public String findTopPlayer(Map<String, Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return null;
        }

        String topPlayer = null;
        int maxScore = -1; // Assuming scores are non-negative

        // Your code here. Iterate through the entrySet to check both key and value.
        for (String name : scores.keySet()){
            if (maxScore < scores.get(name)) {
                maxScore=scores.get(name);
                topPlayer=name;
            }



        }


        return topPlayer; // Placeholder
    }
}