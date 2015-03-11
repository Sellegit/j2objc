package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Library("CoreFoundation")
@Mapping("CFComparisonResult")
public final class CFComparisonResult extends ObjCEnum {
    
    @GlobalConstant("kCFCompareLessThan")
    public static final long LessThan = -1L;
    @GlobalConstant("kCFCompareEqualTo")
    public static final long EqualTo = 0L;
    @GlobalConstant("kCFCompareGreaterThan")
    public static final long GreaterThan = 1L;
    

}
