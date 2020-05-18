package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private  String firstName;
    private   String secondName;
    private Data contractDate;
    private Tempo checkInTime;
    private Tempo departuresTime;
    private final int   diaSemana=5;
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/dddd");

    public Employee() {
    }

    public Employee(String firstName, String secondName, Data contractDate, Tempo checkInTime, Tempo  departuresTime) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.contractDate = contractDate;
        this.checkInTime = checkInTime;
        this.departuresTime = departuresTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Data getContractDate() {
        return contractDate;
    }

    public void setContractDate(Data contractDate) {
        this.contractDate = contractDate;
    }

    public Tempo getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Tempo checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Tempo getDeparturesTime() {
        return departuresTime;
    }

    public void setDeparturesTime(Tempo departuresTime) {
        this.departuresTime = departuresTime;
    }
    public int tContrato(){
        Data date=new Data(2020,05,16);
        System.out.print(date);
        return contractDate.diferenca(date);
    }
    public String  antiguidade() {
        int day = tContrato();
        System.out.println("\n"+day+"\n");
        int days=0;
        int mes=0;
        int years = 0;
        int weeks = 0;
        if (day >= 365) {
            System.out.println("ano");
            years = days / 365;
            mes=days%365;
            return  "ano" +years +" "+mes;

        } else if (days > 365){
            System.out.println("mes");

            years = days / 365;
            weeks = (day - (years * 365)) / 7;
            return " ";

    }else {
            System.out.println("dias");

            years = days / 365;
             weeks = (day - (years * 365)) / 7;
            return "we";//+ days = days - ((years * 365) + (weeks * 7));
        }
    }
    public int  horasTDia(){
        return departuresTime.getHoras()-checkInTime.getHoras();
    }
    public int  calHorasS(){
        return  horasTDia()*diaSemana;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", contractDate=" + contractDate  +
                ", checkInTime=" + checkInTime.toString() +
                ", departuresTime=" + departuresTime.toString() +
                '}';
    }
}
