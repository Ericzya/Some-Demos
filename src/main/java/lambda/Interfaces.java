package lambda;

/**
 * @Author: Eric.Zhang
 * @Date: 2020/3/25 14:47
 */
public interface Interfaces {

    @FunctionalInterface
    interface NoReturnMultiParam {
        /**
         * 多参数无返回
         *
         * @param a 参数a
         * @param b 参数b
         */
        void method(int a, int b);
    }

    @FunctionalInterface
    interface NoReturnNoParam {
        /**
         * 无参无返回值
         */
        void method();
    }


    @FunctionalInterface
    interface NoReturnOneParam {
        /**
         * 一个参数无返回
         *
         * @param a 参数a
         */
        void method(int a);
    }

    @FunctionalInterface
    interface ReturnMultiParam {
        /**
         * 多个参数有返回值
         *
         * @param a 参数a
         * @param b 参数b
         * @return 返回值
         */
        int method(int a, int b);
    }

    @FunctionalInterface
    interface ReturnNoParam {
        /**
         * 无参有返回
         *
         * @return 返回值
         */
        int method();
    }

    @FunctionalInterface
    interface ReturnOneParam {
        /**
         * 一个参数有返回值
         *
         * @param a 参数a
         * @return 返回值
         */
        int method(int a);
    }
}