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





@Library("CoreVideo")
@Mapping("CVTimeStampFlag")
public final class CVTimeStampFlag extends ObjCEnum {
    
    @GlobalConstant("kCVTimeStampVideoTimeValid")
    public static final long VideoTimeValid = 1L;
    @GlobalConstant("kCVTimeStampHostTimeValid")
    public static final long HostTimeValid = 2L;
    @GlobalConstant("kCVTimeStampSMPTETimeValid")
    public static final long SMPTETimeValid = 4L;
    @GlobalConstant("kCVTimeStampVideoRefreshPeriodValid")
    public static final long VideoRefreshPeriodValid = 8L;
    @GlobalConstant("kCVTimeStampRateScalarValid")
    public static final long RateScalarValid = 16L;
    @GlobalConstant("kCVTimeStampTopField")
    public static final long TopField = 65536L;
    @GlobalConstant("kCVTimeStampBottomField")
    public static final long BottomField = 131072L;
    

}
