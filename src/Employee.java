public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYears;

    public Employee(String name, double salary,int workHours, int hireYears  ){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public double tax(){
        if(this.salary < 1000){
            return salary;
        }else{
            double tax = salary * 0.03;
            return tax;
        }
    }

    public int bonus (){
        if(workHours > 40){
            int bonus = (workHours - 40 )*30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary(){
        if(hireYears <=0 || hireYears > 2021){
            System.out.println("Geçersiz çalışma yılı girdiniz. ");
        }
        else{

            int fark = 2021 - hireYears;
            double  zam ;
            
            if(fark >0 && fark < 10){
                zam = salary*0.05;
                return zam;
            }else if (fark > 9 || fark < 20){
                zam = salary* 0.1;
                return zam;
            }else if (fark > 19){
                zam = salary* 0.15;
                return zam;
            }else if (fark == 0){
                return 0.0;
            }
        }
        return 0;
    }

    public String toString(){
        double total = this.salary - tax() + bonus() + raiseSalary();
        double tot = this.salary + bonus() - tax();
        System.out.println("Adı : "+ this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma saati  : "+ this.workHours);
        System.out.println("Başlangıç Yılı : "+ this.workHours);
        System.out.println("Vergi : "+ tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());
        System.out.println("Vergi ve Bonuslarlar birlikte maaş : "+ tot);
        System.out.println("Toplam maaş : "+ total);
        return null;

    }


    
}
