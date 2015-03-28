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
@Mapping("NSDataBase64DecodingOptions")
public final class NSDataBase64DecodingOptions extends ObjCEnum {
    
    @GlobalConstant("NSDataBase64DecodingIgnoreUnknownCharacters")
    public static final long IgnoreUnknownCharacters = 1L;


}
