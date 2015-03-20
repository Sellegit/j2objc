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
@Mapping("CMMetadataFormatDescriptionRef") @Library("CoreMedia/CoreMedia.h")
public class CMMetadataFormatDescription 
    extends CMFormatDescription 
     {

    
    
    protected CMMetadataFormatDescription() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateWithKeys")
    public static native int createWithKeys(CFAllocator allocator, @Representing("CMMetadataFormatType") long metadataType, CFArray keys, Todo outDesc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateWithMetadataSpecifications")
    public static native int createWithMetadataSpecifications(CFAllocator allocator, @Representing("CMMetadataFormatType") long metadataType, CFArray metadataSpecifications, Todo outDesc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateWithMetadataFormatDescriptionAndMetadataSpecifications")
    public static native int create(CFAllocator allocator, CMMetadataFormatDescription srcDesc, CFArray metadataSpecifications, Todo outDesc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateByMergingMetadataFormatDescriptions")
    public static native int createByMergingFormatDescriptions(CFAllocator allocator, CMMetadataFormatDescription srcDesc1, CMMetadataFormatDescription srcDesc2, Todo outDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionGetKeyWithLocalID")
    public static native CMMetadataFormatDescriptionKey getKey(CMMetadataFormatDescription desc, int localKeyID);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionGetIdentifiers")
    public static native List<String> getIdentifiers(CMMetadataFormatDescription desc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData")
    public static native int createFromBigEndianMetadataDescriptionData(CFAllocator allocator, Todo metadataDescriptionData, @MachineSizedUInt long metadataDescriptionSize, CFString metadataDescriptionFlavor, Todo metadataFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer")
    public static native int createFromBigEndianMetadataDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer metadataDescriptionBlockBuffer, CFString metadataDescriptionFlavor, Todo metadataFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer")
    public static native int copyAsBigEndianMetadataDescriptionBlockBuffer(CFAllocator allocator, CMMetadataFormatDescription metadataFormatDescription, CFString metadataDescriptionFlavor, Todo metadataDescriptionBlockBufferOut);
    
}
