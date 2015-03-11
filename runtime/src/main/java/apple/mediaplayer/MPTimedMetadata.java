package apple.mediaplayer;


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
import apple.uikit.*;



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("MediaPlayer") @Mapping("MPTimedMetadata")
public class MPTimedMetadata 
    extends NSObject 
     {

    
    
    public MPTimedMetadata() {}
    
    
    @Mapping("key")
    public native String getKey();
    @Mapping("keyspace")
    public native String getKeyspace();
    @Mapping("value")
    public native Object getValue();
    @Mapping("timestamp")
    public native double getTimestamp();
    @Mapping("allMetadata")
    public native NSDictionary<NSString, NSObject> getAllMetadata();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataKeyName")
    protected static native NSString Name();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataKeyInfo")
    protected static native NSString Info();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataKeyMIMEType")
    protected static native NSString MIMEType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataKeyDataType")
    protected static native NSString DataType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataKeyLanguageCode")
    protected static native NSString LanguageCode();
    
    
    
}
