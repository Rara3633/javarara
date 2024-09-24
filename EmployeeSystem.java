public class EmployeeSystem {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getHealthAllowance(){
        return healthAllowance;
    }

    public double getBonus(){
        return bonus;
    }

    public double getTotalSalary(){
        return totalSalary;
    }

    public EmployeeSystem (String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 0;
        this.bonus = 0;
        this.totalSalary = 0;
    }

    public void assignBonus(){
        double salary = getBaseSalary();
        if (salary > 50000) {
            bonus = 0.10 * baseSalary;
        } else if (salary >= 30000) {
            bonus = 0.05 * baseSalary;
        } else {
            bonus = 0;
        }
    }

    public void setHealthAllowance(double healthAllowance) {
        this.healthAllowance = healthAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

}
