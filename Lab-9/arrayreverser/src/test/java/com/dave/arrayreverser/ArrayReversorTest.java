package com.dave.arrayreverser;

import com.aklilu.arrayreverser.ArrayReversor;
import com.aklilu.arrayreverser.service.ArrayFlattener;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayReversorTest
{

    ArrayFlattener flattener = mock(ArrayFlattener.class);

    ArrayReversor arrayReversor = new ArrayReversor(flattener);

    @SuppressWarnings("deprecation")
	@Test
    public void reversedandflattened()
    {
        Integer [][] input = {{2,3}, {8}, {4,7,9}};
        when(flattener.flatten(any())).thenReturn(new Integer[]{2,3,8,4,7,9});
        Integer [] expected = new Integer[]{9,5,4,0,3,1};
        assertEquals(expected,arrayReversor.reversedandflattened(input));
    }

    @Test
    public void nulltest()
    {
        when(flattener.flatten(any())).thenReturn(new Integer[]{2,3,8,4,7,9});
        Integer [][] input = {{2,3}, {8}};
        assertNotNull(arrayReversor.reversedandflattened(input));
    }


}