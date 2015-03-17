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





@Mapping("CVTimeStamp") @Library("CoreVideo/CoreVideo.h")
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
    
    
}
