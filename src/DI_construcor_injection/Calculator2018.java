package DI_construcor_injection;

public class Calculator2018 implements Calculator{
    private double income;

    public Calculator2018(double income){
        this.income = income;
    }
    @Override
    public double tax() {
        return income * 0.4;
    }
}
