import com.faro.srp.EmployeeSaver;
import com.faro.srp.HourReporter;
import com.faro.srp.PayCalculator;

public class Main {
    public static void main (String [] args) {
        PayCalculator pay = new PayCalculator();
        pay.calculatePay();

        HourReporter hourReporter = new HourReporter();
        hourReporter.reportHours();

        EmployeeSaver employeeSaver = new EmployeeSaver();
        employeeSaver.saveEmployee();
    }
}
