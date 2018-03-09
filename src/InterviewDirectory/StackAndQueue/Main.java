package InterviewDirectory.StackAndQueue;

import java.util.Arrays;
import java.util.List;

/**
 * Created by huali on 2018/3/9.
 */
public class Main {
    public static void main(String []args)
    {
        ////1.sort排序String[]数组：升序:从小到大
        //String[] names = { "Liz", "John", "Eric", "Alan" };
        ////只排序前两个
        ////[John, Liz, Eric, Alan]
        //Arrays.sort(names, 0, 2);
        ////全部排序
        ////[Alan, Eric, John, Liz]
        //Arrays.sort(names);
        //String [] name = {"li","ad","sf","qw"};
        //Arrays.sort(name);
        //
        ////2.使用该方法可以返回一个固定大小的List，如：
        //List<String> str= Arrays.asList("welcome","to","fsdg");
        //List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        //int[]a={1,2,3,4};
        //
        ////3.toString()方法：方便我们打印出数组的内容。int[] ,String[],long[],boolean[]...
        //System.out.println(Arrays.toString(name));
        //System.out.println(Arrays.toString(a));
        //
        ////4.deepToString:方法：打印二维数组，任何类型；
        //int[][] twoD={{1,2,3,4},{3,6,7,8}};
        //System.out.println(Arrays.deepToString(twoD));
        //
        ////5.equals：方法：使用Arrays.equals().来比较1维数组是否相等。
        //String[] names1 = { "Eric", "John", "Alan", "Liz" };
        //String[] names2 = { "Eric", "John", "Alan", "Liz" };
        //System.out.println(Arrays.equals(names1,names2));
        //
        ////6.Arrays.deepEquals能够去判断更加复杂的数组是否相等。
        //int[][] stuGrades1 = { { 80, 81, 82 }, { 84, 85, 86 }, { 87, 88, 89 } };
        //int[][] stuGrades2 = { { 80, 81, 82 }, { 84, 85, 86 }, { 87, 88, 89 } };
        //System.out.println(Arrays.deepEquals(stuGrades1, stuGrades2));
        //
        ////7.fill()方法，用某个数组填充数组。
        //int[] array1 = new int[8];
        //Arrays.fill(array1, 1);
        ////[1, 1, 1, 1, 1, 1, 1, 1]
        //System.out.println(Arrays.toString(array1));
        //Arrays.fill(array1, 3);
        //System.out.println(Arrays.toString(array1));


        Stack1_getMin stack =new Stack1_getMin();
        stack.push1(1);
        stack.push1(2);
        stack.push1(1);
        stack.push1(5);
        stack.push1(4);
        stack.push1(3);
        int s1= stack.pop1();
        System.out.println(s1);
        int s2= stack.pop1();
        System.out.println(s2);
        int s3= stack.pop1();
        System.out.println(s3);
        int s4= stack.pop1();
        System.out.println(s4);
        int s5= stack.pop1();
        System.out.println(s5);
        int s6= stack.pop1();
        System.out.println(s6);


    }
}