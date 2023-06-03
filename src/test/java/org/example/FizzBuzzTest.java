package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz target = new FizzBuzz();

//    @Test
//    public void 数字1を渡すと1と返す() {
//        String expected = "1";
//        String actual = target.sayFizzBuzz(1);
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void 数字2を渡すと2と返す() {
//        String expected = "2";
//        String actual = target.sayFizzBuzz(2);
//        assertEquals(expected,actual);
//    }
//    @Test
//    public void 数字3を渡すとFizzと返す() {
//        String expected = "Fizz";
//        String actual = target.sayFizzBuzz(3);
//        assertEquals(expected,actual);
//    }
//    @Test
//    public void 数字4を渡すと4と返す() {
//        String expected = "4";
//        String actual = target.sayFizzBuzz(4);
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void 数字5を返すとBuzzを返す() {
//        String expected = "Buzz";
//        String actual = target.sayFizzBuzz(5);
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void 数字15を渡すとFizzBuzzを返す() {
//        String expected = "FizzBuzz";
//        String actual = target.sayFizzBuzz(15);
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void 数字3の倍数を渡すとFizzを返す() {
//        String expected = "Fizz";
//        String actual = target.sayFizzBuzz(3);
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void 数字5の倍数を渡すとBuzzを返す() {
//        String expected = "Buzz";
//        String actual = target.sayFizzBuzz(5);
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void 数字15の倍数を渡すとFizzBuzzを返す() {
//        String expected = "FizzBuzz";
//        String actual = target.sayFizzBuzz(15);
//        assertEquals(expected,actual);
//    }

    @Test
    public void 数字3の倍数でも5の倍数でもないものを渡すと数字自身を返す() {
        String expected = "4";
        String actual = target.sayFizzBuzz(4);
        assertEquals(expected,actual);
    }

    @Test
    public void 数字が0以下の時は例外を返す() {
        assertThrows(Exception.class, () -> {
            target.sayFizzBuzz(0);
        });
        assertThrows(Exception.class, () -> {
            target.sayFizzBuzz(-3);
        });
    }
}