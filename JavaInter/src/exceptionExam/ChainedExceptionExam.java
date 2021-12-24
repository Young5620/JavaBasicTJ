package exceptionExam;

public class ChainedExceptionExam {
	
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		}
		catch (SpaceException se) { //용량부족에러
			InstallException ie = new InstallException("설치중에러");
			ie.initCause(se);
			throw ie;
		}
		catch (MemoryException me) {
			InstallException ie = new InstallException("설치중에러");
			ie.initCause(me);
			throw ie;
		}
		finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
			//throw new RuntimeException(MemoryException("메모리가 부족합니다."));
		}
	}
	static void copyFiles() {
		
	}
	static void deleteTempFiles() {
		
	}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
	
	class InstallException extends Exception{
		InstallException(String msg) {
			super (msg);
		}
	}
	
	class SpaceException extends Exception {
		SpaceException(String msg) {
			super (msg);
		}
	}
	
	class MemoryException extends Exception {
		MemoryException(String msg) {
			super (msg);
		}
	}

	public static void main(String[] args) {
		try {
			install();
		}
		catch (InstallException e) {
			System.out.println("InstallException");
		}
		catch (Exception e ) {
			System.out.println("Exception");
		}
	}

}
