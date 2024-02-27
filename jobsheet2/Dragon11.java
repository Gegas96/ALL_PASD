public class Dragon11 {
    int x, y, width, height;
    
    public Dragon11(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft(){

        if(x<0 || x>height){
            detectCollision();
        }else{
            x--;
        }
    }
    void moveRight(){
        
        if(x<0 || x>height){
            detectCollision();
        }else{
            x++;
        }
    }
    void moveUp(){
        
        if(y<0 || y>height){
            detectCollision();
        }else{
            y--;
        }
    }
    void moveDown(){
       
        if(y<0 || y>height){
            detectCollision();
        }else{
            y++;
        }
    }

   

    void detectCollision(){
        System.out.println("Game Over");
    }
}