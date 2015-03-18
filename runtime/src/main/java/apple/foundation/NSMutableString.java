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





@Library("Foundation/Foundation.h") @Mapping("NSMutableString")
public class NSMutableString 
    extends NSString 
     {

    
    
    @Mapping("init")
    public NSMutableString() { }
    @Mapping("initWithCoder:")
    public NSMutableString(NSCoder aDecoder) { }
    @Mapping("initWithCharacters:length:")
    public NSMutableString(Todo characters, @MachineSizedUInt long length) { }
    @Mapping("initWithUTF8String:")
    public NSMutableString(Todo nullTerminatedCString) { }
    @Mapping("initWithString:")
    public NSMutableString(String aString) { }
    @Mapping("initWithData:encoding:")
    public NSMutableString(NSData data, @Representing("NSStringEncoding") int encoding) { }
    @Mapping("initWithBytes:length:encoding:")
    public NSMutableString(Todo bytes, @MachineSizedUInt long len, @Representing("NSStringEncoding") int encoding) { }
    @Mapping("initWithCString:encoding:")
    public NSMutableString(Todo nullTerminatedCString, @Representing("NSStringEncoding") int encoding) { }
    @Mapping("initWithContentsOfURL:encoding:error:")
    public NSMutableString(NSURL url, @Representing("NSStringEncoding") int enc, Todo error) { }
    @Mapping("initWithContentsOfFile:encoding:error:")
    public NSMutableString(String path, @Representing("NSStringEncoding") int enc, Todo error) { }
    @Mapping("initWithContentsOfURL:usedEncoding:error:")
    public NSMutableString(NSURL url, Todo enc, Todo error) { }
    @Mapping("initWithContentsOfFile:usedEncoding:error:")
    public NSMutableString(String path, Todo enc, Todo error) { }
    @Mapping("initWithCapacity:")
    public NSMutableString(@MachineSizedUInt long capacity) { }
    
    
    
    
    
    
    @Mapping("replaceCharactersInRange:withString:")
    public native void replaceCharacters(NSRange range, String aString);
    @Mapping("insertString:atIndex:")
    public native void insert(String aString, @MachineSizedUInt long loc);
    @Mapping("deleteCharactersInRange:")
    public native void deleteCharacters(NSRange range);
    @Mapping("appendString:")
    public native void append(String aString);
    @Mapping("setString:")
    public native void setString(String aString);
    @Mapping("replaceOccurrencesOfString:withString:options:range:")
    public native @MachineSizedUInt long replaceAll(String target, String replacement, @Representing("NSStringCompareOptions") @MachineSizedUInt long options, NSRange searchRange);
    
}
