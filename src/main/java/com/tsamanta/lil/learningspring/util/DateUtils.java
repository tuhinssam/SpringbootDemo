package com.tsamanta.lil.learningspring.util;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateUtils {
    public Date createDatefromDateString(String dateString){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        if(StringUtils.hasText(dateString)){
            try{
                date = dateFormat.parse(dateString);
            }catch(ParseException e){
                date = new Date();
            }
        }
        else{
            date = new Date();
        }
        return date;
    }
}
