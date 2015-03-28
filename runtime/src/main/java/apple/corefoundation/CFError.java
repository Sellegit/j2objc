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

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CFErrorRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFError 
    extends CFType 
     {

    
    
    protected CFError() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCreate")
    public static native CFError create(CFAllocator allocator, CFString domain, @MachineSizedSInt long code, CFDictionary userInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorGetDomain")
    public static native CFString getDomain(CFError err);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorGetCode")
    public static native @MachineSizedSInt long getCode(CFError err);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCopyUserInfo")
    public static native CFDictionary getUserInfo(CFError err);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCopyFailureReason")
    public static native CFString getFailureReason(CFError err);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCopyRecoverySuggestion")
    public static native CFString getRecoverySuggestion(CFError err);

}
