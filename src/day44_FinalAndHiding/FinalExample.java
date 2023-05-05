package day44_FinalAndHiding;

public class FinalExample {

  public  final int X=5;
  public  int y;


FinalExample(){

}
FinalExample(int y){

    this.y=y;
}


    int method(){
     final int Z=5;
       //  X=X+2;
        return X*5*Z;
    }


}
