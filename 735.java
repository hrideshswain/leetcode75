//735 . Asteroid Collision
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            // A flag to know if the current asteroid was destroyed in a collision.
            boolean destroyed = false;
            
            // This loop handles all potential collisions for a new left-moving asteroid.
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                // If the asteroid on the stack is larger, the new one is destroyed.
                if (stack.peek() > -ast) {
                    destroyed = true;
                    break;
                } 
                // If they are the same size, both are destroyed.
                else if (stack.peek() == -ast) {
                    stack.pop();
                    destroyed = true;
                    break;
                } 
                // If the new asteroid is larger, the one on the stack is destroyed.
                else {
                    stack.pop();
                }
            }
            
            // If the new asteroid survived all collisions, add it to the stack.
            if (!destroyed) {
                stack.push(ast);
            }
        }

        // Convert the final stack back into an array.
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}