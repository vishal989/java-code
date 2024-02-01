package DI_Setter_Injection;

public class Calculator2018 implements Calculator {
    private double income;

    public Calculator2018(double income){
        this.income = income;
    }


    @Override
    public double tax() {
        return this.income * 0.4;
    }
}
