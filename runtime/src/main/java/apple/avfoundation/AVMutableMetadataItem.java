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

@Library("AVFoundation") @Mapping("AVMutableMetadataItem")
public class AVMutableMetadataItem 
    extends AVMetadataItem 
     {

    
    
    public AVMutableMetadataItem() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setIdentifier(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("extendedLanguageTag")
    public native String getExtendedLanguageTag();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setExtendedLanguageTag(String v);
    @Mapping("locale")
    public native NSLocale getLocale();
    public native void setLocale(NSLocale v);
    @Mapping("time")
    public native CMTime getTime();
    public native void setTime(CMTime v);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("duration")
    public native CMTime getDuration();
    /**
     * @since Available in iOS 4.2 and later.
     */
    public native void setDuration(CMTime v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("dataType")
    public native CMMetadataDataType getDataType();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setDataType(CMMetadataDataType v);
    @Mapping("value")
    public native NSObject getValue();
    public native void setValue(NSObject v);
    @Mapping("extraAttributes")
    public native AVMetadataExtraAttributes getExtraAttributes();
    public native void setExtraAttributes(AVMetadataExtraAttributes v);
    @Mapping("keySpace")
    public native AVMetadataKeySpace getKeySpace();
    public native void setKeySpace(AVMetadataKeySpace v);
    @Mapping("key")
    public native Todo getKey();
    public native void setKey(Todo v);
    
    
    
    @Mapping("metadataItem")
    public static native AVMutableMetadataItem create();
    
}
