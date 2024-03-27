package org.example;

public class Rectangle {
    private double width;
    private double height;
    private double area;
    private double parameter;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * width
     * height
     *
     * @return width * height
     */
    public double getArea() {
        return width * height;
    }

    /**
     * width
     * height
     *
     * @return 2 * (width + height)
     */
    public double getParameter() {
        return 2 * (width + height);
    }
}
