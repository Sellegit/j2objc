package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h") @Mapping("NSData")
public class NSData 
    extends NSObject 
    implements NSPropertyList {

    
    
    public NSData() {}
    @Mapping("initWithBytes:length:")
    public NSData(Todo bytes, @MachineSizedUInt long length) { }
    @Mapping("initWithBytesNoCopy:length:freeWhenDone:")
    public NSData(Todo bytes, @MachineSizedUInt long length, boolean b) { }
    @Mapping("initWithData:")
    public NSData(NSData data) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithBase64EncodedString:options:")
    public NSData(String base64String, @Representing("NSDataBase64DecodingOptions") @MachineSizedUInt long options) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithBase64EncodedData:options:")
    public NSData(NSData base64Data, @Representing("NSDataBase64DecodingOptions") @MachineSizedUInt long options) { }
    
    
    @Mapping("length")
    public native @MachineSizedUInt long getLength();
    
    
    
    @Mapping("getBytes:length:")
    public native void getBytes(Todo buffer, @MachineSizedUInt long length);
    @Mapping("subdataWithRange:")
    public native NSData getSubdata(NSRange range);
    @Mapping("writeToFile:atomically:")
    public native boolean writeFile(String path, boolean useAuxiliaryFile);
    @Mapping("writeToURL:atomically:")
    public native boolean write(NSURL url, boolean atomically);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("rangeOfData:options:range:")
    public native NSRange find(NSData dataToFind, @Representing("NSDataSearchOptions") @MachineSizedUInt long mask, NSRange searchRange);
    @Mapping("dataWithContentsOfFile:")
    public static native NSData readFile(String path);
    @Mapping("dataWithContentsOfURL:")
    public static native NSData read(NSURL url);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("base64EncodedStringWithOptions:")
    public native String toBase64EncodedString(@Representing("NSDataBase64EncodingOptions") @MachineSizedUInt long options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("base64EncodedDataWithOptions:")
    public native NSData toBase64EncodedData(@Representing("NSDataBase64EncodingOptions") @MachineSizedUInt long options);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("dataWithContentsOfMappedFile:")
    public static native Object readMappedFile(String path);
    
}
