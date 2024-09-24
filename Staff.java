public class Staff {
    
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;

    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 0;
        this.bonus = 0;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getHealthAllowance() {
        return healthAllowance;
    }

    public void setHealthAllowance(double healthAllowance) {
        this.healthAllowance = healthAllowance;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return baseSalary + healthAllowance + bonus;
    }

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[2]);
            Staff[] staff = new Staff[6]; 
            staff[0] = new Staff("Sab", 8000);
            staff[1] = new Staff("Anis", 5500);
            staff[2] = new Staff("Mai", 7500);
            staff[3] = new Staff("Auni", 6900);

            for (Staff s : staff) {
                if (s != null) {
                    System.out.println(s.getName() + "'s total salary: " + s.getTotalSalary());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught bad: " + e.getMessage());
        } finally {
            System.out.println("It will execute anywhere");
        }
        
        System.out.println("Program continues");
    }
}
