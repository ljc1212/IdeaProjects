package helloworld;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ljcstar
 * @date 2020/3/18 - 21:00
 */
public class Hello2 {

    /*模板一.psvm  main方法*/
    public static void main(String[] args) {


        //模板二： sout
        System.out.println("hello" + "ljc");
// 变形：soutp / soutm /soutv / xxx.sout

//      soutp = 输出main里面的值
        System.out.println("args = " + Arrays.deepToString(args));
//        soutm = 输出main函数
        System.out.println("Hello2.main");
//        soutv = 输出void值
        System.out.println("true = " + true);
//        xxx.sout = 值输出
        int num1 = 20;
        System.out.println(num1);
//       模板三：fori   for循环
        String[] arr = new String[]{"l","j","c","ha","ha"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            

        }
//        变形:itar  增强for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
//         变形 ：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
//        模板四：list.for  生成集合list的for循环
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }
        //变形：list.fori 增强版
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


        ArrayList list1 = new ArrayList();
        list1.add(123);
        list1.add(345);
        list1.add(567);
//        模板五：ifn：可生成 if(xxx = null)
        if (list1 == null) {

        }
        if (list1 != null) {

        }
//        inn: 可生成if(xxx != null) 或 xxx.nn 或 xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }
    //模板六： prsf ：可生成 private static final
    private static final hellow hell = new hellow();
    //变形：psf
    public static final int num = 1;
    //变形：psfi
    public static final int num1 = 2;
    //变形：psfs
    public static final String name = "ljc";


}
