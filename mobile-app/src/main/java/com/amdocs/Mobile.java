package com.amdocs;

public class Mobile {
	
	
	private Camera camera;
	
	public Mobile()
	{
		camera = new Camera();
	}
	
	
	public Mobile(Camera camera)
	{
		this.camera=camera;
	}

	public boolean startPhotoApp() 
	{
		System.out.println("Insie photo app method");
		
		if(camera.on())
		{
			System.out.println("Positive code path");
			System.out.println("hardware interaction happens here");
			return true;
		}
		
		System.out.println("Negate code path");
		System.out.println("Log report and generate error");
		return true;
	}

}
