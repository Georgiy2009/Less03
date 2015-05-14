public class Main {

    public static void main(String[] args) {
       Main program= new Main();
        program.run();

    }

    private double calc_y(double a,double b,double x){
    double xsin=Math.pow((x * x + a),2);
    double x1= Math.pow(Math.sin(xsin),3);
    double x2= Math.sqrt(x/b);
    return x1-x2;
    }

    private double calc_z(double a,double b,double x){
        double xcos=Math.pow((x  + b),3);
        double x1= Math.cos(xcos);
        double x2= x*x/a;
        return x1+x2;
    }

    private void print(double a,double b,double x,double y,double z){
        System.out.printf("a=%f b=%f x=%f\n", a, b, x);
        System.out.printf("y=%f z=%f\n", y, z);
    }

    private void  run(){
        System.out.println("Hello World!");
        double a=1.1;
        double b=0.004;
        double x=0.2;
        double y=calc_y(a,b,x);
        double z=calc_z(a,b,x);
        print(a,b,x,y,z);
    }
}
