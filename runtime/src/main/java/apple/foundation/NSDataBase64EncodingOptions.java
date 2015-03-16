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
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation/Foundation.h")
@Mapping("NSDataBase64EncodingOptions")
public final class NSDataBase64EncodingOptions extends ObjCEnum {
    
    @GlobalConstant("NSDataBase64Encoding64CharacterLineLength")
    public static final long _64CharacterLineLength = 1L;
    @GlobalConstant("NSDataBase64Encoding76CharacterLineLength")
    public static final long _76CharacterLineLength = 2L;
    @GlobalConstant("NSDataBase64EncodingEndLineWithCarriageReturn")
    public static final long EndLineWithCarriageReturn = 16L;
    @GlobalConstant("NSDataBase64EncodingEndLineWithLineFeed")
    public static final long EndLineWithLineFeed = 32L;
    

}
