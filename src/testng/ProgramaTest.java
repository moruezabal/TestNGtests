package testng;

import org.testng.annotations.Test;

import usuario.Usuario;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ProgramaTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("f("+s+")");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod()");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod()");
  }


  @DataProvider
  public Object[][] dp() {
	  System.out.println("dp()");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass()");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest()");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest()");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite()");
  }


  @Test
  public void addProgramacion() {
	  System.out.println("addProgramacion");
  }

  @Test
  public void eliminarProgramaciones() {
	  System.out.println("EliminarProgramaciones");
  }

  @Test
  public void getCantOcurrencias() {
	  System.out.println("getCantOcurrencias");
  } 

  @Test
  public void getCantProgramaciones() {
	  System.out.println("getCantProgramaciones()");
  }

  @Test
  public void getCantTareasEntre() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void programaVacio() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void removeProgramacion() {
  	System.out.println("Remove Programacion");
    throw new RuntimeException("Test not implemented");
  }
  
  @DataProvider (name = "generador-usr")
  public Usuario[] dpUsers() {
	  System.out.println("Generando Usuarios");
	  Usuario ret []= new Usuario[7];
	  	
	   ret [0] =  new Usuario("Juan","1979-01-01",42,true);
	   ret [1] =  new Usuario("Pedro","1980-02-01",41,true);
	   ret [2] =  new Usuario("Maria","1981-03-01",47,true);
	   ret [3] = new Usuario("Cecilia","1983-04-01",38,true);
	   ret [4] =  new Usuario("Carlos","1985-04-01",36,true);
	   ret [5]  = new Usuario("Jose","1987-04-01",34,true);
	   ret [6] =   new Usuario("Quique", "23-01-1980",41, true );
	  return ret;
          
  }
  
    @Test(dataProvider = "generador-usr")
  public void testUsr(Usuario u) {
	  System.out.println("f("+u.getNombre()+")");
  }
}