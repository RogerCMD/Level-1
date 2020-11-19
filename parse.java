public class parse {
    public static void main(String[] args){
        //variable double and float
        System.out.println("Parse String to Number");
        String text = "22";
        int number = Integer.parseInt(text);
        System.out.println("String:'22'\nNumber:"+number);
        //number to string
        System.out.println("Parse Number to String");
        number = 1;
        text = String.valueOf(number);
        System.out.println("Number:1\nString:'"+text+"'");
        //number to double
        System.out.println("Parse Number to Double");
        number = 33;
        float f = number;
        System.out.println("Number:"+number+"\nFloat:"+f);
    }
}
