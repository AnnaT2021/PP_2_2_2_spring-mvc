package web.model;

public class Car {

    private String modelCar;
    private int seriesCar;
    private String colorCar;

    public Car() {
    }

    public Car(String modelCar, int seriesCar, String colorCar) {
        this.modelCar = modelCar;
        this.seriesCar = seriesCar;
        this.colorCar = colorCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getSeriesCar() {
        return seriesCar;
    }

    public void setSeriesCar(int seriesCar) {
        this.seriesCar = seriesCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", seriesCar=" + seriesCar +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }
}


