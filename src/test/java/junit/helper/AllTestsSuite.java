package junit.helper;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArraysCompareTest.class, StringHelperParameterizedTest.class, StringHelperTest.class})
public class AllTestsSuite {
}
