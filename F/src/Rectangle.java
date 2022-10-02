class Rectangle extends Figure{
    private float width;
    private float height;

    // конструктор с обращением к конструктору класса Figure
    Rectangle(float x, float y){

        super(x,y);
    }

    public float getPerimeter() {

        while (x >= 1) {
            int j = 1;
            while (j <= x) {
                System.out.print(" +");
                j++;
            }
            System.out.println("");
            x--;
        }
        return 0;
    }

}

