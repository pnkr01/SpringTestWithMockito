package com.pawan.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {
    @Test
    public void test(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(listMock.size(), 3);
    }
}
