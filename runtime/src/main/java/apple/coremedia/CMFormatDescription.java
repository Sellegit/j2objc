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
public class CMFormatDescription 
    extends CFType 
     {

    
    
    protected CMFormatDescription() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionCreate")
    protected static native int create(CFAllocator allocator, CMMediaType mediaType, int mediaSubtype, NSDictionary<?, ?> extensions, Todo descOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionEqual")
    public native boolean equalsTo(CMFormatDescription desc2);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("CMFormatDescriptionEqualIgnoringExtensionKeys")
    private native boolean equalsTo(CMFormatDescription desc2, CFType formatDescriptionExtensionKeysToIgnore, CFType sampleDescriptionExtensionAtomKeysToIgnore);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetMediaType")
    public native CMMediaType getMediaType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetMediaSubType")
    public native int getMediaSubType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetExtensions")
    public native CFDictionary getExtensionDictionary();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMFormatDescriptionGetExtension")
    public native CFType getExtension(String extensionKey);
    
}
