package DI_Setter_Injection;

public class Main {
    public static void main(String[] args){
        Calculator2018 cal = new Calculator2018(5);
        Report report = new Report(cal);

        report.display();

        report.setCal(new Calculator2019(6));
        report.display();
    }
}
