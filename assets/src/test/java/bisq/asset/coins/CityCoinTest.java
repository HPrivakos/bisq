/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class CityCoinTest extends AbstractAssetTest {

    public CityCoinTest() {
        super(new CityCoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("CbD7yF1u2zaaRfaA23FPPzSpWSbR5GcMgL");
        assertValidAddress("CGn2rCBHUiHAAWq6xU96svnc5gTSjD83Xg");
        assertValidAddress("CUkEhqq3ZxcRM2CP6Y7BZtTMfcAgsTd8SS");

    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("CP9wkjuUvTGuTmynNFiktqPjN4r7ptb17k0");
        assertInvalidAddress("17VZNX1SN5NtKa8UQFxwQbFeFc3iqRYheO");
        assertInvalidAddress("DEa7damK8MsbdCJztidBasZKVsDLJifWfE");
        assertInvalidAddress("CUkEhqq3ZxcRM2CP6Y7BZtTMfcAgsTd8S#");

    }
}
