package apple.coremotion;


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






@Mapping("CMMotionActivityConfidence")
public final class CMMotionActivityConfidence extends ObjCEnum {
    
    @GlobalConstant("CMMotionActivityConfidenceLow")
    public static final long Low = 0L;
    @GlobalConstant("CMMotionActivityConfidenceMedium")
    public static final long Medium = 1L;
    @GlobalConstant("CMMotionActivityConfidenceHigh")
    public static final long High = 2L;
    

}
