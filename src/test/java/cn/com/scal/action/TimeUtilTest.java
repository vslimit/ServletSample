package cn.com.scal.action;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vslimit on 17/3/5.
 */
public class TimeUtilTest {
    @Test
    public void testAdd() throws Exception {
        int a = TimeUtil.add(2,3);
        assertEquals(a,6);
    }

}