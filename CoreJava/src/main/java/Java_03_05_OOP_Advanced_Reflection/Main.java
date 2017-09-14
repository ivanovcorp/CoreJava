package Java_03_05_OOP_Advanced_Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Java Reflection Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException
	{
		/*
		 * What is Metaprogramming?
		 *
		 *
		 * Programming technique in which computer programs have the ability
		 * to treat programs as their data.
		 *
		 * Programs can be designed to:
		 * 	- Read
		 *  - Generate
		 *  - Analyze
		 *  - Transform
		 *
		 * Modify itself while running.
		 */

		/*
		 * What is Reflection?
		 *
		 *
		 * In Java, reflection is a form of metaprogramming since the program
		 * can examine information about itself.
		 *
		 * Extensibility features
		 *
		 * Class libraries and visual development enviornments
		 *
		 * Debuggers and test tools.
		 *
		 * If it is possible to perform an operation without using reflection,
		 * then it is preferable to avoid using it.
		 *
		 * Performance Overhead
		 *
		 * Security Restrictions
		 *
		 * Exposure of internals
		 */

		/*
		 * The Class Object
		 *
		 *
		 * Obtain its java.lang.Class object
		 * 	- if you knowthe name
		 */
		Class myObject = MyObject.class;
		// - if you don't know the name at compile time
		/*try
		{
			Class cls = Class.forName("MyObject");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}*/

		/*
		 * Obtain class name.
		 */
		// - fully qualified class name
		String className = myObject.getName();
		// - class name without the packaging name
		String simpleClassName = myObject.getSimpleName();

		/*
		 * Base class and Interfaces
		 */
		// obtain base class
		Class className2 = myObject.getSuperclass();
		// obtain interfaces
		Class[] interfaces = myObject.getInterfaces();
		/*
		 *  Interfaces are also represented by Class objects in Java Reflection
		 *  Only the interfaces specifically declared implemented by a given class
		 *  is returned.
		 */


		/*
		 * Practical Problem
		 *
		 *
		 * Import Reflection.class
		 * Using reflection print:
		 *  - This claas type
		 *  - Super class type
		 *  - All Interfaces
		 *  - Instantiate object using reflection and print it
		 * Dont change anything in class.
		 */
		System.out.println("Practical problem.");
		Class myClass = Reflection.class;
		System.out.println(myClass);
		System.out.println(myClass.getSuperclass());
		Class[] interfaces2 = myClass.getInterfaces();
		for (Class interfc : interfaces2)
		{
			System.out.println(interfc);
		}

		try
		{
			Reflection rfclCl = (Reflection) myClass.newInstance();
			System.out.println(rfclCl);
		}
		catch (InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		}

		/*
		 * Constructors
		 */
		// Obtain constructors
		Constructor[] ctors = myClass.getConstructors();
		// Obtain all constructors
		Constructor[] allCtors = myClass.getDeclaredConstructors();
		// Get constructor by parameters
		Constructor ctorParam = null;
		try
        {
            ctorParam = myClass.getConstructor(String.class, String.class, String.class);
            System.out.println(ctorParam);
        }
        catch (NoSuchMethodException | SecurityException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		// get parameters type
		Class[] paramType = ctorParam.getParameterTypes();
		// Instantiating objects using constructor
		try
        {
            Reflection reflc2 = (Reflection) ctorParam.newInstance("Test1", "Test2", "Test3");
        }
        catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


		/*
		 * Fields Name and Type
		 */
		// obtain public fields
		Field field = null;
		try
        {
		    field = myClass.getField("email");
        }
        catch (NoSuchFieldException | SecurityException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		Field[] fields = myClass.getFields();
		// obtain all fields
		Field[] allFields = myClass.getDeclaredFields();
		// get field name and type
		String fieldName = field.getName();
		Object fieldType = field.getType();
		// Setting value for a field
		Field name = null;
		try
        {
             name = myClass.getField("name");
        }
        catch (NoSuchFieldException | SecurityException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		Reflection reflc3 = new Reflection();
		Object value = name.get(reflc3);
		name.set(reflc3, value);

		/*
		 * Methods
		 */
		// obtain public methods
		Method[] methods = myClass.getMethods();
		Method method = myClass.getMethod("setEmail", String.class);
		// get methods without parameters
		Method method2 = myClass.getMethod("getEmail", null);
		// obtain method parameters and return type
		Class[] paramTypes = method.getParameterTypes();
		Class returnType = method.getReturnType();
		// get methods without parameters
		Object returnValue = method.invoke(reflc3, null);

		/*
		 * Access Modifiers
		 */
		// obtain the class modifiers like this
		int modifers = myClass.getModifiers();
		// each modifier is a flag bit that is either set or cleared
		// you can check the modifiers
		Modifier.isPrivate(modifers);
		Modifier.isProtected(modifers);
		Modifier.isPublic(modifers);
		Modifier.isStatic(modifers);

	}
}
