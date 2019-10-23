package com.aklilu.arrayflattener;

import org.junit.Test;

import com.aklilu.arrayflattener.ArrayFlattener;

import static org.junit.Assert.*;

public class ArrayFlattenerTest
{

    ArrayFlattener arrayFlattener = new ArrayFlattener();

    @SuppressWarnings("deprecation")
	@Test
    public void flattenArray()
    {
        Integer [][] input = {{2,3}, {8}, {4,7,9}};
        Integer [] expected = {2,3,8,4,7,9};
        assertEquals(expected,arrayFlattener.flattenArray(input));
    }

    @Test
    public void nulltest()
    {
        Integer [][] input = {};
        assertNull(arrayFlattener.flattenArray(input));
    }

}