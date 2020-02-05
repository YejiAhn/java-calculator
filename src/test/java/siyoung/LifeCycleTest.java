package siyoung;

import org.junit.jupiter.api.*;

public class LifeCycleTest {
    @BeforeAll
    static void initAll() {
        System.out.println("init All");
    }

    @BeforeEach
    void init() {
        System.out.println("init each");
    }

    @Test
    void someTest() {
        System.out.println("someTest");
    }

    @Test
    void anyTest(){
        System.out.println("anyTest");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }
}
