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
@Mapping("MTLVisibilityResultMode")
public final class MTLVisibilityResultMode extends ObjCEnum {
    
    @GlobalConstant("MTLVisibilityResultModeDisabled")
    public static final long Disabled = 0L;
    @GlobalConstant("MTLVisibilityResultModeBoolean")
    public static final long Boolean = 1L;
    

}
