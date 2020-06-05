package com.test.unit;
import static org.junit.Assert.*;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
* Tests for {@link Foo}.
* @author user@example.com (John Doe)
*/

@RunWith(JUnit4.class)
public class JunitBasicTest {
    @Test
    public void thisAlwaysPasses() {
        assertEquals(2,2);
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
        assertEquals(1,2);
    }
    
    @Test
    public void givenPassword_whenHashingUsingCommons_thenVerifying()  {
        String hash = "9a93efa79aa9f5d35e14bc55a3e16dc4";
        String password = "test123@gmail.com";
     
        String md5Hex = DigestUtils.md5Hex(password);
             
        assertTrue(md5Hex.equals(hash));
    }
    
    
}




