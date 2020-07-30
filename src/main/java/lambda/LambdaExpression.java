package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: Eric.Zhang
 * @Date: 2020/3/25 14:40
 */
public class LambdaExpression {

    public static void main(String[] args) {
        //无参无返回
        Interfaces.NoReturnNoParam noReturnNoParam = () -> System.out.println("NoReturnNoParam");

        //一个参数无返回
        Interfaces.NoReturnOneParam noReturnOneParam = (int a) -> System.out.println("NoReturnOneParam:" + a);

        //多个参数无返回
        Interfaces.NoReturnMultiParam noReturnMultiParam = (int a, int b) -> System.out.println("NoReturnMultiParam:" + a + "-" + b);

        //无参有返回
        Interfaces.ReturnNoParam returnNoParam = () -> {
            System.out.println("ReturnNoParam");
            return 1;
        };

        //一个参数有返回
        Interfaces.ReturnOneParam returnOneParam = (int a) -> {
            System.out.println("NoReturnOneParam:" + a);
            return a;
        };

        //多个参数有返回
        Interfaces.ReturnMultiParam returnMultiParam = (int a, int b) -> {
            System.out.println("NoReturnMultiParam:" + a + "-" + b);
            return 1;
        };

        noReturnNoParam.method();
        noReturnOneParam.method(1);
        noReturnMultiParam.method(1, 2);
        System.out.println(returnNoParam.method());
        System.out.println(returnOneParam.method(1));
        System.out.println(returnMultiParam.method(1, 2));

        System.out.println("------------------------------");

        //下面是简化版语句

        //1.简化参数类型，可以不写参数类型，但是必须所有参数都不写
        Interfaces.ReturnMultiParam simplify1 = (a, b) -> {
            System.out.println("NoReturnMultiParam:" + a + "-" + b);
            return 1;
        };

        //2.简化参数小括号，如果只有一个参数则可以省略参数小括号
        Interfaces.ReturnOneParam simplify2 = a -> {
            System.out.println("NoReturnMultiParam:" + a);
            return a;
        };

        //3.简化方法体大括号，如果方法条只有一条语句，则可以胜率方法体大括号
        Interfaces.NoReturnNoParam simplify3 = () -> System.out.println("NoReturnOneParam");

        //4.如果方法体只有一条语句，并且是 return 语句，则可以省略方法体大括号
        Interfaces.ReturnOneParam simplify4 = a -> a + 3;

        simplify1.method(1, 2);
        simplify2.method(1);
        simplify3.method();
        System.out.println(simplify4.method(1));

        System.out.println("------------------------------");

        //遍历集合/删除
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        list.removeIf(element -> element == 5);
        list.forEach(System.out::println);

        System.out.println("------------------------------");

        //集合排序
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(13, "背心", 7.80));
        items.add(new Item(11, "半袖", 37.80));
        items.add(new Item(14, "风衣", 139.80));
        items.add(new Item(12, "秋裤", 55.33));

        //这里原本的写法是items.sort((o1, o2) -> o1.getId() - o2.getId());
        //切换更有意思的写法
        items.sort(Comparator.comparingInt(Item::getId));

        items.forEach(item -> System.out.println(item.toString()));
    }
}
