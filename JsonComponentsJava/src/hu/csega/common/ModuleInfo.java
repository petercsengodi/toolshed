package hu.csega.common;

import java.util.TreeSet;

public class ModuleInfo {

	private static TreeSet<String> packageSet = new TreeSet<String>();
	static { new ModuleInfo(ModuleInfo.class); }		
	
	public ModuleInfo(Class<?> referencerClass) {
		String packageName = referencerClass.getPackage().getName();
		checkPackageStatus(packageName);
	}

	public ModuleInfo(String packageName) {
		checkPackageStatus(packageName);
	}
	
	private void checkPackageStatus(String packageName) {
		if(!packageSet.contains(packageName)) {
			packageSet.add(packageName);
			System.out.println("Included module: " + packageName);
		}
	}
}