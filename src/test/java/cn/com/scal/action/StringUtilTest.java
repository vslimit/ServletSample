package cn.com.scal.action;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vslimit on 17/3/5.
 */
public class StringUtilTest {

    @Test
    public void testBlank() {
        boolean flag = StringUtil.blank("");
        assertTrue(flag);
//        flag = StringUtil.blank(null);
//        assertFalse(flag);
    }
}