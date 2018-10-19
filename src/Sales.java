
import java.util.Scanner;
public class Sales {
    private String[] monthName;//represents the month Name
    private int[] monthNumber;//represents the month Number
    private double[] sales;//represent the monthly sales
    private String nameOfperson;//represen the name of the sales Person

    /**
     * a constructor to initialize the arrays
     */
    Sales(){
        monthNumber=new int[12];
        sales=new double[12];
        monthName=new String[12];
    }     //returns the sales of a month
    public double[] getSales(){
        return sales;
    }//returns the name of person
    public String getNameOfperson(){
        return nameOfperson;
    }
    //sets the name of person
    public void setNameOfperson(String nameOfperson){
        this.nameOfperson=nameOfperson;
    }
    //returns the month name
    public String[] getMonthName(){
        return monthName;
    }
    //returns the month number
    public int[] getMonthNumber() {
        return monthNumber;
    }
    //sets the month number and the corresponding month name
   public void setMonthNumber(){
       Scanner input=new Scanner(System.in);
        for(int i=0;i<monthNumber.length;i++){
        switch (i){
            case 0:monthName[i]="JANUARY";break;
            case 1:monthName[i]="FEBRUARY";break;
            case 2:monthName[i]="MARCH";break;
            case 3:monthName[i]="APRIL";break;
            case 4:monthName[i]="MAY";break;
            case 5:monthName[i]="JUNE";break;
            case 6:monthName[i]="JULY";break;
            case 7:monthName[i]="AUGUST";break;
            case 8:monthName[i]="SEPTEMBER";break;
            case 9:monthName[i]="OCTOBER";break;
            case 10:monthName[i]="NOVEMBER";break;
            case 11:monthName[i]="DECEMBER";break;
            default:break;
        }
        System.out.println(getNameOfperson()+ " please enter the sales for "+monthName[i]);
        sales[i]=input.nextDouble();
        }
   }
}
