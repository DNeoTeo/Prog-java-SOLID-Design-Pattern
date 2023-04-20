package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
public class TestEntity3d {

    @Test
    void TestEntity3dVoidConstructor() {
        Entity3d entity = new Entity3d();
        assertEquals(entity.x,0);
        assertEquals(entity.y,0);
        assertEquals(entity.z,0);
    }

    @Test
    void TestEntity3dCopyConstructor() {
        Entity3d entity = new Entity3d(new Entity3d(5,10,9));
        assertEquals(entity.x,5);
        assertEquals(entity.y,10);
        assertEquals(entity.z,9);
    }
    @Test
    void TestEntity3dConstructor() {
        Entity3d entity = new Entity3d(5,10,9);
        assertEquals(entity.x,5);
        assertEquals(entity.y,10);
        assertEquals(entity.z,9);
    }
    @Test
    void TestToString() {
        Entity3d entity = new Entity3d(1,10,5);
        assertEquals( "(1.0,10.0,5.0)",entity.toString());
    }

    @Test
    void TestScale() {
        Entity3d entity = new Entity3d(1,10,5);
        entity.scale(10);
        assertEquals(entity.x,10);
        assertEquals(entity.y,100);
        assertEquals(entity.z, 50);
    }

    @Test
    void TestScaleEntity() {
        Entity3d entity = new Entity3d(1,10,5);
        entity.scale(10, entity);
        assertEquals(entity.x,10);
        assertEquals(entity.y,100);
        assertEquals(entity.z, 50);
    }

    @Test
    void TestAdd() {
        Entity3d entity1 = new Entity3d(1,10,5);
        Entity3d entity2 = new Entity3d(2,4,5);
        entity1.add(entity2);
        assertEquals(entity1.x,3);
        assertEquals(entity1.y,14);
        assertEquals(entity1.z, 10);
    }

    @Test
    void TestHashCode() {
        Entity3d entity = new Entity3d(1,10,5);
        long bits = 1L;
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(entity.x);
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(entity.y);
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(entity.z);
        assertEquals(entity.hashCode(),(int) (bits ^ (bits >> 32)));

    }

    @Test
    void TestEquals() {
        Entity3d entity1 = new Entity3d(1,10,5);
        Entity3d entity2 = new Entity3d(1,100,15);
        assertEquals(entity1.equals(entity2), false);
        assertEquals(entity1.equals(entity1), true);
        assertEquals(entity1.equals(null), false);
     }

    @Test
    void TestEpsilonEquals() {
        Entity3d entity = new Entity3d(12,25,6);
        assertEquals(false, entity.epsilonEquals(new Entity3d(10,5,2),0.5));
        assertEquals(false, entity.epsilonEquals(new Entity3d(12,5,2),0.5));
        assertEquals(false, entity.epsilonEquals(new Entity3d(12,25,2),0.5));
        assertEquals(true, entity.epsilonEquals(new Entity3d(12,25,6),0.5));

    }
}