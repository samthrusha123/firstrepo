class LeapYear {
 
 public static void main(String[] args) {
 
  int year = Integer.parseInt(args[0]);
   
       // boolean isLeapYear = false;
 
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
        {
         System.out.println("Year "+year+" is a Leap Year");
        }
        else 
        {
         System.out.println("Year "+year+" is not a Leap Year");
        }
 }
}