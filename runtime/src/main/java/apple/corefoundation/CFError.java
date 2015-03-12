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
@Library("CoreFoundation")
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
    protected static native CFError create(CFAllocator allocator, String domain, @MachineSizedSInt long code, CFDictionary userInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorGetDomain")
    public native String getDomain();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorGetCode")
    public native @MachineSizedSInt long getCode();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCopyUserInfo")
    public native CFDictionary getUserInfo();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCopyFailureReason")
    public native String getFailureReason();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFErrorCopyRecoverySuggestion")
    public native String getRecoverySuggestion();
    
}
