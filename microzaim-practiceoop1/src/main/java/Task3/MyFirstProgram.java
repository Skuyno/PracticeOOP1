package Task3;

class MyFirstClass {
    public static void main(String[] s) {

        MySecondClass o = new MySecondClass(2,5);

        System.out.println(o.summa());
        for(int i = 1; i <=8;i++){
            for(int j = 1; j <= 8; j++){

                o.setA(i);
                o.setB(j);

                System.out.print(o.summa());

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass{

    private int a;
    private int b;

    MySecondClass(){
        this.a = 0;
        this.b = 0;
    }

    MySecondClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int summa(){
        return a+b;
    }
}