package test;

import java.util.List;

public class Bio {


    int[] L = {2,2,3,3,4,5,6,7,8};
    int[] X = {0,10};
    int y=2;

    public static void partialDigest(int[] L ){

        int width=9;
    }

    public static void place(int[] L,int[] X){


    }

    public static void delta(int y, int[]X){

    }

//    def partialDigest(L):
//    width=max(L)
//    L.remove(width)
//    X=[0,width]
//    Place(L,X)
//
//
//    def Place(L,X):
//            if (len(L)==0):
//    print(X)
//        return
//    y=max(L)
//    dyX=delta(y,X)
//    if (set(dyX).issubset(L)):
//            X.append(y)
//            for x1 in dyX:
//            L.remove(x1)
//    Place(L,X)
//        X.remove(y)
//            for x2 in dyX:
//            L.append(x2)
//    w=max(X)-y
//            dwX=delta(w,X)
//    if (set(dwX).issubset(L)):
//            X.append(w)
//            for x1 in dwX:
//            L.remove(x1)
//    Place(L,X)
//        X.remove(w)
//            for x2 in dwX:
//            L.append(x2)
//            return
//
//
//    def delta(y,X):
//    D=[]
//            for i in range(len(X)):
//    t=abs(y-X[i])
//        D.append(t)
//            return D
//
//    L=[2,2,3,3,4,5,6,7,8,10]
//    partialDigest(L)
//#0 2 4 7 10

}
