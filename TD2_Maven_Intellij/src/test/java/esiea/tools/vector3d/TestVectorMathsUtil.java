package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestVectorMathsUtil {
    @Test
    void TestdoubleToLongBits(){
        assertEquals(Double.doubleToLongBits(0.5), VectorMathsUtil.doubleToLongBits(0.5));
        assertEquals(0L,VectorMathsUtil.doubleToLongBits(0));
    }


}
