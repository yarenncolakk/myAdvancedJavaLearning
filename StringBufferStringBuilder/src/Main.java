import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        //Time();
        //Append();
        //BuilderMethods();
        CompareTo();

    }
    //String Buffer String Builder yeni bir değişiklik geldiğinde üzerine yazar.
    //StringSegment özelliğini kullanarak maliyeti en aza indirir -> StringBuilder
    //Stringin böyle bir özelliği yoktur. Hafızada yeni yer tutar. Bu nedenle string daha yavaştır.
        public static void Time () {
            String str = " ";
            StringBuffer strBuf = new StringBuffer();
            StringBuilder strBuild = new StringBuilder();
            int n = 1000 * 100;
            long time;
            time = System.currentTimeMillis();

            for (int i = 0; i < n; i++) {
                str = str + "+";
            }
            System.out.println("String time: " + (System.currentTimeMillis() - time));

            time = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                strBuf.append("+");
            }
            System.out.println("StringBuffer time: " + (System.currentTimeMillis() - time));

            time = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                strBuild.append("+");
            }
            System.out.println("StringBuilder time: " + (System.currentTimeMillis() - time));
        }

        public static void Append() {

            String str1 = "Yaren";
            String str2 = "loves";
            String str3 = "New York";

            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("Yaren loves New York\n");
            strBuilder.append(str1).append("<3").append(str3).append("\n");
            strBuilder.append(str3);
            strBuilder.append(" ");
            strBuilder.append(str2);
            strBuilder.append(" ");
            strBuilder.append(str1);

            System.out.println(strBuilder);
        }

        public static void BuilderMethods(){

            String str = "Yaren";
            StringBuilder strBuilder = new StringBuilder();

            strBuilder.append(str);


            str = strBuilder.toString();   //builder ifade stringe dönüşümü
            str = "Bu bir string ifadedir.";
            strBuilder = new StringBuilder(str);  //string ifade buildera dönüşümü


            System.out.println(strBuilder);
            System.out.println(strBuilder.capacity()); //kapasite dolduktan sonra ilk ayrılan kapasite x2 kapasite eklenir

        }
        public static void CompareTo(){

          String str = "yaren";
          StringBuilder strBuilder = new StringBuilder(str);
          StringBuilder strBuilder2 = new StringBuilder("yb"); //ilk karakterler aynıysa 2ye geçer karakterler arası farkı yazdırır

          System.out.println(strBuilder.compareTo(strBuilder2)); //karşılaştırmak için


        }
    }
