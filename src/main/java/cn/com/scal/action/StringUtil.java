package cn.com.scal.action;

/**
 * Created by vslimit on 17/3/5.
 */
public class StringUtil {

    private StringUtil() {

    }

    public static boolean blank(String str) {
        return null==str || str.trim().equals("");
    }
}
