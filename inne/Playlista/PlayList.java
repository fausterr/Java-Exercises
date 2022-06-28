package TabliceISterowanie.Playlista;

import java.time.Duration;

public class PlayList {

    public static int playlistLength(Song...songs) {
        int result = 0;
        for(Song song: songs) {
            result += song.getLength();
        }
        return result;
    }

    public static String getFormattedTime(int seconds) {
       int hours = seconds/3600;
       seconds %= 3600;
       int minutes = seconds/60;
       seconds %= 60;
       String hoursForm = formatString(hours);
       String minutesForm = formatString(minutes);
       String secondsForm = formatString(seconds);
       return hoursForm + ":" + minutesForm+ ":" + secondsForm;
    }

    private static String formatString(int h) {
        if (h == 0)  {
            return "00";
        } else if (h < 10) {
            return "0" + h;
        } else {
            return Integer.toString(h);
        }
    }

    public static String getFormattedTime2(int seconds) {
        Duration duration = Duration.ofSeconds(seconds);
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
        return formatString(hours) + ":" + formatString(minutes) + ":" + formatString(seconds);
    }
}
