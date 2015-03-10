package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 2.0 and later.
 */


@Mapping("NSMachPortRights")
public final class NSMachPortRights extends ObjCEnum {
    
    @GlobalConstant("NSMachPortDeallocateNone")
    public static final long None = 0L;
    @GlobalConstant("NSMachPortDeallocateSendRight")
    public static final long SendRight = 1L;
    @GlobalConstant("NSMachPortDeallocateReceiveRight")
    public static final long ReceiveRight = 2L;
    

}
