package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia")
public class CMAttachmentBearer 
    extends CFType 
     {

    
    
    protected CMAttachmentBearer() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMSetAttachment")
    public static native void setAttachment(CFType target, String key, CFType value, CMAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMGetAttachment")
    private static native CFType getAttachment(CFType target, String key, Todo attachmentModeOut);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMRemoveAttachment")
    public static native void removeAttachment(CFType target, String key);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMRemoveAllAttachments")
    public static native void removeAllAttachments(CFType target);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMCopyDictionaryOfAttachments")
    private static native CFDictionary getAttachments(CFAllocator allocator, CFType target, CMAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMSetAttachments")
    public static native void setAttachments(CFType target, CFDictionary theAttachments, CMAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMPropagateAttachments")
    public static native void propagateAttachments(CMAttachmentBearer source, CMAttachmentBearer destination);
    
}
