package esiea.tools.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPasswordValidator {

	@Test
	void TestValidatorF() {
		PasswordValidator pv = new PasswordValidator();
		//less than 6
		assertEquals(pv.validatePassword("12345"), false);
		//add here other tests according to specification
		assertEquals(pv.validatePassword("012345"), true);
		assertEquals(pv.validatePassword("0123454678901234546789"), false);
		assertEquals(pv.validatePassword("azodzd8523"), true);
		assertEquals(pv.validatePassword("az12"), false);
		assertEquals(pv.validatePassword("01234546789azerqsdfcv"), false);
		assertEquals(pv.validatePassword("odzdlhbljhyfjjgccghj"), false);
		assertEquals(pv.validatePassword("odzdlhbljhyzdfjjgccgh"), false);
		assertEquals(pv.validatePassword("ze"), false);

		assertEquals(pv.validatePassword("perzgnè_-30958"), true);
		assertEquals(pv.validatePassword("#{[|^"), false);
		assertEquals(pv.validatePassword("é#{[|^@]=:;/"), false);
		assertEquals(pv.validatePassword("é#{[|^@]=:;/ƒN7¨¥"), true);
		assertEquals(pv.validatePassword("é#{[|^@]=:;/ƒN7¨¥é#{[|^@]=:;/ƒN7¨¥"), false);
		assertEquals(pv.validatePassword("}─*þ(þx☺☻7║┼Q"), true);
		assertEquals(pv.validatePassword("12"), false);
		assertEquals(pv.validatePassword("azertyuiopomlkjhgfdsqwxcvbnazertyuiolkjhgfdsqsdfbvcsrtyh"), false);
		assertEquals(pv.validatePassword("N`#↑?↓♀õı4ÄeƒÊ}♥)■"), true);

	}


}
