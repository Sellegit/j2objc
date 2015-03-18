package apple.corevideo;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.opengles.*;
import apple.coremedia.*;





@Mapping("CVTime") @Library("CoreVideo/CoreVideo.h")
public class CVTime 
    extends Struct 
     {

    
    private CVTime() {}
    
    
    @DotMapping("timeValue")
    public native long getTimeValue();
    @DotMapping("timeScale")
    public native int getTimeScale();
    @DotMapping("flags")
    public native int getFlags();
    
    public static native CVTime create(long timeValue, int timeScale, int flags) /*-[
        CVTime __new = { .timeValue = timeValue, .timeScale = timeScale, .flags = flags };
        return __new;
    ]-*/;
    public static native CVTime copyWithtimeValue(CVTime original, long timeValue) /*-[
        CVTime __new = { .timeValue = timeValue, .timeScale = original.timeScale, .flags = original.flags };
        return __new;
    ]-*/;

    
    public static native CVTime copyWithtimeScale(CVTime original, int timeScale) /*-[
        CVTime __new = { .timeValue = original.timeValue, .timeScale = timeScale, .flags = original.flags };
        return __new;
    ]-*/;

    
    public static native CVTime copyWithflags(CVTime original, int flags) /*-[
        CVTime __new = { .timeValue = original.timeValue, .timeScale = original.timeScale, .flags = flags };
        return __new;
    ]-*/;

    
}
