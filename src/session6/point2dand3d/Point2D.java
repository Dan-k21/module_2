package inheritance.point2dand3d;

import java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point2D() {}
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point2D {
    public float z = 0.0f;
    public Point3D() {}
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {

    }
}