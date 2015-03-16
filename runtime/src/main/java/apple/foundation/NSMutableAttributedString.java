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



/**
 * @since Available in iOS 3.2 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSMutableAttributedString")
public class NSMutableAttributedString 
    extends NSAttributedString 
     {

    
    
    public NSMutableAttributedString() {}
    
    
    @Mapping("mutableString")
    public native NSMutableString getMutableString();
    
    
    
    @Mapping("replaceCharactersInRange:withString:")
    public native void replace(NSRange range, String str);
    @Mapping("setAttributes:range:")
    public native void setAttributes(NSDictionary<?, ?> attrs, NSRange range);
    @Mapping("addAttribute:value:range:")
    public native void addAttribute(String name, Object value, NSRange range);
    @Mapping("addAttributes:range:")
    public native void addAttributes(NSDictionary<?, ?> attrs, NSRange range);
    @Mapping("removeAttribute:range:")
    public native void removeAttribute(String name, NSRange range);
    @Mapping("replaceCharactersInRange:withAttributedString:")
    public native void replace(NSRange range, NSAttributedString attrString);
    @Mapping("insertAttributedString:atIndex:")
    public native void insert(NSAttributedString attrString, @MachineSizedUInt long loc);
    @Mapping("appendAttributedString:")
    public native void append(NSAttributedString attrString);
    @Mapping("deleteCharactersInRange:")
    public native void delete(NSRange range);
    @Mapping("setAttributedString:")
    public native void setAttributedString(NSAttributedString attrString);
    @Mapping("beginEditing")
    public native void beginEditing();
    @Mapping("endEditing")
    public native void endEditing();
    
}
