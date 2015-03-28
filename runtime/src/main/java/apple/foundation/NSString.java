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


@Library("Foundation/Foundation.h") @Mapping("NSString")
public class NSString 
    extends NSObject 
    implements NSPropertyList {

    
    
    public NSString() {}
    @Mapping("initWithCharacters:length:")
    public NSString(Todo characters, @MachineSizedUInt long length) { }

    
    @Mapping("length")
    public native @MachineSizedUInt long length();

    
    
    @Mapping("characterAtIndex:")
    public native short getCharactersAt(@MachineSizedUInt long index);
    @Mapping("getCharacters:range:")
    public native void getCharacters(Todo buffer, NSRange aRange);
    @Mapping("hasPrefix:")
    public native boolean hasPrefix(String aString);
    @Mapping("hasSuffix:")
    public native boolean hasSuffix(String aString);
    @Mapping("dataUsingEncoding:allowLossyConversion:")
    public native NSData toData(@Representing("NSStringEncoding") long encoding, boolean lossy);
    @Mapping("dataUsingEncoding:")
    public native NSData toData(@Representing("NSStringEncoding") long encoding);
    @Mapping("writeToURL:atomically:encoding:error:")
    public native boolean writeURL(NSURL url, boolean useAuxiliaryFile, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("writeToFile:atomically:encoding:error:")
    public native boolean writeFile(String path, boolean useAuxiliaryFile, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("stringWithContentsOfURL:encoding:error:")
    public static native String readURL(NSURL url, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("stringWithContentsOfFile:encoding:error:")
    public static native String readFile(String path, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("stringByAppendingPathComponent:")
    public native String appendPathComponent(String str);
    @Mapping("stringByAppendingPathExtension:")
    public native String appendPathExtension(String str);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("stringByAddingPercentEncodingWithAllowedCharacters:")
    public native String addPercentEncoding(NSCharacterSet allowedCharacters);
    @Mapping("stringByAddingPercentEscapesUsingEncoding:")
    public native String addPercentEscapes(@Representing("NSStringEncoding") long enc);
    @Mapping("stringByReplacingPercentEscapesUsingEncoding:")
    public native String replacePercentEscapes(@Representing("NSStringEncoding") long enc);

}
