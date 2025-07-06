public class Main2 {
    public static void main(String[] args) {
        Turtle tao = new Turtle();
        tao.speed(3);

        // 1. วาดพระจันทร์ (บนกลางภาพ)
        drawMoon(tao, 0, 100);

        // 2. วาดดอกบัว (ล่างซ้าย)
        drawLotus(tao, -150, -150);

        // 4. วาดเทียน (ล่างขวา)
        drawCandle(tao, 0, -50);
    }

    // draw moon
    public static void drawMoon(Turtle tao, int x, int y) {
        tao.up();
        tao.setPosition(-50, 0); //move the origin
        tao.down();
        for (int i = 0; i < 180; i++) {
            tao.forward(2);
            tao.left(2);
        }
    }

    // draw lotus
    public static void drawLotus(Turtle tao, int x, int y) {
        tao.penColor("pink");
        tao.width(2);
        tao.up();
        tao.setPosition(x, y);
        tao.down();

        // draw 3 petals
        for (int layer = 0; layer < 3; layer++) {
            for (int i = 0; i < 8; i++) {
                // draw
                for (int j = 0; j < 45; j++) {
                    tao.forward(1);
                    tao.left(1);
                }
                tao.left(45); // หมุนเตรียมวาดกลีบต่อไป
            }
            tao.forward(15); // ขยับออกด้านนอกรอวาดเทียน
        }
    }

    // draw candle
    public static void drawCandle(Turtle tao, int x, int y) {

        tao.penColor("yellow");
        tao.width(2);
        tao.up();
        tao.setPosition(x-2, y-50);
        tao.down();

        // rectangle
        for (int i = 0; i < 2; i++) {
            tao.forward(20);
            tao.left(90);
            tao.forward(60);
            tao.left(90);
        }

        // fire
        tao.penColor("orange");
        tao.up();
        tao.setPosition(x, y+10);
        tao.down();

        for (int i = 0; i < 3; i++) {
            tao.forward(15);
            tao.left(120);
        }

        // smoke
        tao.penColor("gray");
        tao.up();
        tao.setPosition(x+2, y+20);
        tao.down();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                tao.forward(1);
                tao.left(10);
            }
            tao.up();
            tao.setPosition(tao.getX()+15, tao.getY()+15);
            tao.down();
        }
    }
}
