/**
 * jcombinatorics:
 * Java Combinatorics Library
 *
 * Copyright (c) 2009 by Alistair A. Israel.
 *
 * This software is made available under the terms of the MIT License.
 * See LICENSE.txt.
 *
 * Created Aug 25, 2009
 */
package jcombinatorics.permutations;

import org.junit.Test;

/**
 * JUnit test for {@link SepaNPermutationsGenerator}.
 *
 * @author Alistair A. Israel
 */
public final class SepaNPermutationsGeneratorTest extends PnGeneratorTestBase {

    /**
     * Basic test, compare against P(4)
     */
    @Test
    public void testGeneratePermutations() {
        testGenerateP4(new SepaNPermutationsGenerator(N));
    }
}
