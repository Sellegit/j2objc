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
@Mapping("CVSMPTETimeFlag")
public final class CVSMPTETimeFlag extends ObjCEnum {
    
    @GlobalConstant("kCVSMPTETimeValid")
    public static final long Valid = 1L;
    @GlobalConstant("kCVSMPTETimeRunning")
    public static final long Running = 2L;
    

}
