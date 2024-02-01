package DI_construcor_injection;

public class Main {
    public static void main(String[] args){
        var calculator = new Calculator2018(3);
        var report = new Report(calculator);
        report.show();
    }
}
