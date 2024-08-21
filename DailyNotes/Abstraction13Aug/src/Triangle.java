public class Triangle {
    int base;
    int height;
    private float area;

    private void calculateArea(){
        this.area = (float) ((0.5)*this.base*this.height);
    }

    Triangle(int base,int height){
        this.base = base;
        this.height = height;
        calculateArea();
    }

    public float getArea() {
        return area;
    }
}
