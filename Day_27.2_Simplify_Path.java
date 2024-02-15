import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> pathComponents = new ArrayDeque<>();
        String[] tokens = path.split("/");
        
        for (String token : tokens) {
            
            if (token.equals("..")) {
                
                if (!pathComponents.isEmpty()) {
                    pathComponents.pollLast();
                }
            } else if (!token.isEmpty() && !token.equals(".")) {
                pathComponents.offerLast(token);
            }
        }
        
        if (pathComponents.isEmpty()) {
            return "/";
        }
        StringBuilder simplifiedPath = new StringBuilder();
        
        while (!pathComponents.isEmpty()) {
            simplifiedPath.append("/").append(pathComponents.pollFirst());
        }
        
        return simplifiedPath.toString();
    }
}
