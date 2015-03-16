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
@Mapping("MTLLoadAction")
public final class MTLLoadAction extends ObjCEnum {
    
    @GlobalConstant("MTLLoadActionDontCare")
    public static final long DontCare = 0L;
    @GlobalConstant("MTLLoadActionLoad")
    public static final long Load = 1L;
    @GlobalConstant("MTLLoadActionClear")
    public static final long Clear = 2L;
    

}
