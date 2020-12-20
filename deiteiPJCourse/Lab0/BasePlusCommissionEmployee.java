//package deiteiPJCourse;
//
//public class BasePlusCommissionEmployee {
//
//    private String firstName;
//    private String lastName;
//    private String socialSecurityNumber;
//    private double grossSales; // gross weekly sales
//    private double commissionRate; // commission percentage
//    private double baseSalary; // base salary per week
//
//    public BasePlusCommissionEmployee( String fname, String lName, String Ssecurity, double sales, double commissRate,
//                                       double baseSalary){
//
//        this.firstName = fname;
//        this.lastName = lName;
//        this.socialSecurityNumber = Ssecurity;
//        setGrossSales(sales);
//        setCommissionRate(commissRate);
//        setBaseSalary(baseSalary);
//
//    };
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }
//
//    public void setSocialSecurityNumber(String socialSecurityNumber) {
//        this.socialSecurityNumber = socialSecurityNumber;
//    }
//
//    public double getGrossSales() {
//        return grossSales;
//    }
//
//    public void setGrossSales( double sales )
// {
//         if ( sales >= 0.0 )
//             grossSales = sales;
//         else
//         throw new IllegalArgumentException(
//                 "Gross sales must be >= 0.0" );
//         } // end method setGrossSales
//
//    public double getCommissionRate() {
//        return commissionRate;
//    }
//
//    public void setCommissionRate(double commissionRate) {
//
//          if (commissionRate> 0.0  && commissionRate < 1.0)
//              this.commissionRate = commissionRate;
//
//          else
//              new IllegalArgumentException(
//                      "comissinRate must be >0.0. but < 1.0 ");
//
//    }
//
//    public double getBaseSalary() {
//
//                return baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        if (baseSalary >=0)
//        this.baseSalary = baseSalary;
//        else new IllegalArgumentException("basesalary must be >=0");
//
//    }   // Getters and Setters HERE!
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
