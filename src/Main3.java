public class Main3 {
    public static void main(String[] args) {
        String str1 = "kjasfkja";
        String str2 = new String("kjasfkja");
        int x1 = 10;

        //упаковка (boxing)
        Integer i1 = new Integer(10);

        //int x2 = null; примитив не может хранить null
        Integer i2 = null;//i1 = ссылка, а значит может хранить null

        //автоупаковка (autoboxing)
        Integer i3 = 10;//автоматическое создание объекта класса

        Integer i4 = 10;

        System.out.println(i3 == i4);
        System.out.println(i3 == i1);

        //распаковка (unboxing)
        System.out.println(i1.intValue());

        //автораспаковка (autounboxing)
        System.out.println(i3);
    }
}
