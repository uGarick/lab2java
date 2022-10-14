public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    public Point3d() {
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public double distanceTo(double nX, double nY, double nZ) {
        double oX = getX();
        double oY = getY();
        double oZ = getZ();
        double result = Math.sqrt(Math.pow(nX - oX, 2) + Math.pow(nY - oY, 2) + Math.pow(nZ - oZ, 2));
        result = (Math.ceil(result*100))/100;
        return result;
    }
}
