public class Workers {
    public String nameAndSurname;
    public String jobTitle;
    public int daySalary;
    public int SalaryPerMonth;
    public int daysOnTheWork;

    public void countMonthlySalary(){
        SalaryPerMonth = daysOnTheWork * daySalary;

        System.out.println("");

        System.out.println("Имя и фамилия " + nameAndSurname);

        System.out.println("Должность " + jobTitle);

        System.out.println("Дней отработано " + daysOnTheWork);

        System.out.println("заработано за месяц " + SalaryPerMonth);
 // author dolbaeb
    }
}


