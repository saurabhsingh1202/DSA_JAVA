public class ShortestPath {
    public static void main(String[] args) {

        String path = "WNEENESENNN";
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);

            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }

        double shortestdistance = Math.sqrt(x*x + y*y);

        System.out.println("Shortest distance is: " + shortestdistance);
    }
}