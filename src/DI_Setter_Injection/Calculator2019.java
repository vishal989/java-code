package DI_Setter_Injection;

public class Calculator2019 implements Calculator{
    private double income;

    public Calculator2019(double income){
        this.income = income;
    }


    @Override
    public double tax() {
        return this.income * 0.4;
    }
}
