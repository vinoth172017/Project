package autotest.commonUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class JavaUtil {

    public String getdate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getdate_YYYYMMDD() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void compareArray(ArrayList<Object> array1, ArrayList<Object> array2) {
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array2.get(i).equals(array1.get(j)))
                    System.out.println("equal" + array2.get(j));
            }
        }
    }
}
