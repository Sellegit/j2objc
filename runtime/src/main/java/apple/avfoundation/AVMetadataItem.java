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
 * @since Available in iOS 4.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVMetadataItem")
public class AVMetadataItem 
    extends NSObject 
    implements AVAsynchronousKeyValueLoading, NSCopying {

    
    
    public AVMetadataItem() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Mapping("locale")
    public native NSLocale getLocale();
    @Mapping("time")
    public native CMTime getTime();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("duration")
    public native CMTime getDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("dataType")
    public native CMMetadataDataType getDataType();
    @Mapping("value")
    public native NSObject getValue();
    @Mapping("extraAttributes")
    public native AVMetadataExtraAttributes getExtraAttributes();
    @Mapping("stringValue")
    public native String getStringValue();
    @Mapping("numberValue")
    public native NSNumber getNumberValue();
    @Mapping("dateValue")
    public native NSDate getDateValue();
    @Mapping("dataValue")
    public native NSData getDataValue();
    @Mapping("key")
    public native Todo getKey();
    @Mapping("commonKey")
    public native Todo getCommonKey();
    @Mapping("keySpace")
    public native AVMetadataKeySpace getKeySpace();
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("statusOfValueForKey:error:")
    public native @Representing("AVKeyValueStatus") @MachineSizedSInt long getStatusOfValue(String key, Todo outError);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(NSArray<?> keys, @Block Runnable handler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByPreferredLanguages(NSArray<?> metadataItems, NSArray<?> preferredLanguages);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("metadataItemsFromArray:filteredByIdentifier:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByIdentifier(NSArray<?> metadataItems, String identifier);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("metadataItemsFromArray:filteredByMetadataItemFilter:")
    public static native NSArray<AVMetadataItem> filterMetadataItems(NSArray<?> metadataItems, AVMetadataItemFilter metadataItemFilter);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("identifierForKey:keySpace:")
    public static native String getIdentifierForKey(Object key, String keySpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("keySpaceForIdentifier:")
    public static native AVMetadataKeySpace getKeySpaceForIdentifier(String identifier);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("keyForIdentifier:")
    public static native Object getKeyForIdentifier(String identifier);
    @Mapping("metadataItemsFromArray:withLocale:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByLocale(NSArray<?> metadataItems, NSLocale locale);
    @Mapping("metadataItemsFromArray:withKey:keySpace:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByKey(NSArray<?> metadataItems, Object key, String keySpace);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
