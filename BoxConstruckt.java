package homeworks;

public class BoxConstruckt {

//  Создайте класс Box, в котором будут
//  три поля: ширина, высота, длина
//  этой коробки. Создайте внутри
//  этого класса конструктор,
//  который принимает 3 значения и
//  определяет их в вышеописанные поля,
//  помимо этого в конструкторе
//  подсчитывается объём коробки
//  и печатается на экран.

// длина    length
// ширина   width
// высота   height
// объём    volume

    public int lenght;

    public int wight;

    public int height;

    public int volume;

    public BoxConstruckt(int l, int w, int h) {

        lenght = l;
        wight = w;
        height = h;


        System.out.println("leight = " + lenght + ", wight = " + wight + ", height = " + height + ".");
        int volume = l * w * h;
        System.out.println("volume = " + volume);
    }
}