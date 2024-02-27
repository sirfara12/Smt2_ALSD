package PT2;
public class DragonMain {
        public static void main(String[] args) {
            Dragon dragon1 = new Dragon(18, 5, 18, 20);
            dragon1.meveleft();
            dragon1.moveRight();
            dragon1.moveUp();
            dragon1.moveDown();
            dragon1.printPosition();
        }
    }
    