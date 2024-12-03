import java.util.Scanner;

public class LineComparison {
	private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    public LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LineComparison other = (LineComparison) obj;
        return Double.compare(x1, other.x1) == 0 &&
               Double.compare(y1, other.y1) == 0 &&
               Double.compare(x2, other.x2) == 0 &&
               Double.compare(y2, other.y2) == 0;
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x1:");
		int x1=scan.nextInt();
		System.out.println("Enter y1:");
		int y1=scan.nextInt();
		System.out.println("Enter x2:");
		int x2=scan.nextInt();
		System.out.println("Enter y2:");
		int y2=scan.nextInt();
		LineComparison line1 = new LineComparison(x1, y1, x2, y2);
		System.out.println("For another line");
		System.out.println("Enter x1:");
		int x12=scan.nextInt();
		System.out.println("Enter y1:");
		int y12=scan.nextInt();
		System.out.println("Enter x2:");
		int x22=scan.nextInt();
		System.out.println("Enter y2:");
		int y22=scan.nextInt();
		LineComparison line2 = new LineComparison(x12, y12, x22, y22);
		System.out.println("Line 1 Length: " + line1.calculateLength());
		System.out.println("Line 2 Length: " + line2.calculateLength());
		System.out.println("Line 1 equals Line 2: " + line1.equals(line2));
	}

}
