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

@Library("Metal/Metal.h")
@Mapping("MTLWinding")
public final class MTLWinding extends ObjCEnum {
    
    @GlobalConstant("MTLWindingClockwise")
    public static final long Clockwise = 0L;
    @GlobalConstant("MTLWindingCounterClockwise")
    public static final long CounterClockwise = 1L;
    

}
