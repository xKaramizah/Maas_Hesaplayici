public class Employee {
    String name;
    int salary;
    int weeklyWorkHours;
    int hiredYear;

    Employee(String name, int salary, int weeklyWorkHours, int hiredYear) {
        this.name = name;
        this.salary = salary;
        this.weeklyWorkHours = weeklyWorkHours;
        this.hiredYear = hiredYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    int bonus() {
        if (this.weeklyWorkHours > 40) {
            return (this.weeklyWorkHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if ((2021 - this.hiredYear) >= 19) {
            return this.salary * 0.15;
        } else if ((2021 - this.hiredYear) > 9 && (2021 - this.hiredYear) < 19) {
            return this.salary * 0.10;
        }
        return this.salary * 0.05;
    }

    public String toString() {

        return "Çalışan adı: " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.weeklyWorkHours +
                "\nİşe Başlangıç Yılı : " + hiredYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş artışı:"+raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : "+(salary-tax()+bonus()) +
                "\nToplam Maaş : "+(salary+raiseSalary());
    }
}
