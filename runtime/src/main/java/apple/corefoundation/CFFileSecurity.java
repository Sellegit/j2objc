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
@Library("CoreFoundation/CoreFoundation.h")
public class CFFileSecurity 
    extends CFType 
     {

    
    
    protected CFFileSecurity() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityCreate")
    public static native CFFileSecurity create(CFAllocator allocator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityCreateCopy")
    public static native CFFileSecurity createCopy(CFAllocator allocator, CFFileSecurity fileSec);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityCopyOwnerUUID")
    public static native boolean copyOwnerUUID(CFFileSecurity fileSec, Todo ownerUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetOwnerUUID")
    public static native boolean setOwnerUUID(CFFileSecurity fileSec, CFUUID ownerUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityCopyGroupUUID")
    public static native boolean copyGroupUUID(CFFileSecurity fileSec, Todo groupUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetGroupUUID")
    public static native boolean setGroupUUID(CFFileSecurity fileSec, CFUUID groupUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetOwner")
    public static native boolean getOwner(CFFileSecurity fileSec, Todo owner);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetOwner")
    public static native boolean setOwner(CFFileSecurity fileSec, int owner);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetGroup")
    public static native boolean getGroup(CFFileSecurity fileSec, Todo group);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetGroup")
    public static native boolean setGroup(CFFileSecurity fileSec, int group);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetMode")
    public static native boolean getMode(CFFileSecurity fileSec, Todo mode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetMode")
    public static native boolean setMode(CFFileSecurity fileSec, short mode);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CFFileSecurityClearProperties")
    public static native boolean clearProperties(CFFileSecurity fileSec, CFFileSecurityClearOptions clearPropertyMask);
    
}
