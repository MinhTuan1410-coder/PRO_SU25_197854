
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Trần Minh Tuấn
 */
public class EmployeeList extends ArrayList<Employee> {

    public double getAverageSalary(double baseSalary) {
        int count = 0;
        int sumResult = 0;
        for (Employee e : this) {
            if (e.getEmployeeSalary() > baseSalary) {
                sumResult += e.getEmployeeSalary();
                count++;
            }
        }
        if (sumResult == 0) {
            return 0;
        }
        return sumResult / count;

    }

    public Employee getEmployeeByMaxYearsOfExperience() {
        Employee employeeResult = this.get(0);

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getYearsOfExperience() > employeeResult.getYearsOfExperience()) {
                employeeResult = this.get(i);
            }
        }
        return employeeResult;
    }
}
