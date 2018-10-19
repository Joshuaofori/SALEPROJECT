import java.util.Scanner;
public class SalesManager {
    private String name;//to instantiate a name for the salesperson
    int quaterMonthcount=0;//performs counting in a loop in the quaterlyRanked method
    int FquaterMonthcount=4;//performs counting in a loop in the quaterlyRanked method
    double[] object1quatermonthsales=new double[3];//represent the quaterRanked field array to store a data of four months
    double[] object2quatermonthsales=new double[3];//represent the quaterRanked field array to store a data of four months
    double object1yearly=0;//represent a field to store data of object 1
    double object2yearly=0;//represent a field to store data of object 2
    Sales object1;
    Sales object2;

    SalesManager() {
        object1 = new Sales();

        object2 = new Sales();
        //object1.setNameOfperson(getName());
        object1.setNameOfperson("SalesPerson 1");
        object1.setMonthNumber();
        //object2.setNameOfperson(getName());
        object2.setNameOfperson("SalesPerson 2");
        object2.setMonthNumber();
    }

    //returns the name of the object
    public String getName() {
        return name;
    }

    //sets the name of the object
    public void setName(String name) {
        this.name = name;
    }

    public void bestPeformancePerMonth() {
        for (int i = 0; i < object1.getSales().length; i++) {
            if (object1.getSales()[i] > object2.getSales()[i])
                System.out.println("in " + object1.getMonthName()[i] +" "+ object1.getNameOfperson() + " had a better sales of " + object1.getSales()[i] + " as compared to " + object2.getNameOfperson() + " of sales " + object2.getSales()[i]);
            else if (object2.getSales()[i] > object1.getSales()[i])
                System.out.println("in " + object1.getMonthName()[i] +" "+ object2.getNameOfperson() + " had a better sales of " + object2.getSales()[i] + " as compared to " + object1.getNameOfperson() + " of sales " + object1.getSales()[i]);
            else if (object2.getSales()[i] == object1.getSales()[i])
                System.out.println("in " + object1.getMonthName()[i] + " "+object2.getNameOfperson() + " had the same sales of " + object2.getSales()[i] + " as compared to " + object1.getNameOfperson() + " of sales " + object1.getSales()[i]);
        }
    }

    public void monthlySalesTotal() {
        for (int i = 0; i < object1.getSales().length; i++) {
            System.out.println("in "+object1.getMonthName()[i]+" , the total sales was "+(object1.getSales()[i]+object2.getSales()[i]));
        }

    }
    public void quarterlyRanked(){

        for(int i=0;i<object1.getMonthName().length/4;i++){
            String months="";
            for(int j=quaterMonthcount;j<FquaterMonthcount;j++) {
                months+=object1.getMonthName()[j]+", ";
                object1quatermonthsales[i] += object1.getSales()[j] ;
                object2quatermonthsales[i] +=object2.getSales()[j];
            }
            quaterMonthcount+=4;
            FquaterMonthcount+=4;
            if(object1quatermonthsales[i]>object2quatermonthsales[i])
                System.out.println("in "+months+" "+object1.getNameOfperson()+" had a better sales of "+object1quatermonthsales[i]+" as compared to "+object2.getNameOfperson()+" sales of "+object2quatermonthsales[i]);
            else if(object1quatermonthsales[i]<object2quatermonthsales[i])
                System.out.println("in "+months+" "+object2.getNameOfperson()+" had a better sales of "+object2quatermonthsales[i]+" as compared to "+object1.getNameOfperson()+" sales of "+object1quatermonthsales[i]);

           else if(object1quatermonthsales[i]==object2quatermonthsales[i])
                System.out.println("in "+months+" "+object1.getNameOfperson()+" had the same sales of "+object1quatermonthsales[i]+" as compared to "+object2.getNameOfperson()+" sales of "+object2quatermonthsales[i]);
        }
    }

public void yearlyRanked(){
        for(int i=0;i<object1.getSales().length;i++){
            object1yearly+=object2.getSales()[i];
            object2yearly+=object1.getSales()[i];
        }
        if(object1yearly>object2yearly)
            System.out.println("in the year, "+object1.getNameOfperson()+"had a better sales of "+object1yearly+" as compared to "+object2.getNameOfperson()+" of sales "+object2yearly);
   else if(object1yearly<object2yearly)
        System.out.println("in the year, "+object2.getNameOfperson()+"had a better sales of "+object2yearly+" as compared to "+object1.getNameOfperson()+" of sales "+object1yearly);
   else if(object1yearly==object2yearly)
        System.out.println("in the year, "+object1.getNameOfperson()+" had the same sales of "+object1yearly+" as compared to "+object2.getNameOfperson()+" of sales "+object2yearly);
}
public void sortObject(Sales object){
        double sales;
        String monthName;
        for(int pass=0;pass<(object.getSales().length-1);pass++){
            for(int comps=0;comps<(object.getSales().length-1);comps++ ){
                if(object.getSales()[comps]>object.getSales()[comps+1]){
                    sales=object.getSales()[comps];
                    object.getSales()[comps]=object.getSales()[comps+1];
                    object.getSales()[comps+1]=sales;
                    name=object.getMonthName()[comps];
                    object.getMonthName()[comps]=object.getMonthName()[comps+1];
                    object.getMonthName()[comps+1]=name;
                }
            }
        }
        for (int i=0;i<object.getSales().length;i++){
            System.out.println(object.getMonthName()[i]+" "+object.getSales()[i]);
        }

}
}
