import ucar.ma2.InvalidRangeException;

import java.io.IOException;

/**
 * Created by 朱宇斌 on 2018/4/10
 */

public class NetCDFMergeTest {
    public static void main(String args[]) {
        try {
            NetCDFMerge.thflxMerge();
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidRangeException e) {
            e.printStackTrace();
        }
    }
}
