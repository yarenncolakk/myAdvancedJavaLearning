public class StringExamples {
    public static void main(String[] args) {

        //useStartWithEndWith();
        //useIndexOfLastIndexOf();
        //useSubstring();
        //useConcat();
        //useCharArray();
        //useValueOf();

        //String word1 = "Check Exam";
        //String word2 = "Cam";


    }

    public static void useStartWithEndWith(){
        String[] myString = {"started", "starting", "ended", "ending"};

        for (String myValue : myString) {
            System.out.println(myValue + " ");
        }

        for (String myValue : myString) {
            if (myValue.startsWith("st")) { //sadece st ile başlayan elemanları yazdır.
                System.out.println(myValue + " ");
            }
        }
        System.out.println();

        for (String myValue : myString) {
            if (myValue.endsWith("ed")) { //sadece ed ile biten elemanları yazdır.
                System.out.println(myValue + " ");
            }
        }
    }

    public static void useIndexOfLastIndexOf(){
        String letters = "abcdefghabcdr";

        System.out.printf("a is located of at index %d\n" , letters.indexOf('a'));
        System.out.printf("b is located of at index %d" , letters.indexOf('b'));
    }

    public static void useSubstring(){
        String letters = "abcdefghklmrparbfd";

        String word = "Hello, there";

        System.out.println(letters.substring(5));
        System.out.println(letters.substring(5,7)); //5'ten 7. indexe kadar.

        System.out.println(word.substring(7));
        System.out.println(word.substring(word.indexOf('t'))); //en baştaki t ile başlayan kelimeyi yazdırır.
    }

    public static void useConcat(){
        String word1 = "Happy";
        String word2 = "Birthday";

        System.out.println(word1.concat(word2));
        word1 = word1.concat(word2); //concat + yerine kullanılır.
        System.out.println(word1);
    }

    public static void useCharArray(){
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = " spaces   ";

        System.out.println(s1.toUpperCase());
        System.out.println(s3.trim()); //kelimedeki boşlukları silmek için --> trim

        char[] myCharArray = s1.toCharArray();

        for(int i=0; i<myCharArray.length; i++){
            System.out.print(myCharArray[i] + " ");
        }
        System.out.println();
        for(int i=myCharArray.length-1; i>=0; i--){ //tersten yazdırmak için
            System.out.print(myCharArray[i] + " ");
        }
    }

    public static void useValueOf(){
        boolean booleanValue = true;
        int intValue = 14;
        double doubleValue = 313.50;
        String stringValue = "Java";

         /*
         //farklı tipteki verileri string ifadeye dönüştürmek için:
         System.out.println(String.valueOf(booleanValue));
         System.out.println(String.valueOf(intValue));
         System.out.println(String.valueOf(doubleValue));
        */

        Object[] myObject = {booleanValue, intValue, doubleValue, stringValue};

        for(int i=0; i<myObject.length; i++)
        {
            System.out.println(String.valueOf(myObject[i]));
        }
    }

}

