package siyoung;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void isEmpty() {
        assertThat("".isEmpty()).isTrue();
        assertThat("  ".isEmpty()).isFalse();
        assertThat("  ".trim().isEmpty()).isTrue();
        assertThat("         ".trim().isEmpty()).isTrue();
        assertThat("a".isEmpty()).isFalse();
    }

    @Test
    void lastIndexOf() {
        assertThat("asdf".lastIndexOf("f")).isEqualTo(3);
    }

    @Test
    void compareToIgnoreCase() {
        assertThat("SIyoung".compareToIgnoreCase("siyoung")).isEqualTo(0);
        assertThat("SIyoung".compareToIgnoreCase("siasdyoung")).isGreaterThan(0);
    }

    @Test
    public void 문자열_길이_구하기() throws Exception {
        String name = "카일";
        assertThat(name.length()).isEqualTo(2);
    }

    @Test
    public void 문자열_더하기() {
        String name = "카일";
        String realName = "(시영)";
        assertThat(name+realName).isEqualTo("카일(시영)");
    }

    @Test
    public void 문자열을_문자_단위로_출력() {
        String name = "김시영";
        String[] nameArray = name.split("");
        assertThat(nameArray).containsExactly("김","시","영");
    }

    @Test
    public void 문자열_뒤집기() {
        String name = "김시영";
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        assertThat(sb.reverse().toString()).isEqualTo("영시김");
    }

    @Test
    public void append() {
        assertThat(createMessage(17)).isEqualTo("우테코는 17명이다");
    }

    private String createMessage(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append("우테코는 ").append(number).append("명이다");
        return sb.toString();
    }

    @Test
    public void 다양한_예외_처리() {
        String name = null;

        assertThatThrownBy(()->{
            name.length(); name.isEmpty();
        }).isInstanceOf(NullPointerException.class);

        assertThatThrownBy(()->{
            ExampleClass.transfer("abc");
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(()->{
            FileInputStream in = new FileInputStream("hello.txt");
        }).isInstanceOf(IOException.class);
    }
}
