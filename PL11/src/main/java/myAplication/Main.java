package myAplication;

import entidades.Data;
import entidades.Employee;
import entidades.Tempo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Employee> list=new ArrayList();
        Data data=new Data(2000 ,05,16);
        Tempo tempo=new Tempo( 19,00,00);
        Tempo tempo1=new Tempo(07,00,5);
        Employee employee=new Employee("terza","msf",data,tempo1,tempo);
        Employee employee1=new Employee("antonio","rafeiro",data,tempo1,tempo);
        System.out.println(employee.getCheckInTime());
        tempo.setTempo(19,55,05);
        System.out.println(employee.getCheckInTime());
        data.setData(2015,10,9);
        System.out.println(data);
        list.add(employee);
        list.add(employee1);
        for(Employee em:list){
           //  System.out.println(em);
           System.out.println(" \n"+em.getFirstName()+" "+em.calHorasS()+ " antiguidade "+365/em.tContrato() );

        }






    }
}
