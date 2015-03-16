package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h")
@Mapping("NSGlyphProperty")
public final class NSGlyphProperty extends ObjCEnum {
    
    @GlobalConstant("NSGlyphPropertyNull")
    public static final long Null = 1L;
    @GlobalConstant("NSGlyphPropertyControlCharacter")
    public static final long ControlCharacter = 2L;
    @GlobalConstant("NSGlyphPropertyElastic")
    public static final long Elastic = 4L;
    @GlobalConstant("NSGlyphPropertyNonBaseCharacter")
    public static final long NonBaseCharacter = 8L;
    

}
