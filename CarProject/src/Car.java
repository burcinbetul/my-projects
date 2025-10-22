public class Car {
    String brand;
    String model;
    int year;
    public void displayInfo(){
        System.out.println("BRAND: " + brand+ "Model: " +model+ "Year: "+year);


    }
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.model = "benz";
        c1.year = 2000;
        c1.displayInfo();

    }
}
