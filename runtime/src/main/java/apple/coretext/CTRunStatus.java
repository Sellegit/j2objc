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






@Mapping("CTRunStatus")
public final class CTRunStatus extends ObjCEnum {
    
    @GlobalConstant("kCTRunStatusNoStatus")
    public static final long NoStatus = 0L;
    @GlobalConstant("kCTRunStatusRightToLeft")
    public static final long RightToLeft = 1L;
    @GlobalConstant("kCTRunStatusNonMonotonic")
    public static final long NonMonotonic = 2L;
    @GlobalConstant("kCTRunStatusHasNonIdentityMatrix")
    public static final long HasNonIdentityMatrix = 4L;
    

}
