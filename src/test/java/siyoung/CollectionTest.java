package siyoung;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {
    @Test
    void arrayList() {
        ArrayList value = new ArrayList();
        value.add("first");
        value.add("Second");
        assertThat(value.add("third")).isTrue();
        assertThat(value.size()).isEqualTo(3);
        assertThat(value.get(0)).isEqualTo("first");
        assertThat(value.contains("first")).isTrue();
        assertThat(value.remove("first")).isTrue();
        assertThat(value.size()).isEqualTo(2);
    }
}
