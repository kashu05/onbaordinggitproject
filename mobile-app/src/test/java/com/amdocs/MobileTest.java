package com.amdocs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;



public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFuntionsNormally() 
	{
		Camera mockedCamera = mock(Camera.class);
		
		//stubbing- hard coding response of dependent method
		
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals(expectedResponse, actualResponse);
		
		
		Mockito.verify(mockedCamera,Mockito.times(1)).on();
		
	}

}
