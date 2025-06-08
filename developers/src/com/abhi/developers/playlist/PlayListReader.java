package com.abhi.developers.playlist;

import java.util.Scanner;

public class PlayListReader {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            String[] playList={"ed-sheeran-playlist","old-hindi playlist"};
            System.out.println("enter the playlist number");
            int i=scanner.nextInt();
            if(i>playList.length-1){
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(playList[i]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
