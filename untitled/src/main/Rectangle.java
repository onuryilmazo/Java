package main;

public class Rectangle {
    /*
    nesnelerin birbirleriyle veya yılanın başı ile çarpışıp çarpışmadığını kontrol etmek için intersects metodunu kullanabilirsiniz.
    Yani, Rectangle sınıfı, oyun tahtasındaki farklı nesnelerin pozisyonlarını ve çarpışma mantığını temsil etmek için kullanılabilir.
    */
    private int posx;
    private int posy;

    public static final int rec_width = 25;
    public static final int rec_height = 25;

    public Rectangle(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }
    public boolean intersects(Rectangle r2) {
        /*
        return true if x and y coordinates of this and r2 are the same
        * */
        return this.posx == r2.getPosx() && this.posy == r2.getPosy();
    }

    public int getPosx(){
        return this.posx;
    }
    public int getPosy(){
        return this.posy;
    }
    public void setPosx(int increment) {this.posx = this.posx + increment;}
    public void setPosy(int increment) {this.posy = this.posy + increment;}
}
