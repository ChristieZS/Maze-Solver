import java.util.LinkedList;

public class MainSolver {
	
	static int[][] maze = {
			{2, 0, 1, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	//0 - wall
	//1 - path
	//2 - destination
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Position p = new Position(0, 3);
		path.push(p);
		
		int y = path.peek().y;
		int x = path.peek().x;

		maze[y][x] = 0;
		
		if(maze[y+1][x] == 2) {
			System.out.println("You won");
			return;
		}
		else if(maze[y+1][x] == 1) {
			path.push(new Position(y+1, x));
		}
	}
	
}
