package encryption;

import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * @Author: Eric.Zhang
 * @Description: idea key加密破解测试类
 * @ProjectName: some-demos
 * @Date: 2020/7/24 16:03
 */
public class Encryption {
    private static final int ONE_HUNDRED_MILLION = 100000000;

    /**
     * idea key加密破解
     * @param args main函数参数
     */
    public static void main(String[] args) {
        String str = new String("73.25".getBytes(StandardCharsets.UTF_8));
        for (int i = 0; i < ONE_HUNDRED_MILLION; i++) {
            str = DigestUtils.md2Hex(str);
            if (i % 100000 == 0) {
                //显示当前进度
                System.out.println(i);
            }
        }
        System.out.println(str);
    }
}
