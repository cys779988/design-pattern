package study.abstract_factory;

public class SamsungComputerFactory implements ComputerFactory {
	public SamsungKeyboard createKeyboard() {
		return new SamsungKeyboard();
	}
	
	public SamsungMouse createMouse() {
		return new SamsungMouse();
	}
}
