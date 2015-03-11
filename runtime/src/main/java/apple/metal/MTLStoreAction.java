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
@Mapping("MTLStoreAction")
public final class MTLStoreAction extends ObjCEnum {
    
    @GlobalConstant("MTLStoreActionDontCare")
    public static final long DontCare = 0L;
    @GlobalConstant("MTLStoreActionStore")
    public static final long Store = 1L;
    @GlobalConstant("MTLStoreActionMultisampleResolve")
    public static final long MultisampleResolve = 2L;
    

}
