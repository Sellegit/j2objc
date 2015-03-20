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
@Library("CoreMedia/CoreMedia.h")
public class CMFormatDescription 
    extends CFType 
     {

    
    
    protected CMFormatDescription() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionCreate")
    public static native int create(CFAllocator allocator, @Representing("CMMediaType") long mediaType, int mediaSubtype, NSDictionary<?, ?> extensions, Todo descOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionEqual")
    public static native boolean equalsTo(CMFormatDescription desc1, CMFormatDescription desc2);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("CMFormatDescriptionEqualIgnoringExtensionKeys")
    public static native boolean equalsTo(CMFormatDescription desc1, CMFormatDescription desc2, CFType formatDescriptionExtensionKeysToIgnore, CFType sampleDescriptionExtensionAtomKeysToIgnore);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetMediaType")
    public static native CMMediaType getMediaType(CMFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetMediaSubType")
    public static native int getMediaSubType(CMFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetExtensions")
    public static native CFDictionary getExtensionDictionary(CMFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetExtension")
    public static native CFType getExtension(CMFormatDescription desc, String extensionKey);
    
}
