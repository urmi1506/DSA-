import java.util.HashSet;
import java.util.Set;

public class RobotSim {
    
    // Function to simulate the robot's movement and calculate the maximum Euclidean distance squared
    public static int robotSim(int[] commands, int[][] obstacles) {
        // Create a set to store obstacles as strings in the format "x,y"
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            // Convert obstacle coordinates to string and add to the set
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        // Define directions for north, east, south, and west respectively
        // North: (0, 1), East: (1, 0), South: (0, -1), West: (-1, 0)
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        // Initialize the robot's starting position (x, y) and direction index
        int x = 0, y = 0, dirIndex = 0, maxDist = 0;

        // Iterate through each command
        for (int command : commands) {
            if (command == -1) {
                // Turn right: Increase direction index by 1 (mod 4 to cycle through 0-3)
                dirIndex = (dirIndex + 1) % 4;
            } else if (command == -2) {
                // Turn left: Decrease direction index by 1 (mod 4 to cycle through 0-3)
                dirIndex = (dirIndex + 3) % 4;
            } else {
                // Move forward by the number of steps specified in the command
                for (int i = 0; i < command; i++) {
                    // Calculate new coordinates based on current direction
                    int newX = x + directions[dirIndex][0];
                    int newY = y + directions[dirIndex][1];
                    
                    // Check if the new position is an obstacle
                    if (!obstacleSet.contains(newX + "," + newY)) {
                        // Update position if there's no obstacle
                        x = newX;
                        y = newY;
                        // Update maximum distance squared from the origin
                        maxDist = Math.max(maxDist, x * x + y * y);
                    } else {
                        // Stop moving if there's an obstacle
                        break;
                    }
                }
            }
        }

        return maxDist;
    }
    public static void main(String[] args) {
        int[] commands = {4,-1,3};
        int[][] obstacles = {};
        System.out.println(robotSim(commands, obstacles));
    }
}


