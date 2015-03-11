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
import apple.metal.*;





@Mapping("CVTimeStamp")
public class CVTimeStamp 
    extends Struct 
     {

    
    protected CVTimeStamp() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("videoTimeScale")
    public native int getVideoTimeScale();
    @DotMapping("videoTime")
    public native long getVideoTime();
    @DotMapping("hostTime")
    public native long getHostTime();
    @DotMapping("rateScalar")
    public native double getRateScalar();
    @DotMapping("videoRefreshPeriod")
    public native long getVideoRefreshPeriod();
    @DotMapping("smpteTime")
    public native CVSMPTETime getSmpteTime();
    @DotMapping("flags")
    public native long getFlags();
    @DotMapping("reserved")
    public native long getReserved();
    
    public static native CVTimeStamp create(int version, int videoTimeScale, long videoTime, long hostTime, double rateScalar, long videoRefreshPeriod, CVSMPTETime smpteTime, long flags, long reserved) /*-[
        CVTimeStamp __new = { .version = version, .videoTimeScale = videoTimeScale, .videoTime = videoTime, .hostTime = hostTime, .rateScalar = rateScalar, .videoRefreshPeriod = videoRefreshPeriod, .smpteTime = smpteTime, .flags = flags, .reserved = reserved };
        return __new;
    ]-*/;
    public static native CVTimeStamp copyWithversion(CVTimeStamp original, int version) /*-[
        original.version = version;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithvideoTimeScale(CVTimeStamp original, int videoTimeScale) /*-[
        original.videoTimeScale = videoTimeScale;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithvideoTime(CVTimeStamp original, long videoTime) /*-[
        original.videoTime = videoTime;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithhostTime(CVTimeStamp original, long hostTime) /*-[
        original.hostTime = hostTime;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithrateScalar(CVTimeStamp original, double rateScalar) /*-[
        original.rateScalar = rateScalar;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithvideoRefreshPeriod(CVTimeStamp original, long videoRefreshPeriod) /*-[
        original.videoRefreshPeriod = videoRefreshPeriod;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithsmpteTime(CVTimeStamp original, CVSMPTETime smpteTime) /*-[
        original.smpteTime = smpteTime;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithflags(CVTimeStamp original, long flags) /*-[
        original.flags = flags;
        return __new;
    ]-*/;

    
    public static native CVTimeStamp copyWithreserved(CVTimeStamp original, long reserved) /*-[
        original.reserved = reserved;
        return __new;
    ]-*/;

    
}
