package apple.coretext;


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





@Library("CoreText")
@Mapping("CTUnderlinePattern")
public final class CTUnderlinePattern extends ObjCEnum {
    
    @GlobalConstant("kCTUnderlinePatternSolid")
    public static final long Solid = 0L;
    @GlobalConstant("kCTUnderlinePatternDot")
    public static final long Dot = 256L;
    @GlobalConstant("kCTUnderlinePatternDash")
    public static final long Dash = 512L;
    @GlobalConstant("kCTUnderlinePatternDashDot")
    public static final long DashDot = 768L;
    @GlobalConstant("kCTUnderlinePatternDashDotDot")
    public static final long DashDotDot = 1024L;
    

}
