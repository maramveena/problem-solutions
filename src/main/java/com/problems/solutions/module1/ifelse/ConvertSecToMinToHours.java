package com.problems.solutions.module1.ifelse;

/**
 * Created by nandigama on 1/11/2019.
 */
public class ConvertSecToMinToHours {
    /**
     * Converting given minutes to hours , remaining minutes and seconds
     * @param min given min to calculate hours , remaining min and seconds
     * @return hours minutes seconds format "0h 0m 0s"
     */

    public String convertMinToHoursToSecs(long min) {
        if(min <= 0) {
            return null;
        }
        long hours = min / 60;
        long remMin = min % 60;
        long sec = remMin % 60;
        StringBuilder sb = new StringBuilder();
        String minString = "0" + remMin + "m";
        if(hours < 10) {
            if(remMin < 10) {
                return "0" + hours + "h " + "0" +remMin + "m " + "0" + sec + "s";
            } else {
                return "0" + hours + "h " + remMin + "m " +  "0" + sec + "s";
            }
        } else {
            if(remMin < 10) {
                return hours + "h " + "0" +remMin + "m " + "0" + sec + "s";
            } else {
                return hours + "h " + remMin + "m " + "0" + sec + "s";
            }        }
    }
    /**
     * Calculating given Seconds to minutes
     * @param sec Given seconds to calculate minutes
     * @return
     */
    public String convertSecondsToMinutes(long sec) {
        if(sec <= 0) {
            return null;
        }
        long min = sec / 60;
        long remainingSec = sec % 60;
        if(min <= 0 || min > 59) {
            return remainingSec + "m";
        }
            return min + "m" + remainingSec + "s";
    }


}
