package com.hillel.pashchenko.lesson10.util;

import com.hillel.pashchenko.lesson10.exception.UserExpectedError;
import com.hillel.pashchenko.lesson10.exception.WrongFieldException;
import com.hillel.pashchenko.lesson10.exception.WrongSumException;


public class Helper {
    public void idAccountChek(String idAccountClient) throws WrongFieldException {
        int length = 10;
        if (!(idAccountClient.length() == length)){
            throw new WrongFieldException();
        }
    }

    public void sumChek(double sum) throws WrongSumException {
        if(sum > 1000){
            throw new WrongSumException();
        }
    }

    public void idAccountEquals(String idAccountSending, String idAccountReceiver){
        if(!idAccountSending.equals(idAccountReceiver)){
            throw new UserExpectedError();
        }
    }
}
