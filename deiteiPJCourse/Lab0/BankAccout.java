package deiteiPJCourse.Lab0;

public class BankAccout {



    private double summMoney;// Сумма вклада
    private int years ; // количество лет
    private double percent ; // Ставка годвая
    private int i;


    public BankAccout(double money,int year, double per){
        if (money >=0){
        this.summMoney=money;}
               else {System.out.println("Ошибка,число должно быть положительным" );}

        this.years = year;
        this.percent=per;

    };
   // геттеры и сеттеры.
    public double getSummMoney() {


        return summMoney;
    }

    public void setSummMoney(double summMoney) {
        this.summMoney = summMoney;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }


       public void countMyMoney()     // метод в котором мы считаем сколько денег выйдет после того как мы их снимаем.

    {
        for (i = 1; i <= years; i++) {
            summMoney = summMoney * (1 + percent/100);
            System.out.printf("%4d%,20.2f\n",i,summMoney );
        }
    }
        public void showMyMoney() // отражаем сколько денег выйдет после всего.
    {
            System.out.printf("Ваш вклад после " + years + " лет " + percent + " процентов составит "
                    + String.format("%.2f", summMoney) + " рублей");
        }



}


