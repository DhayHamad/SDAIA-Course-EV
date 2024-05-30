package Evaluation.day2.section2;

import java.time.Year;

public class Employee {
    String name;
    double salary;
    int hier_year;

    public Employee(String n, double s, int h) {
         name = n;
         salary = s;
         hier_year = h;

    }

    public double caleEMP(){
        return salary *12;
    }
    public int getHear(){

      //  return 2024-hier_year;
        int curntYear= Year.now().getValue();
        return curntYear-hier_year;
    }
}
