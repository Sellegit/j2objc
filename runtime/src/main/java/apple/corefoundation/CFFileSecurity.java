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
    public native boolean copyOwnerUUID(Todo ownerUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetOwnerUUID")
    public native boolean setOwnerUUID(CFUUID ownerUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityCopyGroupUUID")
    public native boolean copyGroupUUID(Todo groupUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetGroupUUID")
    public native boolean setGroupUUID(CFUUID groupUUID);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetOwner")
    public native boolean getOwner(Todo owner);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetOwner")
    public native boolean setOwner(int owner);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetGroup")
    public native boolean getGroup(Todo group);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetGroup")
    public native boolean setGroup(int group);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecurityGetMode")
    public native boolean getMode(Todo mode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFFileSecuritySetMode")
    public native boolean setMode(short mode);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CFFileSecurityClearProperties")
    public native boolean clearProperties(CFFileSecurityClearOptions clearPropertyMask);
    
}
