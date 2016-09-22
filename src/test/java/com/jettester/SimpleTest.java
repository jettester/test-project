package com.jettester;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SimpleTest {

    @Test
    public void passed() {
        assertThat(2 + 2, equalTo(4));
    }

    @Test
    public void failed() {
        assertThat(2 * 2, equalTo(4));
    }

    @Test
    @Ignore
    public void skipped() {
        assertThat(2, equalTo(7));
    }
}
