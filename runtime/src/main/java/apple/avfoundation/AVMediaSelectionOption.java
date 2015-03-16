package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVMediaSelectionOption")
public class AVMediaSelectionOption 
    extends NSObject 
    implements NSCopying {

    
    
    public AVMediaSelectionOption() {}
    
    
    @Mapping("mediaType")
    public native AVMediaType getMediaType();
    @Mapping("mediaSubTypes")
    public native NSArray<NSNumber> getMediaSubTypes();
    @Mapping("isPlayable")
    public native boolean isPlayable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Mapping("locale")
    public native NSLocale getLocale();
    @Mapping("commonMetadata")
    public native NSArray<AVMetadataItem> getCommonMetadata();
    @Mapping("availableMetadataFormats")
    public native List<AVMetadataFormat> getAvailableMetadataFormats();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("displayName")
    public native String getDisplayName();
    
    
    
    @Mapping("hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(String mediaCharacteristic);
    @Mapping("metadataForFormat:")
    public native NSArray<AVMetadataItem> getMetadata(String format);
    @Mapping("associatedMediaSelectionOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption getAssociatedMediaSelectionOption(AVMediaSelectionGroup mediaSelectionGroup);
    @Mapping("propertyList")
    public native NSPropertyList getPropertyList();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("displayNameWithLocale:")
    public native String getDisplayName(NSLocale locale);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
