package REG_NO_2241018014;

import java.util.Arrays;
import java.util.*;


            class Date
          {
                 int day;
                 int month;
                 int year;


                       public Date(int day, int month, int year)
             {
                    this.day = day;
                    this.month = month;
                    this.year = year;
             }
                  public String toString()
    {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
          }




          class Address
           {
                   String country , street, city, state;
                    public Address(String street, String city, String state, String country)
             {
                  this.street = street;
                  this.city = city;
                  this.state = state;
                  this.country = country;
             }
           }

            class Employee
                    {
                            String name, jobPosition, contactNumber;
                            int empId;
                             int salary;
                              Date hireDate;
                              Address address;
                              public Employee(String name, int empId, int salary, Date hireDate, String jobPosition,
                                              String contactNumber, Address address)

                              {
                                      this.name = name;
                                      this.empId = empId;
                                      this.salary = salary;
                                      this.hireDate = hireDate;
                                      this.jobPosition = jobPosition;
                                      this.contactNumber = contactNumber;
                                      this.address = address;
                               }
                    }









                    public class TEST
                       {
                                public static void main(String[] args)
                                 {
                                      Employee[] employees = new Employee[500];
                                      for (int i = 0; i <500; i++)
                                      {
                                         String name = "Employee_" + (i+1);
                                         int empId = i + 1;
                                         int salary = (i + 1) * 10000;
                                         Date hireDate = new Date(1 + (i % 28), 1 + (i % 12), 2000 + (i / 12));
                                         String jobPosition = (i % 10 == 0) ? "Manager " : "Employee";
                                         String contactNumber;

                                              if(i%11==0)
                                               {
                                                 contactNumber = "+064-12345" + String.format("%03d", i + 1);
                                               }
                                     else
                                     {
                                           contactNumber = "+91-12345" + String.format("%03d", i + 1);
                                     }
                                               Address address = new Address("Street " + (i % 100), "City " + (i % 10),
                                                       "State " + (i % 5), "India");
                             employees[i] = new Employee(name, empId, salary, hireDate, jobPosition, contactNumber, address);
                                        }

                                arrangeEmployeeBySalary(employees);
                                      getEmployeesByJobPosition(employees, "employee");
                                      getEmployeesByHireDate(employees, new Date(1, 1, 2002),
                                              new Date(31, 5, 2023));
                                      getEmployeesBySalary(employees, 10000, 400000);
                                   System.out.println("Foreign Employees Count : " + foreignEmployeeCount(employees));
                                   }




                        public static void arrangeEmployeeBySalary(Employee[] employees)
                            {
                                    Arrays.sort(employees, (e2, e1) -> e1.salary - e2.salary);
                                System.out.println("Employees Sorted By Salary in descending order : ");
                                for (Employee e : employees)
                                     {
                                         System.out.println(e.name + " | " + e.empId + " | "+ e.salary + " | "
                                                 + e.hireDate + " | " + e.jobPosition +" | " +  e.contactNumber + " | "+ e.address);
                                     }
                            }

    public static void getEmployeesByJobPosition(Employee[] e, String jobp)
    {
        System.out.println("Employees Sorted By Job Position : ");
        for (Employee employee : e)
        {
            if (employee.jobPosition.equalsIgnoreCase(jobp))
            {
                System.out.println(employee.name + " | " + employee.empId + " | " + employee.salary + " | "+ employee.hireDate + " | "
                        + employee.jobPosition +" | "+ employee.contactNumber + " | "+ employee.address);
            }
        }
    }






    public static void getEmployeesByHireDate(Employee[] e, Date d1, Date d2)
    {
        System.out.println("Employees Sorted By Hiredate : ");
        for (Employee employee : e)
        {
            if (isDateInRange(employee.hireDate, d1, d2))
            {
                System.out.println(employee.name + " | " + employee.empId + " | " + employee.salary + " | "+ employee.hireDate + " | "
                        + employee.jobPosition +" | "+ employee.contactNumber + " | "+ employee.address);
            }
        }
    }







    private static boolean isDateInRange(Date date, Date startDate, Date endDate)
    {
        return (date.year > startDate.year || (date.year == startDate.year && date.month > startDate.month)
                || (date.year == startDate.year && date.month == startDate.month && date.day >= startDate.day))
                && (date.year < endDate.year || (date.year == endDate.year && date.month < endDate.month)
                || (date.year == endDate.year));
    }
    public static int foreignEmployeeCount(Employee[] e)
    {
        int count=0;
        System.out.println("Employees Sorted By Foreign employees : ");
        for (Employee employee : e)
        {
            if (!employee.contactNumber.startsWith("+91"))
            {
                count++;
            }
        }
        return count;
    }
    public static void getEmployeesBySalary(Employee[] e, double s1, double s2)
    {
        System.out.println("Employees Sorted By Salary : ");
        for (Employee employee : e)
        {
            if (employee.salary >= s1 && employee.salary <= s2)
            {
                System.out.println(employee.name + " | " + employee.empId + " | " + employee.salary + " | "+ employee.hireDate + " | "
                        + employee.jobPosition +" | "+ employee.contactNumber + " | "+ employee.address);
            }
        }
    }
}

