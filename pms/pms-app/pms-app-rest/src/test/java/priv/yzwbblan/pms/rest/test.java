package priv.yzwbblan.pms.rest;

import java.io.File;

public class test {
	public static void main(String[] args) {
		File[] file = File.listRoots();
		System.out.println(file.length);
		for(File f : file) {
			System.out.println(f.getAbsolutePath());
		}
		
	}
}
