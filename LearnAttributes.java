package week6.day2;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = 1,enabled = false)
	
	public void createlead()
	{
		System.out.println("Create Lead");
	}  

	@Test(priority = -1)
	
	public void editLead() {
	
		System.out.println("Edit Lead");
		
	}
	
	@Test(invocationCount=5)
	public void deletelead() {
		
		System.out.println("Delete Lead");
		
	}
	
	@Test(priority= -2, dependsOnMethods= {"deletlead"})
	public void Createlead() {
		
		System.out.println("Create Lead");
		
	}
}
