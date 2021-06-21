package utill;

public class Util {
	public static String getClassName() {
		return Thread.currentThread().getStackTrace()[2].getClassName();
	}

	public static String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	public static String getClassMehtodName() {
		return getClassName() + "_" + getMethodName();
	}
}