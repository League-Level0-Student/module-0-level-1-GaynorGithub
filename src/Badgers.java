
public class Badgers {
public static void main(String[] args) {
	bgr(10);
	mush(2);
	bgr(10);
	mush(2);
	bgr(10);
	mush(2);
	bgr(10);
	snak(2);
	snak(3);
	bgr(10);
	mush(2);
}

static void bgr(int i) {
	for (; i > 0; i--) {
		System.out.print("badger, ");
	}
	System.out.println();
}
static void mush(int j) {
	for (; j > 0; j--) {
		System.out.print("mushroom, ");
	}
	System.out.println();
}
static void snak(int k) {
	for (; k > 0; k--) {
		System.out.print("snake, ");
	}
	System.out.println();
}




}






