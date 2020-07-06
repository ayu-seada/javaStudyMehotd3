package Ayu.Java;

public class MeasureConverter {
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){

        if (feet<0 || inches<0 && inches>12) {
            System.out.println("Invalid Parameters");
            return -1;
        }


        double Centimeters = feet*30.48;
        Math.round(Centimeters);
        System.out.print(" // "+ feet + "Feet = " + Centimeters + "Cm // ");

        Centimeters+= feet*2.54;
        Math.round(Centimeters);

        System.out.print(" // "+inches + "Inch = " + Centimeters+ "Cm // ");


        return Centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0)return  -1;

        double feet = (int) inches/12;
        double remainingInches = (int)inches % 12 ;
        System.out.println("// "+inches + "  inches is equal to " + feet + " feet and "+remainingInches+ " inches //");
        return calcFeetAndInchesToCentimeters(feet,inches);

    }
}
