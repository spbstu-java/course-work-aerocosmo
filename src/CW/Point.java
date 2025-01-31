/*
 * package CW;
 * 
 * public class Point { int x, y;
 * 
 * public Point(int x, int y) { this.x = x; this.y = y; }
 * 
 * @Override public String toString() { return "(" + x + "," + y + ")"; } }
 */
package CW;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
