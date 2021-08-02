package models;

import org.junit.*;

import javax.lang.model.type.ArrayType;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }

    @Test
    public void runPinPong_countUpTOGivenNumber_ArrayList() {
        PingPong testPingPong= new PingPong();
        ArrayList<Object> expectedOutPut =new ArrayList<Object>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        assertEquals(expectedOutPut,testPingPong.runPingPong(2));
    }

    @Test
    public void runPingPong_replaceMultiplesOf3_ArrayList() {
        PingPong pingPongTest=new PingPong();
        ArrayList<Object> expectedOutPut= new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        assertEquals(expectedOutPut,pingPongTest.runPingPong(3));
    }

    @Test
    public void runPingPong_replaceMultipleOf3_ArrayList() {
        PingPong pingPongTest= new PingPong();
        ArrayList<Object> expectedOutPut= new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        expectedOutPut.add(4);
        expectedOutPut.add("pong");
        assertEquals(expectedOutPut,pingPongTest.runPingPong(5));

    }

    @Test
    public void runPingPong_replaceMultipleOf3And5_ArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        expectedOutput.add(4);
        expectedOutput.add("pong");
        expectedOutput.add("ping");
        expectedOutput.add(7);
        expectedOutput.add(8);
        expectedOutput.add("ping");
        expectedOutput.add("pong");
        expectedOutput.add(11);
        expectedOutput.add("ping");
        expectedOutput.add(13);
        expectedOutput.add(14);
        expectedOutput.add("pingpong");
        assertEquals(expectedOutput, testPingPong.runPingPong(15));
    }
}