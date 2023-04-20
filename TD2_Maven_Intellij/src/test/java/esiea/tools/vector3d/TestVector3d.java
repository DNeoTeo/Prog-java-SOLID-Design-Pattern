package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVector3d {
	@Test
	void TestVector3dConstructors() {
		Vector3d vector = new Vector3d(1,10,15);
		assertEquals(true, vector.equals(new Entity3d(1,10,15)));
	}
	@Test
	void TestVector3dConstructorsEntity() {
		Entity3d entity = new Entity3d(1,10,15);
		Vector3d vector = new Vector3d(entity);
		assertEquals(true, vector.equals(entity));
	}
	@Test
	void TestVector3dConstructorsEmpty() {
		Vector3d vector = new Vector3d();
		assertEquals(true, vector.equals(new Entity3d(0,0,0)));
	}
	/* example
	   v1 x v2 = | i  j   k |
	             | 3  4   8 |
	             | 7  2   1 |
	           = i(4*1-2*8)-j(3*1-7*8)+k(3*2-4*7)
	    see also https://mathinsight.org/cross_product
	 */
	@Test
	void TestVector3dCross() {
		Vector3d vec1 = new Vector3d(1,0,2);
		Vector3d vec2 = new Vector3d(10,5,9);
		vec1.cross(vec1, vec2);
		assertEquals(true, vec1.equals(new Vector3d(-10,-11,5 )));
	}

	/* https://mathinsight.org/dot_product

	 */
	@Test
	void TestVector3dDotProduct() {
		Vector3d vec1 = new Vector3d(1,0,2);
		Vector3d vec2 = new Vector3d(10,5,9);
		assertEquals(28, vec1.dot(vec2));
	}

	@Test
	void TestVector3dLength() {
		Vector3d vec1 = new Vector3d(1,20,2);
		assertEquals(Math.sqrt(405), vec1.length(), 0.1);
	}

}
