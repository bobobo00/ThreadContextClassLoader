package ClassLoad;

public class TreadContextClassLoader {
	public static void main(String[] args) throws Exception {
		ClassLoader loader=TreadContextClassLoader.class.getClassLoader();
		System.out.println(loader);
		
		ClassLoader loader2=Thread.currentThread().getContextClassLoader();
		System.out.println(loader2);
		
		Thread.currentThread().setContextClassLoader(new FileSystemClassLoader("E:/javac/"));
		System.out.println(Thread.currentThread().getContextClassLoader());
		
		Class clazz=Thread.currentThread().getContextClassLoader().loadClass("Hi");
		System.out.println(clazz);
		System.out.println(clazz.getClassLoader());
		
	}

}
