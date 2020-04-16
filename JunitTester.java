import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class JunitTester {
	
	//Animal class tester
	String[] travel = new String[] { "flight", "walk" };

	@Test
	public void testConstructor1() throws IOException{
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
	}
	
	@Test
	public void testConstructor2() {
		Animal bird3 = new Animal("bird3", "b2");
	}
	
	@Test
	public void testName() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String name = bird.getName();
		assertEquals(name, "bird1");
	}
	
	@Test
	public void testDiet() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String diet = bird.getDiet();
		assertEquals(diet, "nuts");
	}
	
	@Test
	public void testRegion() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String region = bird.getCommonRegion();
		assertEquals(region, "tree");
	}
	
	@Test
	public void testBiome() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String biome = bird.getPreferredBiome();
		assertEquals(biome, "woods");
	}
	
	@Test
	public void testClass() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String type = bird.getAnimalClass();
		assertEquals(type, "bird");
	}
	
	@Test
	public void testTravel() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String[] travels = bird.getTravelMethods();
		assertEquals(travels[0], travel[0]);
		assertEquals(travels[1], travel[1]);
	}
	
	@Test
	public void testLimbs() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		int limbs = bird.getNumOfLimbs();
		assertEquals(limbs, 4);
	}
	
	@Test
	public void testLife() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		int life = bird.getAverageLifespan();
		assertEquals(life, 5);
	}
	
	@Test
	public void testBlood() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		int blood = bird.getColdOrWarmBlooded();
		assertEquals(blood, 0);
	}
	
	@Test
	public void testFile() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		File name = bird.getAnimalFile();
		File name2 = new File("B2Storage.dat");
		assertEquals(name, name2);
	}
	
	@Test
	public void testFilename() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String name = bird.getFilename();
		assertEquals(name, "B2Storage.dat");
	}
	
	@Test
	public void testTraits() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		String[] traits = bird.getTraits();
		assertEquals(traits[0], "bird1");
		assertEquals(traits[1], "nuts");
		assertEquals(traits[2], "tree");
		assertEquals(traits[3], "woods");
		assertEquals(traits[4], "bird");
		assertEquals(traits[5], "4");
		assertEquals(traits[6], "5");
		assertEquals(traits[7], "warm blooded");
	}
	
	@Test
	public void testSave() throws IOException {
		Animal bird = new Animal("bird1", "nuts", "tree", "woods", "bird",
				4, 5, travel, "B2", "warm");
		bird.saveAnimal();
		File file = new File("B2Storage.dat");
		assertTrue(file.exists());
	}
	
	//end of Animal tests
	
	
	//Junit tests for the account class
	String username = "testname";
	String password = "password";
	boolean admin = false;
	
	@Test
	public void testConstructor3() throws IOException{
		Accounts accounts = new Accounts();
	}
	
	@Test
	public void testMakeAccount1() throws IOException{
		Accounts accounts = new Accounts();
		accounts.Makeaccount(username,password);
	}
	
	@Test
	public void testMakeAccount2() throws IOException{
		Accounts accounts = new Accounts();
		accounts.Makeaccount(username,password,admin);
	}
	
	@Test
	public void testCheckAccount() throws IOException{
		Accounts accounts = new Accounts();
		assertFalse(accounts.hasAccount(username, password));
		accounts.Makeaccount(username,password,admin);
		assertTrue(accounts.hasAccount(username, password));
	}
	
	@Test
	public void testCanLogin() throws IOException{
		Accounts accounts = new Accounts();
		assertFalse(accounts.canLogIn(username, password));
		accounts.Makeaccount(username,password,admin);
		assertTrue(accounts.canLogIn(username, password));
	}
	

}
