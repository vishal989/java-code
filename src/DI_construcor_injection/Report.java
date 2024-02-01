package DI_construcor_injection;

public class Report {
    private Calculator  cal;

    public Report(Calculator cal){
        this.cal = cal;
    }

    public void show(){
        var tax = cal.tax();
        System.out.println("Tax report " + tax);
    }


}
