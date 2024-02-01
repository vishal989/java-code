package DI_Setter_Injection;

public class Report {
    private Calculator cal;

    public Report(Calculator cal){
        this.cal = cal;
    }

    public void display(){
        double tax = cal.tax();
        System.out.println(tax);
    }

    public void setCal(Calculator cal) {
        this.cal = cal;
    }
}
