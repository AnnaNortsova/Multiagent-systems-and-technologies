
public class Hunter {
    static int x,y;
    static boolean k;
    static int growl=5;//рычание
    static int breeze=6;//сквозняк
    static int glitter=7;//блеск
    static int bump = 8;
    // направления
    final int SOUTH = 101;
    final int NORTH = 102;
    final int WEST = 103;
    final int EAST = 104;
    int forward;
    final int FRW = 105;
    final int LEFT = 106;
    final int RIGHT = 107;
    public Hunter()
    {
        x=0;
        y=0;
    }

    public Hunter(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    int scan (int target)
    {
        int p=0;
        if(x<9)
            if(World.myWorld[x+1][y].type==target)
                p=1;
        if (x>0)
            if(World.myWorld[x-1][y].type==target)
                p=1;
        if (y<9)
            if(World.myWorld[x][y+1].type==target)
                p=1;
        if (y>0)
            if(World.myWorld[x][y-1].type==target)
                p=1;
        return p;
    }


    Point p1 = new Point();

    int step(Point p1)
    {
        System.out.print(" STEP to ");
        System.out.print(p1.x);
        System.out.print(".");
        System.out.print(p1.y);
        System.out.print("! ");
        int x_x = this.x-p1.x;
        int y_y = this.y-p1.y;
        if (x_x==0)
            if (y_y==1) this.forward=NORTH;
            else this.forward=SOUTH;
        else
        if (x_x==1)this.forward=WEST;
        else this.forward=EAST;


        this.x=p1.x;
        this.y=p1.y;
        return 0;
    }

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
