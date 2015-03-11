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





@Library("Foundation") @Mapping("NSMutableString")
public class NSMutableString 
    extends NSString 
     {

    
    
    public NSMutableString() {}
    @Mapping("initWithCoder:")
    public NSMutableString(NSCoder aDecoder) { }
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
