public class Methodder {
    int minn;
    int maxx;
    String name;
    public static void main(String[] args) {
        int x = 25;
        int y = 30;
        int z = 35;
        System.out.println(comparison(x, y, z));
        Methodder obj1 = new Methodder();
        obj1.minn = 5;
        obj1.maxx = 25;
        obj1.name = "Stringer";
    }

    public static int comparison(int x, int y, int z) {
        return (Math.min(x,Math.min(y,z)));
    }
}