package apple.metal;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal")
@Mapping("MTLCompareFunction")
public final class MTLCompareFunction extends ObjCEnum {
    
    @GlobalConstant("MTLCompareFunctionNever")
    public static final long Never = 0L;
    @GlobalConstant("MTLCompareFunctionLess")
    public static final long Less = 1L;
    @GlobalConstant("MTLCompareFunctionEqual")
    public static final long Equal = 2L;
    @GlobalConstant("MTLCompareFunctionLessEqual")
    public static final long LessEqual = 3L;
    @GlobalConstant("MTLCompareFunctionGreater")
    public static final long Greater = 4L;
    @GlobalConstant("MTLCompareFunctionNotEqual")
    public static final long NotEqual = 5L;
    @GlobalConstant("MTLCompareFunctionGreaterEqual")
    public static final long GreaterEqual = 6L;
    @GlobalConstant("MTLCompareFunctionAlways")
    public static final long Always = 7L;
    

}
