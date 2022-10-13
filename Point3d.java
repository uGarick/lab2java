public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d() {
        this(0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }
    public double getY() {
        return yCoord;
    }
    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }
    public void setY(double val) {
        yCoord = val;
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
