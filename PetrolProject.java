public class PetrolProject {
    private String brand;
    private double petrol;

    public void setCar(String brand, double petrol){
        this.brand = brand;
        this.petrol = petrol;
    }

    public String getBrand(){
        return brand;
    }

    public double getPetrol(){
        return petrol;
    }

    public static void main(String[] args) {
        PetrolProject car = new PetrolProject();

        String[][] model = {
            {"Hilux","Raptor"}, //array
            {"Ranger","Triton"}, //array
        };

        double[][] petrolUsage = {
            {8.3,11.5}, //arrayjava
            {7.5,10.2}, //array
        };

            for (int i = 0; i < model.length; i++) {
                for (int j = 0; j < model[i].length; j++) {
                    car.setCar(model[i][j], petrolUsage[i][j]);

                    System.out.println("The petrol usage of " + car.getBrand() + " is " + car.getPetrol() + " liters per 100km");
                }
            }
        
    }


}
