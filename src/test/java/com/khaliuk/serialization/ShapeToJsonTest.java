package com.khaliuk.serialization;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ShapeToJsonTest {
    List<Shape> list1;
    List<Shape> list2;
    List<Shape> list3;
    List<Shape> list4;
    Shape group1;
    Shape group2;
    Shape group3;
    Shape mainGroup;
    ShapeToXml xmlEncoder;

    @Before
    public void setUp() {
        list1 = new ArrayList<>();
        list1.add(new Triangle(new double[]{3.0, 4.0, 5.0}));
        list1.add(new Square(3.3));
        list1.add(new Circle(2.5));
        group1 = new Group(list1);

        list2 = new ArrayList<>();
        list2.add(new Triangle(new double[]{6.0, 8.0, 10.0}));
        list2.add(new Square(3.7));
        list2.add(new Circle(2.8));
        list2.add(group1);
        group2 = new Group(list2);

        list3 = new ArrayList<>();
        list3.add(new Triangle(new double[]{9.0, 5.0, 12.0}));
        list3.add(new Square(5.3));
        list3.add(new Circle(7.5));
        group3 = new Group(list3);

        list4 = new ArrayList<>();
        list4.add(new Triangle(new double[]{1.5, 2.0, 2.5}));
        list4.add(new Square(0.3));
        list4.add(new Circle(2.25));
        list4.add(group3);
        list4.add(group2);
        mainGroup = new Group(list4);
    }

    @Test
    public void testEncodeReturnsProperFormattedJsonString() {
        String expectedResult = "{ \"shapes\" : [\n" +
                "\t\t{\n" +
                "\t\t\t\"side0\" : \"1.5\",\n" +
                "\t\t\t\"side1\" : \"2.0\",\n" +
                "\t\t\t\"side2\" : \"2.5\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"side\" : \"0.3\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"radius\" : \"2.25\"\n" +
                "\t\t},\n" +
                "\t{ \"shapes\" : [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"side0\" : \"9.0\",\n" +
                "\t\t\t\t\"side1\" : \"5.0\",\n" +
                "\t\t\t\t\"side2\" : \"12.0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"side\" : \"5.3\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"radius\" : \"7.5\"\n" +
                "\t\t\t}\n" +
                "\t\t]},\n" +
                "\t{ \"shapes\" : [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"side0\" : \"6.0\",\n" +
                "\t\t\t\t\"side1\" : \"8.0\",\n" +
                "\t\t\t\t\"side2\" : \"10.0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"side\" : \"3.7\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"radius\" : \"2.8\"\n" +
                "\t\t\t},\n" +
                "\t\t{ \"shapes\" : [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"side0\" : \"3.0\",\n" +
                "\t\t\t\t\t\"side1\" : \"4.0\",\n" +
                "\t\t\t\t\t\"side2\" : \"5.0\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"side\" : \"3.3\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"radius\" : \"2.5\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]}\n" +
                "\t\t]}\n" +
                "\t]}\n";
        String actualResult = ShapeToJson.encode(mainGroup);
        assertEquals(expectedResult, actualResult);
    }
}
