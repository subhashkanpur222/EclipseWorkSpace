package Javaconcept;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*
 * https://www.javatpoint.com/custom-annotation
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation
{
	int value();
}

class Hello
{
	@MyAnnotation(value=10)
	public void sayHello(){System.out.println("hello annotation");}  	
}
public class JavaCustomAnnotation {

	public static void main(String[] args) {
		Hello h=new Hello();  
		try {
			Method m=h.getClass().getMethod("sayHello");
			MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
			System.out.println("value is: "+manno.value());  
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}

}
