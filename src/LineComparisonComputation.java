class Line{
    private int x1,y1; //Point 1
    private int x2,y2; // Point 2

    public Line(int x1,int y1,int x2,int y2){
             this.x1 = x1;
             this.y1 = y1;
             this.x2 = x2;
             this.y2 = y2;
    }

    //UC1(Calculating the length of line using two points)
    public double getLength(){
        double sqrdlength = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
        double length = Math.sqrt(sqrdlength);
        return length;
    }

    //UC2(Checking if two lines are equal or not)
    public void checkEquality(Line p2){
        if(this.getLength()==p2.getLength()){
             System.out.println("Both lines have equal length");
        }
        else{
            System.out.println("Both lines have unequal length");
        }
    }

    //UC3(To compare the lengths of lines)
    public void compare(Line p2){
        int compare = Double.compare(this.getLength(), p2.getLength());
        if(compare>0){
            System.out.println("The length of line 1 is greater than line 2");
        }
        else if(compare<0){
            System.out.println("The length of line 2 is greater than line 1");
        }
        else{
            System.out.println("Both lines have equal length");
        }

    }
    
}

public class LineComparisonComputation{
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison computation program");
        Line p1 = new Line(3,6,6,12);
        //get length of line 1
        System.out.println("The lenght of line with given points is:- "+p1.getLength());

        Line p2 = new Line(2,4,7,11);
        //get length of line2
        System.out.println("The lenght of line with given points is:- "+p2.getLength());

        //Check Equality of two lines
        p1.checkEquality(p2);

        //Compare two lines
        p1.compare(p2);


    }
}
