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





@Library("CoreMotion/CoreMotion.h")
@Mapping("CMAttitudeReferenceFrame")
public final class CMAttitudeReferenceFrame extends ObjCEnum {
    
    @GlobalConstant("CMAttitudeReferenceFrameXArbitraryZVertical")
    public static final long ArbitraryZVertical = 1L;
    @GlobalConstant("CMAttitudeReferenceFrameXArbitraryCorrectedZVertical")
    public static final long ArbitraryCorrectedZVertical = 2L;
    @GlobalConstant("CMAttitudeReferenceFrameXMagneticNorthZVertical")
    public static final long MagneticNorthZVertical = 4L;
    @GlobalConstant("CMAttitudeReferenceFrameXTrueNorthZVertical")
    public static final long TrueNorthZVertical = 8L;
    

}
