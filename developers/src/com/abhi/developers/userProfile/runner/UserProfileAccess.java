package com.abhi.developers.userProfile.runner;

import com.abhi.developers.userProfile.exception.NickNameNotFound;

public class UserProfileAccess {
    public static void main(String[] args) {
        String nickName="abhi";
        try{
            if(nickName==null){
                throw new NickNameNotFound("nickname is null");

            }else {
                System.out.println(nickName);
            }
        } catch (NickNameNotFound e) {
            e.printStackTrace();
        }
    }
}
