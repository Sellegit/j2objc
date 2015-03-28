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
@Mapping("CMAttachmentBearerRef") @Library("CoreMedia/CoreMedia.h")
public class CMAttachmentBearer 
    extends CFType 
     {

    
    
    protected CMAttachmentBearer() {}

    
    
    
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMSetAttachment")
    public static native void setAttachment(CMAttachmentBearer target, CFString key, CFType value, @Representing("CMAttachmentMode") long attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMGetAttachment")
    public static native CFType getAttachment(CMAttachmentBearer target, CFString key, Todo attachmentModeOut);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMRemoveAttachment")
    public static native void removeAttachment(CMAttachmentBearer target, CFString key);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMRemoveAllAttachments")
    public static native void removeAllAttachments(CMAttachmentBearer target);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMCopyDictionaryOfAttachments")
    public static native CFDictionary getAttachments(CFAllocator allocator, CMAttachmentBearer target, @Representing("CMAttachmentMode") long attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMSetAttachments")
    public static native void setAttachments(CMAttachmentBearer target, CFDictionary theAttachments, @Representing("CMAttachmentMode") long attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @GlobalFunction("CMPropagateAttachments")
    public static native void propagateAttachments(CMAttachmentBearer source, CMAttachmentBearer destination);

}
