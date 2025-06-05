import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Fire {
    /**
     * Returns how long it takes for all vulnerable trees to be set on fire if a
     * match is lit at a given location.
     * 
     * The forest is represented via a rectangular 2d char array where t represents a tree
     * and . represents an empty space.
     * 
     * At time 0, the tree at location [matchR, matchC] is set on fire. At every subsequent
     * time step, any tree that is adjacent (up/down/left/right) to a burning tree is also
     * set on fire. 
     * 
     * 
     * EXAMPLE 
     * forest:
     * 
     * t..tttt.t
     * ..tt....t
     * ..ttttttt
     * tttt.....
     * 
     * matchR: 2
     * matchC: 6
     * 
     * Result: 8
     * 
     * Explanation:
     * At time 0, the tree at (2, 6) is set on fire. At time 1, its adjacent trees also catch on fire
     * At time 2, the trees adjacent to those catch as well. At time 8, the last tree to catch is at
     * (0,6). In this example, there is one tree that never burns, so it is not included in the time calculation.
     * 
     * 
     * @param forest a 2d array where t represents a tree and . represents the ground
     * @param matchR The row the match is lit at
     * @param matchC The column the match is lit at
     * @return the time at which the final tree to be incinerated starts burning
     */
    public static int timeToBurn(char[][] forest, int matchR, int matchC) {
        // HINT: when adding to your BFS queue, you can include more information than
        // just a location. What other information might be useful?
        int[] start = {matchR, matchC};
        List<int[]> neighbors = getNeighbors(forest, start);
        boolean[][] visited = new boolean[forest.length][forest[0].length];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);


        while (!queue.isEmpty()) {
            int[] treeLocation = queue.poll();
            
            int curR = treeLocation[0];
            int curC = treeLocation[1];
            int curDepth = treeLocation[2];
            
            if (visited[curR][curC]) {
                continue;
            }
            visited[curR][curC] = true;

            if (forest[curR][curC] == 't') {
                curDepth++;
                
            }

        }
        
        return minTime;
    }

    public static List<int[]> getNeighbors(char[][] forest, int[] current) {
        int curR = current[0];
        int curC = current[1];

        int[][] directions = {
            {-1,0},
            {1,0},
            {0-1},
            {0,1}
        };

        List<int[]> neighbors = new ArrayList<>();
        for(int[] direction : directions) {
            int changeCurR = direction[0];
            int changeCurC = direction[1];
            int newCurR = changeCurR + curR;
            int newCurC= changeCurC + curC;

            if(newCurR >=0 && newCurR < forest.length &&
                newCurC >=0 && newCurC < forest[newCurR].length &&
                    forest[newCurR][newCurC] == 't') {
                        int[] treeLocation =  {newCurR, newCurC};
                        neighbors.add(treeLocation);
            }

        }
        return neighbors;
    }
}